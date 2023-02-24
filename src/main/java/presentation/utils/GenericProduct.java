package presentation.utils;

// A class that can accept two different type of data T and U.
public class GenericProduct<T,U>
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

	public void setName(U description)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "GenericProduct{" + "id=" + id + ", name=" + name + '}';
	}
}
