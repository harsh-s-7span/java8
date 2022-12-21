package features.predicate;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.function.Predicate;

public class PredicateDemo2
{
	public static void main(String[] args)
	{
		// check whether collection is empty or not
		Predicate<Collection> collectionPredicate = collection -> collection.isEmpty();

		List<Integer> list = new ArrayList<>();
		list.add(1);
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Harsh");
		Set<Integer> set = new HashSet<>();

		System.out.println("Is Arraylist empty ? : " + collectionPredicate.test(list));
		System.out.println("Is LinkedList empty ? : " + collectionPredicate.test(linkedList));
		System.out.println("Is Set empty ? : " + collectionPredicate.test(set));
	}
}
