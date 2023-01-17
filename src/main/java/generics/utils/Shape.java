package generics.utils;

public class Shape<T>
{
	T t;

	public void setT(T t)
	{
		this.t = t;
	}

	public T getT()
	{
		return this.t;
	}
}
