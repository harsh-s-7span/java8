package presentation.method;

import presentation.utils.MyMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericMethod
{
	public static void main(String[] args)
	{
		List<Integer> integerList = new ArrayList<>();
		List<String> stringList = new ArrayList<>();

		integerList.add(1);
		integerList.add(2);

		stringList.add("Table");
		stringList.add("Chair");

		GenericMethod genericMethod = new GenericMethod();

		genericMethod.printElements(integerList);
		genericMethod.printElements(stringList);


		Map<String, String> stringStringMap = getMap("Hello", "Harsh");
		stringStringMap.get("Hello");

		Map<Integer, Integer> integerIntegerMap = getMap(1,21);
	}

	// generic method having void return type
	public <T> void printElements(List<T> list)
	{
		System.out.println("Inside printElements Static Method...");
		for(T t : list)
		{
			System.out.println("T Element : " + t);
		}
	}

	// TODO: Create static method that accepts two parameter
	// TODO: Type of parameter could be different
	// TODO: Inside method, create one map. Key is the type of first argument
	// TODO: Value is the type of second argument
	// TODO: put the data in map that is passed in this method
	// TODO: return that map

	public static <K, V> Map<K,V> getMap(K key, V value)
	{
		Map<K, V> map = new HashMap<>();
		map.put(key, value);
		return map;
	}
}
