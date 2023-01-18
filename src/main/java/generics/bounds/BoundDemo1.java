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

	public static <T> void displayGenerics(T t)
	{
		System.out.println("Generic : " + t);
	}

	public static <T extends Number> void displayNumbers(T t)
	{
		System.out.println("Number is : " + t);
	}
	public static <T extends Comparable> T genericCompare(T t1, T t2)
	{
		return t1.compareTo(t2) > 0 ? t1 : t2;
	}

}
