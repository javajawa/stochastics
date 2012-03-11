package networkssim.entropy;

import networkssim.functions.Function;

@SuppressWarnings("MarkerInterface")
public interface Distribution<T extends Comparable<T> > extends Function<T, Double>
{
	@Override
	Double valueOf(T value);
}
