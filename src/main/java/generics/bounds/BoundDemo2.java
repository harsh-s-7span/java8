package generics.bounds;

public class BoundDemo2
{
	public static void main(String[] args)
	{
		findMaxGeneric(10, 20, 30);
		findMaxGeneric('A', 'H', 'Z');
		findMaxGeneric(12.9, 20.83, 56.34);
		System.out.println();
		// findMaxNumber('H', 'V', 'S');
		findMaxNumber(10, 20, 30);
		findMaxNumber(30, 4, 59);
	}

	// Created a method that find the max among the three values of same data type
	// The type should extend the Comparator interface, so that we can use compareTo() method without any exception
	public static <T extends Comparable> void findMaxGeneric(T t1, T t2, T t3)
	{
		T max = t1;
		if(t2.compareTo(max) > 0)
			max = t2;
		else if (t3.compareTo(max) > 0)
			max = t3;

		System.out.println("Max is " + max);
	}

	// What if I do not allow someone to compare string from this method. I want to allow only numbers to be compared.
	// That's why, We have set the upper bound that type must extend Number & Comparable.
	public static <T extends Number & Comparable> void findMaxNumber(T t1, T t2, T t3)
	{
		T max = t1;
		if(t2.compareTo(max) > 0)
			max = t2;
		if(t3.compareTo(max) > 0)
			max = t3;

		System.out.println("Max is " + max);
	}
}
