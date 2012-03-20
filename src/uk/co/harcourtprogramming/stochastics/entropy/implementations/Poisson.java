package uk.co.harcourtprogramming.stochastics.entropy.implementations;

import java.util.Random;
import uk.co.harcourtprogramming.stochastics.entropy.DiscreteProcess;
import uk.co.harcourtprogramming.stochastics.entropy.Randomised;

public class Poisson extends Randomised implements DiscreteProcess
{
	private final double L;

	public Poisson(double lambda, Random r)
	{
		super(r);
		if (lambda <= 0) throw new IllegalArgumentException("Lambda must be a positive number");
		this.L = Math.exp(-lambda);
	}

	public Poisson(double lambda)
	{
		this(lambda, new Random());
	}

	public Poisson(double lambda, long seed)
	{
		this(lambda, new Random(seed));
	}

	@SuppressWarnings("NestedAssignment")
	@Override
	public Long next()
	{
		long k = 0; double p = 1;
		while ((p *= r.nextDouble()) > L) ++k;
		return k;
	}
}
