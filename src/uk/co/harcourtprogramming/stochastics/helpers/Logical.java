package uk.co.harcourtprogramming.stochastics.helpers;

import uk.co.harcourtprogramming.stochastics.entropy.logic.Predicate;

/**
 *
 * @author Benedict
 */
public class Logical
{
	public static <T> Predicate<T> and(final Predicate<T> first, final Predicate<T> second)
	{
		return new Predicate<T>() {
			private final Predicate<T> a = first;
			private final Predicate<T> b = second;

			@Override
			public boolean predicateMatches(T query)
			{
				return a.predicateMatches(query) && b.predicateMatches(query);
			}
		};
	}

	public static <T> Predicate<T> or(final Predicate<T> first, final Predicate<T> second)
	{
		return new Predicate<T>() {
			private final Predicate<T> a = first;
			private final Predicate<T> b = second;

			@Override
			public boolean predicateMatches(T query)
			{
				return a.predicateMatches(query) || b.predicateMatches(query);
			}
		};
	}

	public static <T> Predicate<T> not(final Predicate<T> first)
	{
		return new Predicate<T>() {
			private final Predicate<T> a = first;

			@Override
			public boolean predicateMatches(T query)
			{
				return !a.predicateMatches(query);
			}
		};
	}

	private Logical()
	{
	}
}
