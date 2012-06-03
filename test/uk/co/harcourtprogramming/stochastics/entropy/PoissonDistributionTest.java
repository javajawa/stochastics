package uk.co.harcourtprogramming.stochastics.entropy;

import uk.co.harcourtprogramming.stochastics.entropy.implementations.Poisson;
import java.util.Collection;
import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class PoissonDistributionTest
{
	@Parameterized.Parameters
	public static Collection<Number[]> data()
	{
		return Arrays.asList(new Number[][] {
			new Number[]{0.01, 1000000},
			new Number[]{0.05, 1000000},
			new Number[]{0.1D, 1000000},
			new Number[]{0.2D, 1000000},
			new Number[]{0.3D, 1000000},
			new Number[]{0.5D, 1000000},
			new Number[]{0.75, 1000000},
			new Number[]{1D,   1000000},
			new Number[]{2D,   1000000},
			new Number[]{4D,   1000000},
			new Number[]{8D,   1000000},
			new Number[]{16D,  1000000},
			new Number[]{32D,  1000000},
			new Number[]{64D,  1000000},
			new Number[]{128D, 1000000},
			new Number[]{256D, 1000000}
		});
	}

	private final double lambda;
	private final int total;
	private final int cells;

	public PoissonDistributionTest(double lambda, int total)
	{
		this.lambda = lambda;
		this.total = total;
		this.cells = 5 * (Math.abs((int)Math.floor(lambda)) + 3);
	}

	/**
	 * Test of next method, of class Poisson.
	 */
	@Test
	@SuppressWarnings("UseOfSystemOutOrSystemErr")
	public void testDistribution()
	{
		DiscreteProcess instance = new Poisson(lambda);

		long[] counts = new long[cells];

		for (int i = 0; i < total; ++i)
			++counts[instance.next().intValue()];

		double mean = 0;
		double deviation = 0;

		for (int i = 0; i < cells; ++i)
		{
			mean += i * (double)counts[i] / total;
			deviation += i * i * (double)counts[i] / total;
		}
		deviation -= mean * mean;

		System.out.print(String.format("lambda: %1$8.3f\tmu: %2$8.3f\tvar: %3$8.3f\n", lambda, mean, deviation));

		assertEquals("Mean outside bound", lambda, mean, Math.log(1+lambda) / 8);
		assertEquals("Variance outside bound", lambda, deviation, Math.log(1+lambda) / 8);
	}
}
