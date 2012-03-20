package uk.co.harcourtprogramming.stochastics.sets;

import java.util.Iterator;

public class DoubleRange extends Domain<Double>
{
	private final double lower;
	private final double upper;
	private final double step;
	private final int size;

	public DoubleRange(double lower, double upper, double step)
	{
		this.lower = lower;
		this.upper = upper;
		this.step = step;
		this.size = (int)Math.floor((upper - lower) / step);
	}

	@Override
	public int size()
	{
		return size;
	}

	@Override
	public boolean contains(Object o)
	{
		if (!(o instanceof Number))
			return false;

		final double n = ((Number)o).doubleValue() - lower;

		if (n < 0 || n > (upper - lower))
			return false;

		final double del = Math.round(n/step) - n/step;

		return (del < step/20 && del > -step/20);
	}

	@Override
	public Iterator<Double> iterator()
	{
		return new Iterator<Double>() {
			private int i = -1;
			@Override
			public boolean hasNext()
			{
				return (i - 1) < size();
			}

			@Override
			public Double next()
			{
				++i;
				return lower + step * i;

			}

			@Override
			public void remove()
			{
				throw new UnsupportedOperationException("Ranges are not modifable");
			}
		};
	}

	@Override
	public Double[] toArray()
	{
		Double[] ret = new Double[size()];
		int i = 0;
		for (Double d : this)
			ret[i++] = d;
		return ret;
	}

	@Override
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
