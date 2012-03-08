package networkssim.entropy.implementations;
import networkssim.entropy.implementations.Gaussian;
import java.util.Random;
/**
 *
 * @author Benedict
 */
public class PusedoBernoulli extends Gaussian
{
	public final long n;

	public PusedoBernoulli(long trials, double p, Random r)
	{
		super(trials * p, trials * p * (1-p), r);
		if (p < 0 || p > 1) throw new IllegalArgumentException("P must be betweeen 0 and 1");
		this.n = trials;
	}

	@Override
	public Long next()
	{
		long l = -1;
		while (l < 0 || l > n)
			l = super.next();
		return l;
	}
}
