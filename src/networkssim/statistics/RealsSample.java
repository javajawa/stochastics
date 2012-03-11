package networkssim.statistics;

import java.io.Serializable;
import java.math.BigDecimal;

public class RealsSample implements Serializable, Statistic<Double>
{
	private static final long serialVersionUID = 1L;

	private BigDecimal sigma_x = BigDecimal.ZERO;
	private BigDecimal sigma_x_squared = BigDecimal.ZERO;
	private long count = 0;

	private final Statistic publicExport = new Statistic();

	public RealsSample()
	{
		// Nothing to see here. Move along, citizen!
	}

	@Override
	public synchronized void observed(Double v)
	{
		sigma_x = sigma_x.add(BigDecimal.valueOf(v));
		sigma_x_squared = sigma_x_squared.add(BigDecimal.valueOf(v).pow(2));
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
	public Double sampleMinimum()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Double sampleMaximum()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public networkssim.statistics.Statistic<Double> unmodifiableCopy()
	{
		return publicExport;
	}

	private class Statistic implements networkssim.statistics.Statistic<Double>
	{
		@Override
		public long sampleCount()
		{
			return RealsSample.this.sampleCount();
		}

		@Override
		public double sampleMean()
		{
			return RealsSample.this.sampleMean();
		}

		@Override
		public double sampleVariance()
		{
			return RealsSample.this.sampleVariance();
		}

		@Override
		public Double sampleMinimum()
		{
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public Double sampleMaximum()
		{
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public void observed(Double value)
		{
			throw new UnsupportedOperationException("Not supported yet.");
		}
	}
}
