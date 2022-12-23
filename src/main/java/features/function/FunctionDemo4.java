package features.function;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo4
{
	// increment salary and count total salary
	public static void main(String[] args)
	{
		List<Employee> employeeList = Employee.getEmployees();

		Predicate<Integer> doIncrement = salary -> salary < 10000;

		Function<List<Employee>, Integer> countTotalSalary = empList -> {
			Integer total = 0;
			Integer increment = 500;

			for(Employee employee : empList){
				if(doIncrement.test(employee.getSalary())){
					System.out.println("Salary increment of employee : " + employee.getName());
					employee.setSalary(employee.getSalary() + increment);
				}

				total = total + employee.getSalary();
			}
			return total;
		};

		System.out.println(countTotalSalary.apply(employeeList));


	}
}
