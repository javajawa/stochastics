package networkssim;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import networkssim.statistics.RealsSample;
import networkssim.statistics.Sample;

public class ResultAggregator
{
	static final Map<Integer, Sample> arrivals = new TreeMap<Integer, Sample>();
	static final Map<Integer, Sample> completions = new TreeMap<Integer, Sample>();
	static final Map<Integer, RealsSample> queue = new TreeMap<Integer, RealsSample>();

	static final Pattern p = Pattern.compile("([0-9.]+)", Pattern.CASE_INSENSITIVE);

	@SuppressWarnings("UseOfSystemOutOrSystemErr")
	public static void main(String[] args) throws IOException
	{
		final BufferedReader f = new BufferedReader(new FileReader("Z:/tmp/megaout"));

		while (f.ready())
			process(f.readLine());

		f.close();

		final BufferedWriter w = new BufferedWriter(new FileWriter("Z:/tmp/aggregate"));

		for (Integer i : queue.keySet())
		{
			w.append(String.format("%5.4f\t%10.4f\t%10.4f\t%10.4f\t%10.4f\t%10.4f\t%10.4f\n",
				(double)i/100,
				arrivals.get(i).sampleMean(),
				Math.sqrt(arrivals.get(i).sampleVariance()) * 1.96,
				completions.get(i).sampleMean(),
				Math.sqrt(completions.get(i).sampleVariance()) * 1.96,
				queue.get(i).sampleMean(),
				Math.sqrt(queue.get(i).sampleVariance()) * 1.96
			));
		}

		w.close();
	}

	private static void process(String readLine)
	{
		Matcher m = p.matcher(readLine);

		m.find();
		int i = ((Double)(Double.valueOf(m.group()) * 100)).intValue();

		m.find();
		mapSample(arrivals, i, Integer.parseInt(m.group()));
		m.find();
		mapSample(completions, i, Integer.parseInt(m.group()));
		m.find();
		mapSample(queue, i, Double.parseDouble(m.group()));
	}

	static <T> void mapSample(Map<T, Sample> m, T t, int s)
	{
		if (!m.containsKey(t))
			m.put(t, new Sample());

		m.get(t).observed(s);
	}

	static <T> void mapSample(Map<T, RealsSample> m, T t, double s)
	{
		if (!m.containsKey(t))
			m.put(t, new RealsSample());

		m.get(t).observed(s);
	}

	private ResultAggregator()
	{
	}
}
