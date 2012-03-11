package networkssim.sets;

import java.util.Iterator;

public class IntRange extends Range<Integer>
{
	private final int lower;
	private final int upper;
	private final int step;
	private final int size;

	public IntRange(int lower, int upper)
	{
		this(lower, upper, 1);
	}

	public IntRange(int lower, int upper, int step)
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
	public Iterator<Integer> iterator()
	{
		return new Iterator<Integer>() {
			private int i = -1;
			@Override
			public boolean hasNext()
			{
				return i + 1 < size();
			}

			@Override
			public Integer next()
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
	public Integer[] toArray()
	{
		Integer[] ret = new Integer[size()];
		int i = 0;
		for (Integer d : this)
			ret[i++] = d;
		return ret;
	}

	@Override
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
