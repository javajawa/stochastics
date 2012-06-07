package uk.co.harcourtprogramming.stochastics.helpers;

import java.lang.reflect.Array;

/**
 *
 * @author Benedict
 */
public class ArrayQueue<T>
{
	private final T[] backing;
	private final int length;
	private int pos = 0;

	@SuppressWarnings("unchecked")
	public ArrayQueue(int length, T initialValue)
	{
		backing = (T[])Array.newInstance(initialValue.getClass(), length);
		this.length = length;

		for (int i = 0; i < length; ++i)
			backing[i] = initialValue;
	}

	public synchronized T add(T value)
	{
		T displaced = backing[pos];
		backing[pos] = value;
		pos = (pos + 1) % length;
		return displaced;
	}
}
