package features.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
// CTRL + Click on Predicate to see the "default boolean test(T t)" method

public class PredicateDemo1
{
	public static void main(String[] args)
	{
		Predicate<Integer> integerPredicate = i -> i > 10;
		System.out.println(integerPredicate.test(100));
		System.out.println(integerPredicate.test(5));
		System.out.println(integerPredicate.test(10));
		System.out.println("---");
		Predicate<String> stringPredicate = str -> str.equals("Hello");
		System.out.println(stringPredicate.test("Hello"));
		System.out.println(stringPredicate.test("Welcome"));

		List<String> list = new ArrayList<>();
		list.add(null);
		list.add("");
		list.add("Harsh");

	}
}
