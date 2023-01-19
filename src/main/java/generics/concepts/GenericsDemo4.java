package generics.concepts;

// Generic Method Example
public class GenericsDemo4
{
	public static void main(String[] args)
	{
		Integer[] integers = new Integer[]{1,2,3};
		String[] strings = new String[]{"Harsh", "Anup", "Nandani"};
		Character[] characters = new Character[]{'H', 'A', 'R', 'S', 'H'};

		printData(integers);
		printData(strings);
		printData(characters);
	}

	// This is how, we can write generic method.
	// introduced type parameter for generic methods.
	public static <T> void printData(T[] elements)
	{
		for(T t : elements)
		{
			System.out.print(t + "  ");
		}
		System.out.println();
	}
}
