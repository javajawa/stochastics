package networkssim.entropy;

import networkssim.entropy.Randomised;
import networkssim.entropy.implementations.Poisson;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

public class PoissonTest
{
	@Test(expected=IllegalArgumentException.class)
	@SuppressWarnings("ResultOfObjectAllocationIgnored")
	public void testConstructorNegativeLambda()
	{
		new Poisson(-1.0D);
	}

	@Test(expected=IllegalArgumentException.class)
	@SuppressWarnings("ResultOfObjectAllocationIgnored")
	public void testConstructorZeroLambda()
	{
		new Poisson(0.0D);
	}

	@Test(expected=IllegalArgumentException.class)
	@SuppressWarnings("ResultOfObjectAllocationIgnored")
	public void testConstructorNullRandom()
	{
		new Poisson(1.0D, null);
	}

	@Test
	public void testConstructorSeededRandom()
	{
		int seed = 100;
		Randomised p = new Poisson(1.0D, seed);
		Random r1 = p.getRandom();
		Random r2 = new Random(seed);
		for (int i = 0; i < 100; ++i)
			assertEquals("Random seuqence diverges at " + i + "th element", r1.nextLong(), r2.nextLong());
	}

	@Test
	public void testConstructorRandom()
	{
		Random r = new Random();
		Randomised p = new Poisson(1.0D, r);
		assertSame(r, p.getRandom());
	}

	@Test
	public void testConstructorRandomAutoSeeded()
	{
		Randomised p;
		p = new Poisson(1.0D);
		Random r1 = p.getRandom();
		p = new Poisson(1.0D);
		Random r2 = p.getRandom();

		int i = 0;
		while (++i < 100)
		{
			if (r1.nextInt() != r2.nextInt()) return;
		}

		fail("Random sequences did not diverge");
	}

}
