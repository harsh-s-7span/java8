package presentation.typeerasure;

public class TypeErasureDemo1
{
	Object value;

	public TypeErasureDemo1(Object value)
	{
		this.value = value;
	}

	public Object getValue()
	{
		return value;
	}

	public void setValue(Object value)
	{
		this.value = value;
	}
}
