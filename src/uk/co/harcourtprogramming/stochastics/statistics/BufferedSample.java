package uk.co.harcourtprogramming.stochastics.statistics;

import java.math.BigDecimal;
import uk.co.harcourtprogramming.stochastics.helpers.ArrayQueue;

/**
 *
 * @author Benedict
 */
public class BufferedSample implements Statistic<Double>
{
	private static final long serialVersionUID = 1L;

	private final ArrayQueue<Double> buffer;
	private BigDecimal sigma_x = BigDecimal.ZERO;
	private BigDecimal sigma_x_squared = BigDecimal.ZERO;
	private int count = 0;

	private final Statistic publicExport = new Statistic();

	public BufferedSample(int bufferLength)
	{
		buffer = new ArrayQueue<Double>(bufferLength, Double.NaN);
	}

	@Override
	public synchronized void observed(Double v)
	{
		if (v == Double.NaN)
		{
			--count;
		}
		else
		{
			sigma_x = sigma_x.add(BigDecimal.valueOf(v));
			sigma_x_squared = sigma_x_squared.add(BigDecimal.valueOf(v).pow(2));
		}

		Double displaced = buffer.add(v);

		if (Double.isNaN(displaced))
		{
			++count;
		}
		else
		{
			sigma_x = sigma_x.subtract(BigDecimal.valueOf(displaced));
			sigma_x_squared = sigma_x_squared.subtract(BigDecimal.valueOf(displaced).pow(2));
		}
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
	public synchronized Double sampleMinimum()
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public synchronized Double sampleMaximum()
	{
		throw new UnsupportedOperationException();
	}

	public uk.co.harcourtprogramming.stochastics.statistics.Statistic<Double> unmodifiableCopy()
	{
		return publicExport;
	}

	private class Statistic implements uk.co.harcourtprogramming.stochastics.statistics.Statistic<Double>
	{
		@Override
		public long sampleCount()
		{
			return BufferedSample.this.sampleCount();
		}

		@Override
		public double sampleMean()
		{
			return BufferedSample.this.sampleMean();
		}

		@Override
		public double sampleVariance()
		{
			return BufferedSample.this.sampleVariance();
		}

		@Override
		public Double sampleMinimum()
		{
			return BufferedSample.this.sampleMinimum();
		}

		@Override
		public Double sampleMaximum()
		{
			return BufferedSample.this.sampleMaximum();
		}

		@Override
		public void observed(Double value)
		{
			throw new UnsupportedOperationException("Not supported yet.");
		}
	}
}
