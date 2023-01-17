package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo1
{
	public static void main(String[] args)
	{
		System.out.println(genericMethod("Harsh", "Anup"));
		System.out.println(genericMethod(500,600));
		System.out.println(genericMethod('A', 'B'));
	}

	static <T> List<T> genericMethod(T arg1, T arg2)
	{
		List<T> list = new ArrayList<>();
		list.add(arg1);
		list.add(arg2);
		return list;
	}
}
