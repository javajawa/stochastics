package uk.co.harcourtprogramming.stochastics.entropy;

public interface DiscreteProcess extends Process
{
	@Override
	Long next();
}
