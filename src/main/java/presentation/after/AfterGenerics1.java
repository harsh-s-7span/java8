package presentation.after;

import java.util.ArrayList;
import java.util.List;

public class AfterGenerics1
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();
		list.add(100);

		Integer i = list.get(0);
		System.out.println(i);


		List<String> stringList = new ArrayList<>();
		stringList.add("ABC");

		String str = stringList.get(0);
		System.out.println(str);

	}
}