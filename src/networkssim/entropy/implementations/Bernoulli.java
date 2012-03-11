package networkssim.entropy.implementations;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import networkssim.entropy.DiscreteProcess;
import java.util.Random;
import networkssim.entropy.DiscreteDistribution;
import networkssim.entropy.Randomised;
import networkssim.sets.Domain;
import networkssim.sets.DoubleRange;
import networkssim.sets.IntRange;
import networkssim.utilities.Combinatorics;

public class Bernoulli extends Randomised implements DiscreteProcess, DiscreteDistribution<Integer>
{
	private final int trials;
	private final double p;
	private final double[] probabilities;

	public Bernoulli(int trials, double p, Random r)
	{
		super(r);
		this.trials = trials;
		this.p = p;

		this.probabilities = new double[trials+1];
		for (int i = 0; i <= trials; ++i)
			this.probabilities[i] = Bernoulli.probabilityOf(trials, p, i);
	}

	public Bernoulli(int trials, double p)
	{
		this(trials, p, new Random());
	}

	@Override
	@SuppressWarnings("NestedAssignment")
	public Long next()
	{
		double rand = r.nextDouble();
		double culmative = 0.0D;
		int ret = 0;

		while ((ret < trials) && ((culmative += probabilities[ret]) <= rand))
			++ret;

		return (long)ret;
	}

	public static long sample(int trials, double p, Random r)
	{
		return sample(trials, p, r.nextDouble());
	}

	public static long sample(int trials, double p)
	{
		return sample(trials, p, Math.random());
	}

	@SuppressWarnings("NestedAssignment")
	private static long sample(int trials, double p, double rand)
	{
		double culmative = 0.0D;
		int ret = 0;

		while ((ret < trials) && ((culmative += probabilityOf(trials, p, ret)) <= rand))
			++ret;

		return (long)ret;
	}

	@Override
	public Domain<Integer> domain()
	{
		return new IntRange(0, trials);
	}

	@Override
	public Domain<Double> range()
	{
		return new DoubleRange(0, 1, Double.MIN_NORMAL);
	}

	@Override
	public Double valueOf(Integer value)
	{
		return probabilities[value.intValue()];
	}

	public static double probabilityOf(int trials, double p, int value)
	{
		BigDecimal d = new BigDecimal(Combinatorics.choose(trials, value));
		d = d.multiply(BigDecimal.valueOf(p).pow(value));
		d = d.multiply(BigDecimal.valueOf(1-p).pow(trials - value));
		return d.doubleValue();
	}

}
