package networkssim;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import networkssim.statistics.RealsSample;
import networkssim.statistics.Sample;
import networkssim.statistics.Statistic;

public class ResultAggregator2Free
{
	static final TreeMap<Integer, Map<Integer, Sample>> arrivals = new TreeMap<Integer, Map<Integer, Sample>>();
	static final TreeMap<Integer, Map<Integer, Sample>> completions = new TreeMap<Integer, Map<Integer, Sample>>();
	static final TreeMap<Integer, Map<Integer, RealsSample>> queue = new TreeMap<Integer, Map<Integer, RealsSample>>();

	static final Pattern p = Pattern.compile("([0-9.]+)", Pattern.CASE_INSENSITIVE);

	@SuppressWarnings("UseOfSystemOutOrSystemErr")
	public static void main(String[] args) throws IOException
	{
		final BufferedReader f = new BufferedReader(new FileReader("Z:/tmp/megaout"));

		while (f.ready())
			process(f.readLine());

		f.close();

		final BufferedWriter w = new BufferedWriter(new FileWriter("Z:/tmp/aggregate"));

		output(w, queue);

		w.close();
	}

	private static void process(String readLine)
	{
		Matcher m = p.matcher(readLine);

		m.find();
		int i = ((Double)(Double.valueOf(m.group()) * 100)).intValue();
		m.find();
		int j = ((Double)(Double.valueOf(m.group()) * 100)).intValue();
		m.find();
		mapSample(arrivals, i, j, Integer.parseInt(m.group()));
		m.find();
		mapSample(completions, i, j, Integer.parseInt(m.group()));
		m.find();
		mapSample(queue, i, j, Double.parseDouble(m.group()));
	}

	static <T,U> void mapSample(Map<T, Map<U, Sample>> m, T t, U u, int s)
	{
		if (!m.containsKey(t))
			m.put(t, new TreeMap<U, Sample>());
		if (!m.get(t).containsKey(u))
			m.get(t).put(u, new Sample());

		m.get(t).get(u).observed(s);
	}

	static <T,U> void mapSample(Map<T, Map<U, RealsSample>> m, T t, U u, double s)
	{
		if (!m.containsKey(t))
			m.put(t, new TreeMap<U, RealsSample>());
		if (!m.get(t).containsKey(u))
			m.get(t).put(u, new RealsSample());

		m.get(t).get(u).observed(s);
	}

	private static void output(BufferedWriter w, TreeMap<Integer, Map<Integer, RealsSample>> m) throws IOException
	{
		for (Integer j : m.firstEntry().getValue().keySet())
			w.append(String.format("\t%10.4f",(double)j/100));
		w.append('\n');

		for (Entry<Integer, Map<Integer, RealsSample>> n : m.entrySet())
		{
			w.append(String.format("%5.4f", (double)n.getKey()/100));
			for (Statistic<Double> s : n.getValue().values())
				w.append(String.format("\t%10.4f", s.sampleMean()));
			w.newLine();
		}
		w.newLine();
		for (Entry<Integer, Map<Integer, RealsSample>> n : m.entrySet())
		{
			w.append(String.format("%5.4f", (double)n.getKey()/100));
			for (Statistic<Double> s : n.getValue().values())
				w.append(String.format("\t%10.4f", Math.sqrt(s.sampleVariance()) * 1.96));
			w.newLine();
		}
	}

	private ResultAggregator2Free()
	{
	}
}
