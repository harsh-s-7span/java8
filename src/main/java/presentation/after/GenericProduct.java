package presentation.after;

public class GenericProduct<T, U>
{
	T id;
	U name;

	public GenericProduct(T id, U name)
	{
		this.id = id;
		this.name = name;
	}

	public T getId()
	{
		return id;
	}

	public void setId(T id)
	{
		this.id = id;
	}

	public U getName()
	{
		return name;
	}

	public void setName(U name)
	{
		this.name = name;
	}
}
