package uk.co.harcourtprogramming.stochastics.entropy.implementations;

import java.util.Random;
import uk.co.harcourtprogramming.stochastics.entropy.DiscreteProcess;
/**
 *
 * @author Benedict
 */
public class PusedoBernoulli implements DiscreteProcess
{
	public final long n;
	private final Gaussian inner;

	public PusedoBernoulli(long trials, double p, Random r)
	{
		if (p < 0 || p > 1) throw new IllegalArgumentException("P must be betweeen 0 and 1");
		inner = new Gaussian(trials * p, trials * p * (1-p), r);
		this.n = trials;
	}

	@Override
	public Long next()
	{
		long l = -1;
		while (l < 0 || l > n)
			l = inner.next().longValue();
		return l;
	}
}
