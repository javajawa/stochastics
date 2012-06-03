package uk.co.harcourtprogramming.stochastics.entropy.logic;

/**
 *
 * @author Benedict
 */
public interface Predicate<T>
{
	boolean predicateMatches(T query);
}
