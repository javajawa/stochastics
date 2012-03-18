package networkssim;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import networkssim.statistics.RealsSample;
import networkssim.statistics.Sample;
import networkssim.statistics.Statistic;

public class ResultAggregator2Free
{
	static final TreeMap<Integer, Map<Integer, Statistic<Integer>>> arrivals = new TreeMap<Integer, Map<Integer, Statistic<Integer>>>();
	static final TreeMap<Integer, Map<Integer, Statistic<Integer>>> completions = new TreeMap<Integer, Map<Integer, Statistic<Integer>>>();
	static final TreeMap<Integer, Map<Integer, Statistic<Double>>> queue = new TreeMap<Integer, Map<Integer, Statistic<Double>>>();

	static final Pattern p = Pattern.compile("([0-9.]+)", Pattern.CASE_INSENSITIVE);

	@SuppressWarnings("UseOfSystemOutOrSystemErr")
	public static void main(String[] args) throws IOException
	{
		final BufferedReader f = new BufferedReader(new FileReader("Z:/tmp/networks4/betas.tsv"));
		long i = 0;

		while (f.ready())
			try
			{
				++i;
				process(f.readLine());
			}
			catch (Throwable ex)
			{
				throw new Error("Error on line " + i, ex);
			}


		f.close();

		final BufferedWriter w = new BufferedWriter(new FileWriter("Z:/tmp/networks4/betas-aggregate.tsv"));

		output(w, queue);
		output(w, completions);
		output(w, arrivals);

		w.close();
		System.out.println(i + " lines processed");
	}

	private static void process(String readLine)
	{
		if (readLine.trim().length() == 0) return;
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

	static <T,U> void mapSample(Map<T, Map<U, Statistic<Integer>>> m, T t, U u, int s)
	{
		if (!m.containsKey(t))
			m.put(t, new TreeMap<U, Statistic<Integer>>());
		if (!m.get(t).containsKey(u))
			m.get(t).put(u, (Statistic<Integer>)new Sample());

		m.get(t).get(u).observed(s);
	}

	static <T,U> void mapSample(Map<T, Map<U, Statistic<Double>>> m, T t, U u, double s)
	{
		if (!m.containsKey(t))
			m.put(t, new TreeMap<U, Statistic<Double>>());
		if (!m.get(t).containsKey(u))
			m.get(t).put(u, new RealsSample());

		m.get(t).get(u).observed(s);
	}

	private static <T extends Number> void output(BufferedWriter w, Map<Integer, Map<Integer, Statistic<T> > >  m) throws IOException
	{
		Set<Integer> keySet = new HashSet<Integer>(Arrays.asList(1,2,4,8)); //m.values().iterator().next().keySet();
		for (Integer j : keySet)
			w.append(String.format("\t%10.4f",(double)j/100));
		w.append('\n');

		for (Entry<Integer, Map<Integer, Statistic<T>>> n : m.entrySet())
		{
			w.append(String.format("%5.4f", (double)n.getKey()/100));
			for (Integer i : keySet)
				if (!n.getValue().containsKey(i))
				{
					w.append('\t');
				}
				else
				{
					Statistic<T> s = n.getValue().get(i);
					w.append(String.format("\t%10.4f", s.sampleMean()));
				}
			w.newLine();
		}
		w.newLine();
		for (Entry<Integer, Map<Integer, Statistic<T>>> n : m.entrySet())
		{
			w.append(String.format("%5.4f", (double)n.getKey()/100));
			for (Integer i : keySet)
				if (!n.getValue().containsKey(i))
				{
					w.append('\t');
				}
				else
				{
					Statistic<T> s = n.getValue().get(i);
					w.append(String.format("\t%10.4f", Math.sqrt(s.sampleVariance()) * 1.96));
				}
			w.newLine();
		}
		w.newLine();
	}
	private ResultAggregator2Free()
	{
	}
}
