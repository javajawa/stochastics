package uk.co.harcourtprogramming.stochastics.statistics;

import java.io.Serializable;
import java.math.BigInteger;

public class Sample implements Serializable, uk.co.harcourtprogramming.stochastics.statistics.Statistic<Integer>
{
	private static final long serialVersionUID = 1L;

	private BigInteger sigma_x = BigInteger.ZERO;
	private BigInteger sigma_x_squared = BigInteger.ZERO;
	private long count = 0;

	private final Statistic publicExport = new Statistic();

	public Sample()
	{
		// Nothing to see here. Move along, citizen!
	}

	@Override
	public synchronized void observed(Integer v)
	{
		sigma_x = sigma_x.add(BigInteger.valueOf(v));
		sigma_x_squared = sigma_x_squared.add(BigInteger.valueOf(v).pow(2));
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

	public uk.co.harcourtprogramming.stochastics.statistics.Statistic<Integer> unmodifiableCopy()
	{
		return publicExport;
	}

	private class Statistic implements uk.co.harcourtprogramming.stochastics.statistics.Statistic<Integer>
	{
		@Override
		public long sampleCount()
		{
			return Sample.this.sampleCount();
		}

		@Override
		public double sampleMean()
		{
			return Sample.this.sampleMean();
		}

		@Override
		public double sampleVariance()
		{
			return Sample.this.sampleVariance();
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
	}
}
