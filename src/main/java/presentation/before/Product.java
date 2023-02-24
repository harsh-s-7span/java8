package presentation.before;

public class Product
{
	Object id;
	Object name;

	public Product(Object id, Object name)
	{
		this.id = id;
		this.name = name;
	}

	public Object getId()
	{
		return id;
	}

	public void setId(Object id)
	{
		this.id = id;
	}

	public Object getName()
	{
		return name;
	}

	public void setName(Object name)
	{
		this.name = name;
	}
}
