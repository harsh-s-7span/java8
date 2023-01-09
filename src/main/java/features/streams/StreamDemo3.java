package features.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3
{
	public static void main(String[] args)
	{

		// min(), max() and forEach() of stream

		List<Integer> integerList = Arrays.asList(5,39,28,50,85,48,3,58,39,65,89,54,47);
		System.out.println("Main Integer List : " + integerList);

		Supplier<Comparator<Integer>> intComparatorSupplier = () -> (val1, val2) -> val1.compareTo(val2);
		Integer minNumber = integerList.stream().min(intComparatorSupplier.get()).orElse(null);
		Integer maxNumber = integerList.stream().max(intComparatorSupplier.get()).orElse(null);

		System.out.println("Min : " + minNumber);
		System.out.println("Max : " + maxNumber);

		System.out.println("---------");

		List<String> names = Arrays.asList("Harsh", "Anup", "Rimpal", "Hetvi", "Nandani", "Satyajit", "Nikunj");
		System.out.println("Name list : " + names);

		Supplier<Comparator<String>> stringComparatorSupplier = () -> (str1, str2) -> str1.compareTo(str2);
		String minName = names.stream().min(stringComparatorSupplier.get()).orElse(null);
		String maxName = names.stream().max(stringComparatorSupplier.get()).orElse(null);

		System.out.println("Min String : " + minName);
		System.out.println("Max String : " + maxName);

		System.out.println("-------");

		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);

		System.out.println("Original Map : " + map);
		map.keySet().stream().forEach(key -> map.put(key, map.get(key) + 10));
		System.out.println("Changed Map : " + map);

		System.out.println("Method reference in foreach : ");
		names.forEach(System.out::println);
	}
}
