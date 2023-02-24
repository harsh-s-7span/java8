package presentation.wildcard;

import java.util.ArrayList;
import java.util.List;

public class WildcardDemo2A
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();
		list.add(1);

		printSize(list);
	}

	public static void printSize(List<?> list)
	{
		System.out.println("Size of the list is : " + list.size());
	}

}
