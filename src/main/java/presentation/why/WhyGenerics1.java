package presentation.why;

import java.util.ArrayList;
import java.util.List;

public class WhyGenerics1
{
	public static void main(String[] args)
	{
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(100);
		integerList.add(200);

		List<String> stringList = new ArrayList<>();
		stringList.add("Anup");
		stringList.add("Rimpal");
		stringList.add("Nandani");

		Integer num1 = integerList.get(0);
		String str1 = stringList.get(0);


	}
}
