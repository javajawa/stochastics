package uk.co.harcourtprogramming.stochastics.entropy.helpers;

import uk.co.harcourtprogramming.stochastics.entropy.Process;
import uk.co.harcourtprogramming.stochastics.entropy.logic.Predicate;

public class FilteredProcess implements Process
{
	private final Process entropySource;
	private final Predicate<Double> range;

	public FilteredProcess(Process entropySource, Predicate<Double> range)
	{
		this.entropySource = entropySource;
		this.range = range;
	}

	@Override
	public Number next()
	{
		Number n;
		do
		{
			n = entropySource.next();
		}
		while (!range.predicateMatches(n.doubleValue()));

		return n;
	}

}
