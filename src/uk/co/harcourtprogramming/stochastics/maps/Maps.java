package uk.co.harcourtprogramming.stochastics.maps;

import java.util.Map;
import java.util.TreeMap;
import uk.co.harcourtprogramming.stochastics.functions.BinaryOperator;

/**
 *
 * @author Benedict
 */
public class Maps
{
	public static <T> T walkValues(final Map<?, T> map, final BinaryOperator<T> func, final T inital)
	{
		T ret = inital;
		for (T t : map.values())
			ret = func.valueOf(ret, t);

		return ret;
	}

	public static <K,V> TreeMap<K,V> createTreeMap()
	{
		return new TreeMap<K, V>();
	}

	private Maps()
	{
	}
}
