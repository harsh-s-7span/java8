package presentation.typeerasure;

public class Demo2<T extends Comparable>
{
	T value;

	public Demo2(T value)
	{
		this.value = value;
	}

	public T getValue()
	{
		return value;
	}

	public void setValue(T value)
	{
		this.value = value;
	}
}
