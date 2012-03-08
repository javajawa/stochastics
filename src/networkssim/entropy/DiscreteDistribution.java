package networkssim.entropy;

import java.util.Set;

public interface DiscreteDistribution<T extends Comparable<T> > extends Distribution<T>
{
	Set<T> domain();
}
