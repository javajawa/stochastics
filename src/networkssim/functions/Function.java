package networkssim.functions;

import networkssim.sets.Domain;

public interface Function<X,Y>
{
	Y valueOf(X value);
	Domain<X> domain();
	Domain<Y> range();
}
