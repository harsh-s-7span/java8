package features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEmployee
{
	private int id;
	private String name;
	private String city;
	private Double salary;

	public StreamEmployee(){}

	public StreamEmployee(int id, String name, String city, Double salary){
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return "StreamEmployee{" + "id=" + id + ", name='" + name + '\'' + ", city='" + city + '\'' + ", salary=" + salary + '}';
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

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public Double getSalary()
	{
		return salary;
	}

	public void setSalary(Double salary)
	{
		this.salary = salary;
	}

	public static List<StreamEmployee> getEmployees(){
		List<String> names = Arrays.asList("Harsh", "Anup", "Rimpal", "Hetvi", "Nandani", "Satyajit", "Nikunj");
		List<StreamEmployee> employeeList = new ArrayList<>();
		employeeList.add(new StreamEmployee(1, "Anup", "Ahmedabad", 10000d));
		employeeList.add(new StreamEmployee(2, "Harsh", "Porbandar", 13000d));
		employeeList.add(new StreamEmployee(3, "Rimpal", "Mehsana", 20000d));
		employeeList.add(new StreamEmployee(4, "Satyajit", "Rajkot", 16000d));
		employeeList.add(new StreamEmployee(5, "Nandani", "Idar", 15000d));
		employeeList.add(new StreamEmployee(6, "Hetvi", "Ahmedabad", 23000d));
		return employeeList;
	}
}
