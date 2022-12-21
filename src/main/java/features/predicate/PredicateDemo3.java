package features.predicate;

import java.util.function.Predicate;

// Predicate Joining
public class PredicateDemo3
{
	public static void main(String[] args)
	{
		PredicateDemo3 obj = new PredicateDemo3();

		Predicate<Integer> predicate1 = i -> i > 10;
		Predicate<Integer> predicate2 = i -> i % 2 == 0;
		int[] arr = {0, 5, 10, 15, 20, 25, 30, 35};

		System.out.println("The numbers greater then 10 are :");
		obj.m1(predicate1, arr);

		System.out.println("The even numbers are : ");
		obj.m1(predicate2, arr);

		System.out.println("The numbers not greater then 10 are : ");
		obj.m1(predicate1.negate(), arr);

		System.out.println("The numbers greater then 10 and even number are : ");
		obj.m1(predicate1.and(predicate2), arr);

		System.out.println("The numbers greater then 10 or even number are : ");
		obj.m1(predicate1.or(predicate2), arr);

	}
	public void m1(Predicate<Integer> predicate, int[] arr){
		for(int i : arr){
			if(predicate.test(i))
				System.out.print(i + " ");
		}
		System.out.println();
	}
}
