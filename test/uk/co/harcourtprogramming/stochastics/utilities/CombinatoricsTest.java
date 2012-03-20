package uk.co.harcourtprogramming.stochastics.utilities;

import uk.co.harcourtprogramming.stochastics.utilities.Combinatorics;
import java.math.BigInteger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Benedict
 */
public class CombinatoricsTest
{
	public CombinatoricsTest()
	{
	}

	/**
	 * Test of choose method, of class Combinatorics.
	 */
	@Test
	public void testChoose()
	{
		assertEquals(new BigInteger("10"), Combinatorics.choose(5, 3));
	}

	@Test
	public void testChoose2()
	{
		assertEquals(new BigInteger("23951146041928082866135587776380551750"), Combinatorics.choose(128, 64));
	}
}
