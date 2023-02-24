package presentation.bounds;

public class BoundDemo1B
{
	public static void main(String[] args)
	{
		System.out.println("Max is " + genericCompare("A", "Z"));
		System.out.println("Max is " + genericCompare('A', 'Z'));
		System.out.println("Max is " + genericCompare(100, 200));
		System.out.println("Max is " + genericCompare(50.41D, 50.52D));

	}
	public static <T extends Comparable> T genericCompare(T t1, T t2)
	{
		return t1.compareTo(t2) > 0 ? t1 : t2;
	}

}
