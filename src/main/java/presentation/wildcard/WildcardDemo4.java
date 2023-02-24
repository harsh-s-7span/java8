package presentation.wildcard;

import java.util.ArrayList;
import java.util.List;

public class WildcardDemo4
{
	public static void main(String[] args)
	{
		List<String> stringList = new ArrayList<>();
		stringList.add("Hello");
		stringList.add("Team");

		List<Integer> integerList = new ArrayList<>();
		integerList.add(100);
		integerList.add(200);

		print(stringList);
		print(integerList);

		print2(stringList);
		print2(integerList);
	}

	public static void print(List<?> list)
	{
		for (Object obj : list)
		{
			System.out.println(obj + " ");
		}
	}

	public static <T> void print2(List<T> list)
	{
		for (T t : list)
		{
			System.out.println(t + " ");
		}
	}
}