package networkssim;

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
	public static void main(String[] args)
	{
		for (Double lambda : new DoubleRange(0.01, 0.25, 0.01))
		{
			SlottedAloha sim = new SlottedAloha(new Poisson(lambda), constDist(0.2), 50000);

			sim.run();
			QueueStatistic blockingStatistics = sim.getBlockingStatistics();

			System.out.format("l: %5$8.4f\tA: %1$10d\tC: %2$10d\tQm: %3$6.3f\tQv: %4$6.3f\n",
				blockingStatistics.arrivals(),
				blockingStatistics.completions(),
				blockingStatistics.sampleMean(),
				blockingStatistics.sampleVariance(),
				lambda
			);
		}
	}

	private static Distribution<Integer> constDist(final double v)
	{
		return new Distribution<Integer>()
		{
			@Override
			public Double valueOf(Integer value)
			{
				return Math.E / value;
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
