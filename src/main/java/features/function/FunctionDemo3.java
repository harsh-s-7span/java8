package features.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo3
{
	// find total salary of all the employees
	public static void main(String[] args)
	{
		List<Employee> employeeList = Employee.getEmployees();

		Function<List<Employee>, Integer> totalSalary = empList -> {
			Integer overallSalary = 0;
			for(Employee employee : empList)
				overallSalary = overallSalary + employee.getSalary();

			return overallSalary;
		};

		System.out.println("Total Salary is " + totalSalary.apply(employeeList));
	}
}
