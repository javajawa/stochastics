package uk.co.harcourtprogramming.stochastics.sets;

import java.util.Comparator;
import java.util.Iterator;

public class ContinuousDoubleRange extends Range<Double>
{
	private final double lower;
	private final double upper;

	public ContinuousDoubleRange(double lower, double upper)
	{
		this.lower = lower;
		this.upper = upper;
	}

	@Override
	public int size()
	{
		return Integer.MAX_VALUE;
	}

	@Override
	public boolean contains(Object o)
	{
		if (!(o instanceof Number))
			return false;

		final double n = ((Number)o).doubleValue();
		return (n >= lower && n <= upper);
	}

	@Override
	public Iterator<Double> iterator()
	{
		return new Iterator<Double>() {
			private long curr = Double.doubleToLongBits(lower);
			private final long last = Double.doubleToLongBits(upper);

			@Override
			public boolean hasNext()
			{
				return (curr != last);
			}

			@Override
			public Double next()
			{
				return Double.longBitsToDouble(curr++);
			}

			@Override
			public void remove()
			{
				throw new UnsupportedOperationException("Cannot remove items from an immutable set");
			}
		};

	}

	@Override
	public Double[] toArray()
	{
		throw new UnsupportedOperationException("Continuous range -- can not flatten to array");
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Continuous range -- can not flatten to array");
	}

	@Override
	public Range<Double> subSet(Double fromElement, Double toElement)
	{
		if (toElement > upper) throw new IllegalArgumentException("Argument not in range");
		if (fromElement < lower) throw new IllegalArgumentException("Argument not in range");
		return new ContinuousDoubleRange(fromElement, toElement);
	}

	@Override
	public Range<Double> headSet(Double toElement)
	{
		if (toElement > upper) throw new IllegalArgumentException("Argument not in range");
		return new ContinuousDoubleRange(lower, toElement);
	}

	@Override
	public Range<Double> tailSet(Double fromElement)
	{
		if (fromElement < lower) throw new IllegalArgumentException("Argument not in range");
		return new ContinuousDoubleRange(fromElement, upper);
	}

	@Override
	public Comparator<Double> comparator()
	{
		return null;
	}

	@Override
	public Double first()
	{
		return lower;
	}

	@Override
	public Double last()
	{
		return upper;
	}

}
