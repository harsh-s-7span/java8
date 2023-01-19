package generics.bounds;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoundDemo4
{
	public static void main(String[] args)
	{
		List<Integer> integerList = IntStream.range(1,10).boxed().collect(Collectors.toList());
		// This will compile time error, because Integer is not base class of Number
		// print(integerList);
		List<Object> intObjList = IntStream.range(1,10).boxed().collect(Collectors.toList());
		print(intObjList);
	}
	// Here, I have set lower bound of the type.
	// The type must be the base class of Number
	public static void print(List<? super Number> list)
	{
		list.add(111);
		for(Object i : list)
		{
			System.out.println(i);
		}
	}

}
