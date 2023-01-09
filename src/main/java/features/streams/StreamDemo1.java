package features.streams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1
{
	public static void main(String[] args)
	{
		// collect and count method

		List<String> names = Arrays.asList("Harsh", "Anup", "Rimpal", "Hetvi", "Nandani", "Satyajit", "Nikunj");
		System.out.println("Before filter : " + names);

		List<String> filteredNames1 = names.stream().filter(str -> str.length() > 5).collect(Collectors.toList());
		System.out.println("Names having length gt 5 : " + filteredNames1);

		LinkedList<String> filteredNames2 = names.stream().filter(str -> str.charAt(0) == 'H').collect(Collectors.toCollection(LinkedList::new));
		System.out.println("Names having first char is 'H' : " + filteredNames2);

		Set<String> filteredNames3 = names.stream().filter(str -> str.charAt(str.length()-1) == 'i').collect(Collectors.toSet());
		System.out.println("Names having last character is 'i' : " + filteredNames3);

		Supplier<Stream<String>> nameFilterSupplier = () -> names.stream().filter(str -> str.charAt(1) == 'a');
		System.out.println("Names having second character is 'a' (Use of Collectors.joining())");
		System.out.println("- joining() : " + nameFilterSupplier.get().collect(Collectors.joining()));
		System.out.println("- joining(arg) : " + nameFilterSupplier.get().collect(Collectors.joining(",")));
		System.out.println("- joining(delimiter, prefix, suffix) : " + nameFilterSupplier.get().collect(Collectors.joining(",", "(", ")")));

		long remainingNamesCount = names.stream().filter(str -> str.length() <= 5).count();
		System.out.println("Remaining names : " + remainingNamesCount);

		System.out.println("-----------");

		Map<String, Integer> stuMarksMap = new HashMap<>();
		stuMarksMap.put("Harsh", 50);
		stuMarksMap.put("Anup", 87);
		stuMarksMap.put("Hetvi", 57);
		stuMarksMap.put("Rimpal", 75);
		stuMarksMap.put("Nandani", 60);
		stuMarksMap.put("Satyajit", 89);

		List<String> filteredKeys = stuMarksMap.keySet().stream().filter(key -> stuMarksMap.get(key) <= 60).collect(Collectors.toList());

		System.out.println("Marks less then or equal to 60 : " + filteredKeys);
	}
}
