package networkssim.entropy;

import java.util.Collection;
import java.util.Arrays;
import networkssim.entropy.implementations.Bernoulli;
import networkssim.statistics.Sample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class BernoulliDistributionTest
{
	@Parameterized.Parameters
	public static Collection<Number[]> data()
	{
		return Arrays.asList(
			new Number[] {     1,  0.010D},
			new Number[] {     1,  0.050D},
			new Number[] {     1,  0.100D},
			new Number[] {     1,  0.250D},
			new Number[] {     1,  0.330D},
			new Number[] {     1,  0.500D},
			new Number[] {     1,  0.670D},
			new Number[] {     1,  0.750D},
			new Number[] {     1,  0.900D},
			new Number[] {     1,  0.950D},
			new Number[] {     1,  0.990D},
			new Number[] {     2,  0.010D},
			new Number[] {     2,  0.050D},
			new Number[] {     2,  0.100D},
			new Number[] {     2,  0.250D},
			new Number[] {     2,  0.330D},
			new Number[] {     2,  0.500D},
			new Number[] {     2,  0.670D},
			new Number[] {     2,  0.750D},
			new Number[] {     2,  0.900D},
			new Number[] {     2,  0.950D},
			new Number[] {     2,  0.990D},
			new Number[] {     4,  0.010D},
			new Number[] {     4,  0.050D},
			new Number[] {     4,  0.100D},
			new Number[] {     4,  0.250D},
			new Number[] {     4,  0.330D},
			new Number[] {     4,  0.500D},
			new Number[] {     4,  0.670D},
			new Number[] {     4,  0.750D},
			new Number[] {     4,  0.900D},
			new Number[] {     4,  0.950D},
			new Number[] {     4,  0.990D},
			new Number[] {     8,  0.010D},
			new Number[] {     8,  0.050D},
			new Number[] {     8,  0.100D},
			new Number[] {     8,  0.250D},
			new Number[] {     8,  0.330D},
			new Number[] {     8,  0.500D},
			new Number[] {     8,  0.670D},
			new Number[] {     8,  0.750D},
			new Number[] {     8,  0.900D},
			new Number[] {     8,  0.950D},
			new Number[] {     8,  0.990D},
			new Number[] {    16,  0.010D},
			new Number[] {    16,  0.050D},
			new Number[] {    16,  0.100D},
			new Number[] {    16,  0.250D},
			new Number[] {    16,  0.330D},
			new Number[] {    16,  0.500D},
			new Number[] {    16,  0.670D},
			new Number[] {    16,  0.750D},
			new Number[] {    16,  0.900D},
			new Number[] {    16,  0.950D},
			new Number[] {    16,  0.990D},
			new Number[] {    32,  0.010D},
			new Number[] {    32,  0.050D},
			new Number[] {    32,  0.100D},
			new Number[] {    32,  0.250D},
			new Number[] {    32,  0.330D},
			new Number[] {    32,  0.500D},
			new Number[] {    32,  0.670D},
			new Number[] {    32,  0.750D},
			new Number[] {    32,  0.900D},
			new Number[] {    32,  0.950D},
			new Number[] {    32,  0.990D},
			new Number[] {    64,  0.010D},
			new Number[] {    64,  0.050D},
			new Number[] {    64,  0.100D},
			new Number[] {    64,  0.250D},
			new Number[] {    64,  0.330D},
			new Number[] {    64,  0.500D},
			new Number[] {    64,  0.670D},
			new Number[] {    64,  0.750D},
			new Number[] {    64,  0.900D},
			new Number[] {    64,  0.950D},
			new Number[] {    64,  0.990D},
			new Number[] {   128,  0.010D},
			new Number[] {   128,  0.050D},
			new Number[] {   128,  0.100D},
			new Number[] {   128,  0.250D},
			new Number[] {   128,  0.330D},
			new Number[] {   128,  0.500D},
			new Number[] {   128,  0.670D},
			new Number[] {   128,  0.750D},
			new Number[] {   128,  0.900D},
			new Number[] {   128,  0.950D},
			new Number[] {   128,  0.990D},
			new Number[] {   256,  0.010D},
			new Number[] {   256,  0.050D},
			new Number[] {   256,  0.100D},
			new Number[] {   256,  0.250D},
			new Number[] {   256,  0.330D},
			new Number[] {   256,  0.500D},
			new Number[] {   256,  0.670D},
			new Number[] {   256,  0.750D},
			new Number[] {   256,  0.900D},
			new Number[] {   256,  0.950D},
			new Number[] {   256,  0.990D},
			new Number[] {   512,  0.010D},
			new Number[] {   512,  0.050D},
			new Number[] {   512,  0.100D},
			new Number[] {   512,  0.250D},
			new Number[] {   512,  0.330D},
			new Number[] {   512,  0.500D},
			new Number[] {   512,  0.670D},
			new Number[] {   512,  0.750D},
			new Number[] {   512,  0.900D},
			new Number[] {   512,  0.950D},
			new Number[] {   512,  0.990D},
			new Number[] {  1024,  0.010D},
			new Number[] {  1024,  0.050D},
			new Number[] {  1024,  0.100D},
			new Number[] {  1024,  0.250D},
			new Number[] {  1024,  0.330D},
			new Number[] {  1024,  0.500D},
			new Number[] {  1024,  0.670D},
			new Number[] {  1024,  0.750D},
			new Number[] {  1024,  0.900D},
			new Number[] {  1024,  0.950D},
			new Number[] {  1024,  0.990D}
		);
	}

	private final int n;
	private final double p;
	private final int total;

	public BernoulliDistributionTest(int n, double p)
	{
		this.n = n;
		this.p = p;
		this.total = 200000 * (int)Math.ceil(Math.log1p(n));
	}

	/**
	 * Test of next method, of class Poisson.
	 */
	@Test
	@SuppressWarnings("UseOfSystemOutOrSystemErr")
	public void testDistribution()
	{
		Bernoulli instance = new Bernoulli(n, p);
		Sample s = new Sample();

		for (int i = 0; i < total; ++i)
			s.observed(instance.next().intValue());

		double mean = n * p;
		double var = n * p * (1 - p);

		double smean = s.sampleMean();
		double svar = s.sampleVariance();

		double dmean = 0.005 * Math.sqrt(mean);
		double dvar  = 0.005 * Math.sqrt(var) * (1 + Math.sqrt(mean));

		try
		{
			assertEquals("Mean outside bound", mean, smean, dmean);
			assertEquals("Variance outside bound", var, svar, dvar);
		}
		catch (AssertionError err)
		{
			System.out.format("(%2$8.3f;%4$8.3f): %1$7.3f/%5$6.3f\t%3$7.3f/%6$6.3f [FAIL]\n",
				smean - mean, mean, svar - var, var, dmean, dvar, total);
			throw err;
		}
		System.out.format("(%2$8.3f;%4$8.3f): %1$7.3f/%5$6.3f\t%3$7.3f/%6$6.3f\n",
			smean - mean, mean, svar - var, var, dmean, dvar, total);
	}
}
