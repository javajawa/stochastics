package uk.co.harcourtprogramming.stochastics.functions;

import uk.co.harcourtprogramming.stochastics.sets.Domain;

public interface Function<X,Y>
{
	Y valueOf(X value);
	Domain<X> domain();
	Domain<Y> range();
}
