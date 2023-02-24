package presentation.wildcard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WildcardDemo6
{
	public static void main(String[] args)
	{
		List<Integer> integerList = new ArrayList<>();
		List<Object> objectList = new ArrayList<>();

		test(integerList);
		test(objectList);

		test2(integerList);
		test2(objectList);
	}

	public static void test(List<?> list)
	{
		System.out.println("Size is " + list.size());
	}

	public static void test2(List<? extends Object> list)
	{
		System.out.println("Size is " + list.size());
	}
}

class Temp extends Object
{

}