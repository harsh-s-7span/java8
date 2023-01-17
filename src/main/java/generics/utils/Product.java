package generics.utils;

public class Product
{
	Object id;
	Object description;

	public Product(Object id, Object description)
	{
		this.id = id;
		this.description = description;
	}

	public Object getId()
	{
		return id;
	}

	public void setId(Object id)
	{
		this.id = id;
	}

	public Object getDescription()
	{
		return description;
	}

	public void setDescription(Object description)
	{
		this.description = description;
	}

	@Override
	public String toString()
	{
		return "Product{" + "id=" + id + ", description=" + description + '}';
	}
}
