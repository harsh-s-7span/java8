package features.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class Employee
{
	int id;
	String name;

	public Employee(int id, String name){
		this.id = id;
		this.name = name;
	}

	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}

	@Override
	public String toString(){

		return "[id:" + this.id + ", name:" + this.name + "]";
	}

	public static List<Employee> getEmployeeList(){
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(4, "Harsh"));
		employeeList.add(new Employee(2, "Rahul"));
		employeeList.add(new Employee(1, "Anup"));
		employeeList.add(new Employee(3, "Nikunj"));
		return employeeList;
	}
}
