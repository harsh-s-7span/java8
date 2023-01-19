package generics.bounds;

public class BoundDemo1
{
	public static void main(String[] args)
	{
		displayGenerics("Hello");
		displayGenerics('H');
		displayGenerics(100);

		System.out.println();

		displayNumbers(55);
		displayNumbers(15.51f);
		displayNumbers(88L);
		displayNumbers(33.44d);

		System.out.println();

		System.out.println("Max is " + genericCompare("A", "Z"));
		System.out.println("Max is " + genericCompare('A', 'Z'));
		System.out.println("Max is " + genericCompare(100, 200));
		System.out.println("Max is " + genericCompare(50.41D, 50.52D));
	}

	// This method can accept any type of value and print it.
	public static <T> void displayGenerics(T t)
	{
		System.out.println("Generic : " + t);
	}

	// Purpose of this method is to print only numbers
	// This method can accept only types which extends the Number class.
	public static <T extends Number> void displayNumbers(T t)
	{
		System.out.println("Number is : " + t);
	}
	// purpose of this method is to compare two type of object. So we have to bound our type.
	// This method can accept only types which extends the Comparable interface.
	public static <T extends Comparable> T genericCompare(T t1, T t2)
	{
		return t1.compareTo(t2) > 0 ? t1 : t2;
	}

}
