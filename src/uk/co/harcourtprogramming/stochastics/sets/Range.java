package uk.co.harcourtprogramming.stochastics.sets;
import java.util.SortedSet;

public abstract class Range<T> extends Domain<T> implements SortedSet<T>
{

	@Override
	public abstract Range<T> subSet(T fromElement, T toElement);

	@Override
	public abstract Range<T> headSet(T toElement);

	@Override
	public abstract Range<T> tailSet(T fromElement);

}
