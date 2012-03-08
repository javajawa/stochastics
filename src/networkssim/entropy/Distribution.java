package networkssim.entropy;

/**
 *
 * @author Benedict
 */
public interface Distribution<T extends Comparable<T> >
{
	double probabilityOf(T value);
	T rangeMin();
	T rangeMax();
}
