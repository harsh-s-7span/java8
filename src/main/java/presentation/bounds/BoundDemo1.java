package presentation.bounds;

public class BoundDemo1
{
	public static void main(String[] args)
	{
		displayGenerics("Hello");
		displayGenerics('H');
		displayGenerics(100);
	}

	// This method can accept any type of value and print it.
	public static <T> void displayGenerics(T t)
	{
		System.out.println("Generic : " + t);
	}
}
