package uk.co.harcourtprogramming.stochastics.entropy.helpers;

import uk.co.harcourtprogramming.stochastics.entropy.DiscreteProcess;
import uk.co.harcourtprogramming.stochastics.entropy.logic.Predicate;

public class FilteredDiscreteProcess implements DiscreteProcess
{
	private final DiscreteProcess entropySource;
	private final Predicate<Long> range;

	public FilteredDiscreteProcess(DiscreteProcess entropySource, Predicate<Long> range)
	{
		this.entropySource = entropySource;
		this.range = range;
	}

	@Override
	public Long next()
	{
		Long n;
		do
		{
			n = entropySource.next();
		}
		while (!range.predicateMatches(n));

		return n;
	}

	@Override
	public double mean()
	{
		return entropySource.mean();
	}

}
