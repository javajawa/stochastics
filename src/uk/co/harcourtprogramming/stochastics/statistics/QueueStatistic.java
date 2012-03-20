package uk.co.harcourtprogramming.stochastics.statistics;

/**
 *
 * @author Benedict
 */
public interface QueueStatistic extends Statistic<Integer>
{
	public Integer arrivals();
	public Integer completions();
}
