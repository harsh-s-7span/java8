package generics.bounds;

import generics.utils.Product;

import java.util.ArrayList;
import java.util.List;

public class BoundDemo6
{
	public static void main(String[] args)
	{
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "Charger"));
		productList.add(new Product(2, "Mouse"));
		print(productList);
	}

	// Here, I've used unBounded wildcard, I have to access it with object.
	// Because Object is the base class of all the objects/classes.
	public static void print(List<?> list)
	{
		for (Object o : list)
		{
			System.out.println(o);
		}
	}
}
