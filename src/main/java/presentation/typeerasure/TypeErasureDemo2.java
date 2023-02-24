package presentation.typeerasure;

public class TypeErasureDemo2
{
	Comparable value;

	public TypeErasureDemo2(Comparable value)
	{
		this.value = value;
	}

	public Comparable getValue()
	{
		return value;
	}

	public void setValue(Comparable value)
	{
		this.value = value;
	}
}
