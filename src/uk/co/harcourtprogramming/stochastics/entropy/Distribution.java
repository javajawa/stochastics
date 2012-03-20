package uk.co.harcourtprogramming.stochastics.entropy;

import uk.co.harcourtprogramming.stochastics.functions.Function;

@SuppressWarnings("MarkerInterface")
public interface Distribution<T extends Comparable<T> > extends Function<T, Double>
{
	@Override
	Double valueOf(T value);
}
