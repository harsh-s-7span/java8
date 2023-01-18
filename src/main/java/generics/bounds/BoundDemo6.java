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

	public static void print(List<?> list)
	{
		for (Object o : list)
		{
			System.out.println(o);
		}
	}
}
