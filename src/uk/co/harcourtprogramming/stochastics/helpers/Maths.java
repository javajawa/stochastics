package uk.co.harcourtprogramming.stochastics.helpers;

/**
 *
 * @author Benedict
 */
public final class Maths
{

	public static double filter(double min, double value, double max)
	{
		return Math.max(min, Math.min(value, max));
	}
	public static float filter(float min, float value, float max)
	{
		return Math.max(min, Math.min(value, max));
	}
	public static int filter(int min, int value, int max)
	{
		return Math.max(min, Math.min(value, max));
	}
	public static long filter(long min, long value, long max)
	{
		return Math.max(min, Math.min(value, max));
	}

	public static boolean trigger(boolean curr, double value, double on, double off)
	{
		if (on > off)
		{
			if (value > on) return true;
			if (value < off) return false;
		}
		else
		{
			if (value < on) return true;
			if (value > off) return false;
		}
		return curr;
	}

	public static boolean trigger(boolean curr, int value, int on, int off)
	{
		if (on > off)
		{
			if (value > on) return true;
			if (value < off) return false;
		}
		else
		{
			if (value < on) return true;
			if (value > off) return false;
		}
		return curr;
	}

	public static boolean trigger(boolean curr, long value, long on, long off)
	{
		if (on > off)
		{
			if (value > on) return true;
			if (value < off) return false;
		}
		else
		{
			if (value < on) return true;
			if (value > off) return false;
		}
		return curr;
	}

	public static boolean trigger(boolean curr, float value, float on, float off)
	{
		if (on > off)
		{
			if (value > on) return true;
			if (value < off) return false;
		}
		else
		{
			if (value < on) return true;
			if (value > off) return false;
		}
		return curr;
	}

	public static <T extends Comparable<T>> boolean trigger(boolean curr, T value, T on, T off)
	{
		if (on.compareTo(off) == 1)
		{
			if (value.compareTo(on) == 1) return true;
			if (value.compareTo(off) == -1) return false;
		}
		else
		{
			if (value.compareTo(on) == -1) return true;
			if (value.compareTo(off) == 1) return false;
		}
		return curr;
	}

	private Maths()
	{
	}

}
