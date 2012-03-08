package networkssim.utilities;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Combinatorics
{
	private static final Map<Integer, BigInteger[]> c = new HashMap<Integer, BigInteger[]>();

	public static BigInteger choose(int n, int r)
	{
		if (n < 0) return BigInteger.ZERO;
		if (r  < 0 || r  > n) return BigInteger.ZERO;
		if (r == 0 || r == n) return BigInteger.ONE;

		synchronized(c)
		{
			if (c.containsKey(n))
				return c.get(n)[r];
		}

		BigInteger[] values = new BigInteger[n + 1];
		values[0] = BigInteger.ONE;
		values[n] = BigInteger.ONE;
		for (int i = 1; i < n; ++i)
			values[i] = choose(n-1,i-1).add(choose(n-1,i));

		synchronized (c)
		{
			if (!c.containsKey(n))
				c.put(n, values);
		}

		return values[r];
	}

	private Combinatorics()
	{
	}
}
