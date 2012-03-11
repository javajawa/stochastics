package networkssim.statistics;

import java.math.BigInteger;

public class TimedQueueSample implements QueueStatistic
{
	private int arrivals = 0;
	private int completions = 0;
	private int current = 0;

	private BigInteger sigma_x = BigInteger.ZERO;
	private BigInteger sigma_x_squared = BigInteger.ZERO;
	private long count = 0;

	private final Statistic publicExport = new Statistic();

	public TimedQueueSample()
	{
		// Nothing to see here. Move along, citizen!
	}

	@Override
	public synchronized Integer arrivals()
	{
		return arrivals;
	}

	@Override
	public synchronized Integer completions()
	{
		return completions;
	}

	@Override
	public void observed(Integer value)
	{
		throw new UnsupportedOperationException("Use observed(a, c)");
	}

	public synchronized void observed(Integer arrivals, Integer completions)
	{
		this.arrivals += arrivals;
		this.completions += completions;
		this.current += arrivals - completions;

		sigma_x = sigma_x.add(BigInteger.valueOf(current));
		sigma_x_squared = sigma_x_squared.add(BigInteger.valueOf(current).pow(2));
		++count;
	}

	@Override
	public synchronized long sampleCount()
	{
		return count;
	}

	@Override
	public synchronized double sampleMean()
	{
		return sigma_x.doubleValue() / count;
	}

	@Override
	public synchronized double sampleVariance()
	{
		if (count < 2) return Double.POSITIVE_INFINITY;
		return sigma_x_squared.doubleValue() / count - Math.pow(sampleMean(), 2);
	}

	@Override
	public Integer sampleMinimum()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Integer sampleMaximum()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public QueueStatistic unmodifiableCopy()
	{
		return publicExport;
	}

	private class Statistic implements networkssim.statistics.QueueStatistic
	{
		@Override
		public long sampleCount()
		{
			return TimedQueueSample.this.sampleCount();
		}

		@Override
		public double sampleMean()
		{
			return TimedQueueSample.this.sampleMean();
		}

		@Override
		public double sampleVariance()
		{
			return TimedQueueSample.this.sampleVariance();
		}

		@Override
		public Integer sampleMinimum()
		{
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public Integer sampleMaximum()
		{
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public void observed(Integer value)
		{
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public Integer arrivals()
		{
			return TimedQueueSample.this.arrivals();
		}

		@Override
		public Integer completions()
		{
			return TimedQueueSample.this.completions();
		}
	}
}
