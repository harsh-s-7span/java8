package features.predicate;

import java.util.Objects;

public class PredicateEmployee
{
	int id;
	String name;
	int age;
	String city;

	public PredicateEmployee(int id, String name, int age, String city)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		PredicateEmployee employee = (PredicateEmployee) o;
		return id == employee.id && age == employee.age && name.equals(employee.name) && city.equals(employee.city);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(id, name, age, city);
	}
}
