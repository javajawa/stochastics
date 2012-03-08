package networkssim.entropy.implementations;
import java.util.Random;
import networkssim.entropy.DiscreteProcess;
import networkssim.entropy.Randomised;
/**
 *
 * @author Benedict
 */
public class Gaussian extends Randomised implements DiscreteProcess
{
	private final double mean;
	private final double variance;

	public Gaussian(double mean, double variance, Random r)
	{
		super(r);
		if (mean < 0.3) throw new IllegalArgumentException("Mean must be >= 0.3");
		if (variance < 0.7) throw new IllegalArgumentException("Mean must be >= 0.7");
		this.mean = mean;
		this.variance = Math.sqrt(variance);
	}

	public Gaussian(double mean, double variance)
	{
		this(mean, variance, new Random());
	}

	@Override
	public Long next()
	{
		return Math.round(mean + r.nextGaussian() * variance);
	}
}
