package features.lambdaexpression;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingWithoutLE
{
	public static void main(String[] args)
	{
		List<Employee> employeeList = Employee.getEmployeeList();
		System.out.println("Before Sorting : " + employeeList);
		Collections.sort(employeeList, new Comparator<Employee>()
		{
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o2.getId() - o1.getId();
			}
		});
		System.out.println("After Sorting : " + employeeList);
	}
}
