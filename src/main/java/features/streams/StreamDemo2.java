package features.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2
{
	// sort method of stream
	public static void main(String[] args)
	{
		List<String> names = Arrays.asList("Harsh", "Anup", "Rimpal", "Hetvi", "Nandani", "Satyajit", "Nikunj");
		System.out.println("Main list of names : " + names);

		List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted names : " + sortedNames);

		List<StreamEmployee> employeeList = StreamEmployee.getEmployees();

		Comparator<StreamEmployee> sortByIdDesc = new Comparator<StreamEmployee>()
		{
			@Override
			public int compare(StreamEmployee o1, StreamEmployee o2)
			{
				return o1.getId() == o2.getId() ? 0 : o1.getId() > o2.getId() ? -1 : 1;
			}
		};

		List<StreamEmployee> sortByIdDescList = employeeList.stream().sorted(sortByIdDesc).collect(Collectors.toList());
		System.out.println("Sort by id desc : " + sortByIdDescList);

		Comparator<StreamEmployee> sortByNameDesc = new Comparator<StreamEmployee>()
		{
			@Override
			public int compare(StreamEmployee o1, StreamEmployee o2)
			{
				return -(o1.getName().compareTo(o2.getName()));
			}
		};

		List<StreamEmployee> sortByNameDescList = employeeList.stream().sorted(sortByNameDesc).collect(Collectors.toList());
		System.out.println("Sort by name desc : " + sortByNameDescList);
	}
}
