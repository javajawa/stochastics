package uk.co.harcourtprogramming.stochastics.statistics;

public interface Statistic<T extends Number>
{
	void   observed(T value);
	long   sampleCount();
	double sampleMean();
	double sampleVariance();
	T sampleMinimum();
	T sampleMaximum();
}
