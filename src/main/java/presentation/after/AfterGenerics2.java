package presentation.after;

public class AfterGenerics2
{
	public static void main(String[] args)
	{
		// TODO: Create one GenericProduct class using generic

		GenericProduct<String, String> laptop = new GenericProduct<>("101", "Laptop");

		String id = laptop.getId();
		String name = laptop.getName();
	}
}
