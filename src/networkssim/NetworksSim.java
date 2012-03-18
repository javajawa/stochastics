package networkssim;

import java.io.IOException;
import java.io.PrintStream;
import networkssim.entropy.Distribution;
import networkssim.entropy.implementations.Poisson;
import networkssim.sets.Domain;
import networkssim.simulations.SlottedAloha;
import networkssim.statistics.QueueStatistic;
import networkssim.sets.DoubleRange;
import networkssim.sets.IntRange;

public class NetworksSim
{
	/**
	 * @param args the command line arguments
	 */
	@SuppressWarnings({"UseOfSystemOutOrSystemErr", "CallToThreadRun"})
	public static void main(String[] args) throws IOException
	{
		PrintStream p = new PrintStream("Z:/tmp/networks4/new-fine.tsv");

		for (Integer i : new IntRange(0, 500))
		{
		for (Double lambda : new DoubleRange(0.01, 0.40, 0.0025))
		{
			SlottedAloha sim = new SlottedAloha(new Poisson(lambda), optimalDist(lambda), 10000);

			sim.run();
			QueueStatistic blockingStatistics = sim.getBlockingStatistics();

			p.format("%5$6.4f\t%1$7d\t%2$7d\t%3$8.3f\n",
				blockingStatistics.arrivals(),
				blockingStatistics.completions(),
				blockingStatistics.sampleMean(),
				blockingStatistics.sampleVariance(),
				lambda
			);
			System.gc();
		}
		p.flush();
		System.out.print('.');
		}
		p.close();
	}

	private static Distribution<Integer> constDist(final double v)
	{
		return new Distribution<Integer>()
		{
			@Override
			public Double valueOf(Integer value)
			{
				return v;
			}

			@Override
			public Domain<Integer> domain()
			{
				return new IntRange(0, Integer.MAX_VALUE);
			}

			@Override
			public Domain<Double> range()
			{
				return new DoubleRange(0.0D, 1.0D, Double.MIN_NORMAL);
			}

		};
	}

	private static Distribution<Integer> optimalDist(final double v)
	{
		return new Distribution<Integer>()
		{
			@Override
			public Double valueOf(Integer value)
			{
				return (1 - v) / value;
			}

			@Override
			public Domain<Integer> domain()
			{
				return new IntRange(0, Integer.MAX_VALUE);
			}

			@Override
			public Domain<Double> range()
			{
				return new DoubleRange(0.0D, 1.0D, Double.MIN_NORMAL);
			}

		};
	}

	private NetworksSim()
	{
	}
}
