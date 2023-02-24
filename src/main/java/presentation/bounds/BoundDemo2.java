package presentation.bounds;

import java.io.Serializable;

public class BoundDemo2
{
	public static void main(String[] args)
	{
		// findMaxNumber('H', 'V', 'S');
		findMaxNumber(10, 20, 30);
		findMaxNumber(30, 4, 59);
	}


	// What if I do not allow someone to compare string from this method. I want to allow only numbers to be compared.
	// That's why, We have set the upper bound that type must extend Number & Comparable.
	public static <T extends Integer> void findMaxNumber(T t1, T t2, T t3)
	{
		T max = t1;
		if(t2.compareTo(max) > 0)
			max = t2;
		if(t3.compareTo(max) > 0)
			max = t3;

		System.out.println("Max is " + max);
	}
}
