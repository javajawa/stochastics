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

	private Maths()
	{
	}

}
