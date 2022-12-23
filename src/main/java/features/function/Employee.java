package features.function;

import java.util.ArrayList;
import java.util.List;

public class Employee
{
	int id;
	String name;
	Integer salary;

	public Employee(int id, String name, Integer salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public Integer getSalary()
	{
		return salary;
	}

	public void setSalary(Integer salary)
	{
		this.salary = salary;
	}

	public static List<Employee> getEmployees(){

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(1, "Harsh", 10000));
		employeeList.add(new Employee(2, "Anup", 12000));
		employeeList.add(new Employee(3, "Abhi", 11000));
		employeeList.add(new Employee(4, "Test", 7000));

		return employeeList;
	}

}
