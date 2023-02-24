package presentation.why;

import java.util.ArrayList;
import java.util.List;

public class WhyGenerics2
{
	public static void main(String[] args)
	{
		List integerList = new ArrayList();
		integerList.add(10);
		integerList.add(20);

		Integer i1 = (Integer) integerList.get(0);
		Integer i2 = (Integer) integerList.get(1);


		List<String> stringList = new ArrayList<>();
		stringList.add("Harsh");

		String str = stringList.get(0);
	}
}
