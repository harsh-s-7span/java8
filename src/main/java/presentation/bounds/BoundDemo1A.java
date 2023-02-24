package presentation.bounds;

public class BoundDemo1A
{
	public static void main(String[] args)
	{
		displayNumbers(55);
		displayNumbers(15.51f);
		displayNumbers(88L);
		displayNumbers(33.44d);
	}
	// Purpose of this method is to print only numbers
	// This method can accept only types which extends the Number class.
	public static <T extends Number> void displayNumbers(T t)
	{
		System.out.println("Number is : " + t);
	}

}
