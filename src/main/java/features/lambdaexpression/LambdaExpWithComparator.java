package features.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpWithComparator
{
	public static void main(String[] args)
	{
		List<Employee> employeeList = Employee.getEmployeeList();

		Comparator<Employee> sortByEmpName = (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName());
		Comparator<Employee> sortByEmpId = (Employee e1, Employee e2) -> e1.getId() - e2.getId();

		Collections.sort(employeeList, sortByEmpName);
		System.out.println("Employees sort by name : " + employeeList);
		Collections.sort(employeeList, sortByEmpId);
		System.out.println("Employees sort by id : " + employeeList);
	}
}
