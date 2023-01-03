package features.consumer;

import java.util.ArrayList;
import java.util.List;

public class ConsumerTest
{
	int id;
	String name;
	int age;
	String email;
	String city;

	public ConsumerTest(int id, String name, int age, String email, String city)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.city = city;
	}

	public static List<ConsumerTest> populateObjects(){
		List<ConsumerTest> list = new ArrayList<>();
		list.add(new ConsumerTest(1, "Harsh", 22, "harsh@gmail.com", "Porbandar"));
		list.add(new ConsumerTest(2, "Anup", 22, "anup@gmail.com", "Modasa"));
		list.add(new ConsumerTest(3, "Nandani", 22, "nandani@gmail.com", "Idar"));
		list.add(new ConsumerTest(4, "Hetvi", 22, "hetvi@gmail.com", "Ahmedabad"));
		return list;
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

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
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
	public String toString()
	{
		return "ConsumerTest{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", email='" + email + '\'' + ", city='" + city
				+ '\'' + '}';
	}
}
