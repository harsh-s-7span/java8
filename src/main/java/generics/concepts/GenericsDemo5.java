package generics.concepts;

import generics.utils.GenericProduct;
import generics.utils.Product;

import java.util.HashMap;
import java.util.Map;

// Generic Method with Return
public class GenericsDemo5
{
	public static void main(String[] args)
	{
		Map<Integer, String> map1 = getMap(1, "Harsh");
		Map<String, String> map2 = getMap("A1", "Anup");
		Map<String, GenericProduct<Integer, String>> map3 = getMap("P1", new GenericProduct(1, "Laptop"));

		System.out.println(map1);
		System.out.println(map2);
		System.out.println(map3);
	}

	// Taking input is in key-value pair and return the map of same type of key and value.
	public static <K,V> Map<K,V> getMap(K k, V v)
	{
		Map<K, V> map = new HashMap<>();
		map.put(k, v);
		return map;
	}

}
