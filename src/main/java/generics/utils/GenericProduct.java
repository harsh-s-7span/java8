package generics.utils;

// A class that can accept two different type of data T and U.
public class GenericProduct<T,U>
{
	T id;
	U description;

	public GenericProduct(T id, U description)
	{
		this.id = id;
		this.description = description;
	}

	public T getId()
	{
		return id;
	}

	public void setId(T id)
	{
		this.id = id;
	}

	public U getDescription()
	{
		return description;
	}

	public void setDescription(U description)
	{
		this.description = description;
	}

	@Override
	public String toString()
	{
		return "GenericProduct{" + "id=" + id + ", description=" + description + '}';
	}
}
