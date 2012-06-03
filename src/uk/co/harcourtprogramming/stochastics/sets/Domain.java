package uk.co.harcourtprogramming.stochastics.sets;

import java.util.Collection;
import java.util.Set;
import uk.co.harcourtprogramming.stochastics.entropy.logic.Predicate;

public abstract class Domain<T> implements Set<T>, Predicate<T>
{

	@Override
	public final boolean isEmpty()
	{
		return false;
	}

	@Override
	public final boolean add(T e)
	{
		throw new UnsupportedOperationException("Domains are immutable");
	}

	@Override
	public final boolean remove(Object o)
	{
		throw new UnsupportedOperationException("Domains are immutable");
	}

	@Override
	@SuppressWarnings("element-type-mismatch")
	public boolean containsAll(Collection<?> c)
	{
		for (Object o : c)
			if (!contains(o)) return false;
		return true;
	}

	@Override
	public final boolean addAll(Collection<? extends T> c)
	{
		throw new UnsupportedOperationException("Domains are immutable");
	}

	@Override
	public final boolean retainAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Domains are immutable");
	}

	@Override
	public final boolean removeAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Domains are immutable");
	}

	@Override
	public final void clear()
	{
		throw new UnsupportedOperationException("Domains are immutable");
	}

	@Override
	public final boolean predicateMatches(T query)
	{
		return contains(query);
	}
}
