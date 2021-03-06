package uk.co.harcourtprogramming.stochastics.helpers;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import uk.co.harcourtprogramming.stochastics.sets.ContinuousDoubleRange;
import uk.co.harcourtprogramming.stochastics.sets.IntRange;
import uk.co.harcourtprogramming.stochastics.sets.Range;
import uk.co.harcourtprogramming.stochastics.statistics.RealsSample;
import uk.co.harcourtprogramming.stochastics.statistics.Statistic;

public final class Sets
{
	public final static Range<Double> REALS =
		new ContinuousDoubleRange(Double.MIN_VALUE, Double.MAX_VALUE);

	public final static Range<Integer> INTEGERS =
		new IntRange(Integer.MIN_VALUE, Integer.MAX_VALUE);

	public final static Range<Integer> NATURALS = INTEGERS.tailSet(1);

	private Sets()
	{
		// Nothing to see here. Move along, citizen!
	}

	public static <T> Set<T> union(Set<? extends T> a, Set<? extends T> b)
	{
		Set<T> u = new HashSet<T>(a);
		u.addAll(b);

		return u;
	}

	public static <T> Set<T> intersection(Set<? extends T> a, Set<? extends T> b)
	{
		Set<T> u = new HashSet<T>(a);
		u.retainAll(b);

		return u;
	}

	public static Statistic<Double> getStatistics(Collection<Number> s)
	{
		RealsSample ret = new RealsSample();
		for (Number d : s)
			ret.observed(d.doubleValue());

		return ret.unmodifiableCopy();
	}

	public static <T extends Comparable<? super T>> TreeSet<T> newTreeSet()
	{
		return new TreeSet<T>();
	}
}
