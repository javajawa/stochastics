package uk.co.harcourtprogramming.stochastics.entropy;

import uk.co.harcourtprogramming.stochastics.entropy.implementations.Gaussian;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Collection;
import java.util.Arrays;
import java.util.HashMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class GaussianDistributionTest
{
	@Parameterized.Parameters
	public static Collection<Number[]> data()
	{
		return Arrays.asList(new Number[][] {
new Number[] {   0.500D,    1.000D},
new Number[] {   0.500D,    2.000D},
new Number[] {   0.500D,    4.000D},
new Number[] {   0.500D,    8.000D},
new Number[] {   0.500D,   16.000D},
new Number[] {   0.500D,   32.000D},
new Number[] {   0.500D,   64.000D},
new Number[] {   0.500D,  128.000D},
new Number[] {   0.500D,  256.000D},
new Number[] {   0.500D,  512.000D},
new Number[] {   0.500D, 1024.000D},
new Number[] {   0.500D, 4096.000D},
new Number[] {   0.500D, 32786.000D},
new Number[] {   0.600D,    1.000D},
new Number[] {   0.600D,    2.000D},
new Number[] {   0.600D,    4.000D},
new Number[] {   0.600D,    8.000D},
new Number[] {   0.600D,   16.000D},
new Number[] {   0.600D,   32.000D},
new Number[] {   0.600D,   64.000D},
new Number[] {   0.600D,  128.000D},
new Number[] {   0.600D,  256.000D},
new Number[] {   0.600D,  512.000D},
new Number[] {   0.600D, 1024.000D},
new Number[] {   0.600D, 4096.000D},
new Number[] {   0.600D, 32786.000D},
new Number[] {   0.700D,    1.000D},
new Number[] {   0.700D,    2.000D},
new Number[] {   0.700D,    4.000D},
new Number[] {   0.700D,    8.000D},
new Number[] {   0.700D,   16.000D},
new Number[] {   0.700D,   32.000D},
new Number[] {   0.700D,   64.000D},
new Number[] {   0.700D,  128.000D},
new Number[] {   0.700D,  256.000D},
new Number[] {   0.700D,  512.000D},
new Number[] {   0.700D, 1024.000D},
new Number[] {   0.700D, 4096.000D},
new Number[] {   0.700D, 32786.000D},
new Number[] {   0.800D,    1.000D},
new Number[] {   0.800D,    2.000D},
new Number[] {   0.800D,    4.000D},
new Number[] {   0.800D,    8.000D},
new Number[] {   0.800D,   16.000D},
new Number[] {   0.800D,   32.000D},
new Number[] {   0.800D,   64.000D},
new Number[] {   0.800D,  128.000D},
new Number[] {   0.800D,  256.000D},
new Number[] {   0.800D,  512.000D},
new Number[] {   0.800D, 1024.000D},
new Number[] {   0.800D, 4096.000D},
new Number[] {   0.800D, 32786.000D},
new Number[] {   0.900D,    1.000D},
new Number[] {   0.900D,    2.000D},
new Number[] {   0.900D,    4.000D},
new Number[] {   0.900D,    8.000D},
new Number[] {   0.900D,   16.000D},
new Number[] {   0.900D,   32.000D},
new Number[] {   0.900D,   64.000D},
new Number[] {   0.900D,  128.000D},
new Number[] {   0.900D,  256.000D},
new Number[] {   0.900D,  512.000D},
new Number[] {   0.900D, 1024.000D},
new Number[] {   0.900D, 4096.000D},
new Number[] {   0.900D, 32786.000D},
new Number[] {   1.000D,    1.000D},
new Number[] {   1.000D,    2.000D},
new Number[] {   1.000D,    4.000D},
new Number[] {   1.000D,    8.000D},
new Number[] {   1.000D,   16.000D},
new Number[] {   1.000D,   32.000D},
new Number[] {   1.000D,   64.000D},
new Number[] {   1.000D,  128.000D},
new Number[] {   1.000D,  256.000D},
new Number[] {   1.000D,  512.000D},
new Number[] {   1.000D, 1024.000D},
new Number[] {   1.000D, 4096.000D},
new Number[] {   1.000D, 32786.000D},
new Number[] {   2.000D,    1.000D},
new Number[] {   2.000D,    2.000D},
new Number[] {   2.000D,    4.000D},
new Number[] {   2.000D,    8.000D},
new Number[] {   2.000D,   16.000D},
new Number[] {   2.000D,   32.000D},
new Number[] {   2.000D,   64.000D},
new Number[] {   2.000D,  128.000D},
new Number[] {   2.000D,  256.000D},
new Number[] {   2.000D,  512.000D},
new Number[] {   2.000D, 1024.000D},
new Number[] {   2.000D, 4096.000D},
new Number[] {   2.000D, 32786.000D},
new Number[] {   4.000D,    1.000D},
new Number[] {   4.000D,    2.000D},
new Number[] {   4.000D,    4.000D},
new Number[] {   4.000D,    8.000D},
new Number[] {   4.000D,   16.000D},
new Number[] {   4.000D,   32.000D},
new Number[] {   4.000D,   64.000D},
new Number[] {   4.000D,  128.000D},
new Number[] {   4.000D,  256.000D},
new Number[] {   4.000D,  512.000D},
new Number[] {   4.000D, 1024.000D},
new Number[] {   4.000D, 4096.000D},
new Number[] {   4.000D, 32786.000D},
new Number[] {   8.000D,    1.000D},
new Number[] {   8.000D,    2.000D},
new Number[] {   8.000D,    4.000D},
new Number[] {   8.000D,    8.000D},
new Number[] {   8.000D,   16.000D},
new Number[] {   8.000D,   32.000D},
new Number[] {   8.000D,   64.000D},
new Number[] {   8.000D,  128.000D},
new Number[] {   8.000D,  256.000D},
new Number[] {   8.000D,  512.000D},
new Number[] {   8.000D, 1024.000D},
new Number[] {   8.000D, 4096.000D},
new Number[] {   8.000D, 32786.000D},
new Number[] {  16.000D,    1.000D},
new Number[] {  16.000D,    2.000D},
new Number[] {  16.000D,    4.000D},
new Number[] {  16.000D,    8.000D},
new Number[] {  16.000D,   16.000D},
new Number[] {  16.000D,   32.000D},
new Number[] {  16.000D,   64.000D},
new Number[] {  16.000D,  128.000D},
new Number[] {  16.000D,  256.000D},
new Number[] {  16.000D,  512.000D},
new Number[] {  16.000D, 1024.000D},
new Number[] {  16.000D, 4096.000D},
new Number[] {  16.000D, 32786.000D},
new Number[] {  32.000D,    1.000D},
new Number[] {  32.000D,    2.000D},
new Number[] {  32.000D,    4.000D},
new Number[] {  32.000D,    8.000D},
new Number[] {  32.000D,   16.000D},
new Number[] {  32.000D,   32.000D},
new Number[] {  32.000D,   64.000D},
new Number[] {  32.000D,  128.000D},
new Number[] {  32.000D,  256.000D},
new Number[] {  32.000D,  512.000D},
new Number[] {  32.000D, 1024.000D},
new Number[] {  32.000D, 4096.000D},
new Number[] {  32.000D, 32786.000D},
new Number[] {  64.000D,    1.000D},
new Number[] {  64.000D,    2.000D},
new Number[] {  64.000D,    4.000D},
new Number[] {  64.000D,    8.000D},
new Number[] {  64.000D,   16.000D},
new Number[] {  64.000D,   32.000D},
new Number[] {  64.000D,   64.000D},
new Number[] {  64.000D,  128.000D},
new Number[] {  64.000D,  256.000D},
new Number[] {  64.000D,  512.000D},
new Number[] {  64.000D, 1024.000D},
new Number[] {  64.000D, 4096.000D},
new Number[] {  64.000D, 32786.000D},
new Number[] { 128.000D,    1.000D},
new Number[] { 128.000D,    2.000D},
new Number[] { 128.000D,    4.000D},
new Number[] { 128.000D,    8.000D},
new Number[] { 128.000D,   16.000D},
new Number[] { 128.000D,   32.000D},
new Number[] { 128.000D,   64.000D},
new Number[] { 128.000D,  128.000D},
new Number[] { 128.000D,  256.000D},
new Number[] { 128.000D,  512.000D},
new Number[] { 128.000D, 1024.000D},
new Number[] { 128.000D, 4096.000D},
new Number[] { 128.000D, 32786.000D},
new Number[] { 256.000D,    1.000D},
new Number[] { 256.000D,    2.000D},
new Number[] { 256.000D,    4.000D},
new Number[] { 256.000D,    8.000D},
new Number[] { 256.000D,   16.000D},
new Number[] { 256.000D,   32.000D},
new Number[] { 256.000D,   64.000D},
new Number[] { 256.000D,  128.000D},
new Number[] { 256.000D,  256.000D},
new Number[] { 256.000D,  512.000D},
new Number[] { 256.000D, 1024.000D},
new Number[] { 256.000D, 4096.000D},
new Number[] { 256.000D, 32786.000D},
new Number[] { 512.000D,    1.000D},
new Number[] { 512.000D,    2.000D},
new Number[] { 512.000D,    4.000D},
new Number[] { 512.000D,    8.000D},
new Number[] { 512.000D,   16.000D},
new Number[] { 512.000D,   32.000D},
new Number[] { 512.000D,   64.000D},
new Number[] { 512.000D,  128.000D},
new Number[] { 512.000D,  256.000D},
new Number[] { 512.000D,  512.000D},
new Number[] { 512.000D, 1024.000D},
new Number[] { 512.000D, 4096.000D},
new Number[] { 512.000D, 32786.000D},
new Number[] {1024.000D,    1.000D},
new Number[] {1024.000D,    2.000D},
new Number[] {1024.000D,    4.000D},
new Number[] {1024.000D,    8.000D},
new Number[] {1024.000D,   16.000D},
new Number[] {1024.000D,   32.000D},
new Number[] {1024.000D,   64.000D},
new Number[] {1024.000D,  128.000D},
new Number[] {1024.000D,  256.000D},
new Number[] {1024.000D,  512.000D},
new Number[] {1024.000D, 1024.000D},
new Number[] {1024.000D, 4096.000D},
new Number[] {1024.000D, 32786.000D},
new Number[] {4096.000D,    1.000D},
new Number[] {4096.000D,    2.000D},
new Number[] {4096.000D,    4.000D},
new Number[] {4096.000D,    8.000D},
new Number[] {4096.000D,   16.000D},
new Number[] {4096.000D,   32.000D},
new Number[] {4096.000D,   64.000D},
new Number[] {4096.000D,  128.000D},
new Number[] {4096.000D,  256.000D},
new Number[] {4096.000D,  512.000D},
new Number[] {4096.000D, 1024.000D},
new Number[] {4096.000D, 4096.000D},
new Number[] {4096.000D, 32786.000D},
new Number[] {32786.000D,    1.000D},
new Number[] {32786.000D,    2.000D},
new Number[] {32786.000D,    4.000D},
new Number[] {32786.000D,    8.000D},
new Number[] {32786.000D,   16.000D},
new Number[] {32786.000D,   32.000D},
new Number[] {32786.000D,   64.000D},
new Number[] {32786.000D,  128.000D},
new Number[] {32786.000D,  256.000D},
new Number[] {32786.000D,  512.000D},
new Number[] {32786.000D, 1024.000D},
new Number[] {32786.000D, 4096.000D},
new Number[] {32786.000D, 32786.000D},
		});
	}

	private final double mean;
	private final double variance;
	private final int total;

	public GaussianDistributionTest(double mean, double variance)
	{
		this.mean = mean;
		this.variance = variance;
		this.total = 500000 * (int)(1 + Math.log1p(variance) / 2) * (int)(1 + 2 / Math.log1p(mean));
	}

	/**
	 * Test of next method, of class Poisson.
	 */
	@Test
	@SuppressWarnings("UseOfSystemOutOrSystemErr")
	public void testDistribution()
	{
		Process instance = new Gaussian(mean, variance);

		Map<Double, Integer> counts = new HashMap<Double, Integer>();

		for (int i = 0; i < total; ++i)
		{
			double v = instance.next().doubleValue();
			counts.put(v, 1 + (counts.containsKey(v) ? counts.get(v) : 0) );
		}

		double smean = 0;
		double svar = 0;

		for (Entry<Double, Integer> e : counts.entrySet())
		{
			smean += e.getKey()            * (double)e.getValue() / total;
			svar  += e.getKey()*e.getKey() * (double)e.getValue() / total;
		}
		svar -= smean * smean;

		double dmean = Math.sqrt(0.02 * mean);
		double dvar  = Math.sqrt(0.02 * variance * Math.log1p(variance));

		try
		{
			assertEquals("Mean outside bound", mean, smean, dmean);
			assertEquals("Variance outside bound", variance, svar, dvar);
		}
		catch (AssertionError err)
		{
			System.out.format("(%2$10.3f;%4$10.3f): %1$8.3f/%5$8.3f\t%3$8.3f/%6$8.3f %7$d [FAIL]\n",
				smean - mean, mean, svar - variance, variance, dmean, dvar, total);
			throw err;
		}
		System.out.format("(%2$10.3f;%4$10.3f): %1$8.3f/%5$8.3f\t%3$8.3f/%6$8.3f %7$d\n",
			smean - mean, mean, svar - variance, variance, dmean, dvar, total);
	}
}
