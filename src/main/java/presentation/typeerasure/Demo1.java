package presentation.typeerasure;

public class Demo1<T>
{
	T value;

	public Demo1(T value)
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


