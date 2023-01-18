package generics.concepts;

import generics.utils.Product;

// Without generics
public class GenericsDemo2
{
	public static void main(String[] args)
	{
		Product product = new Product(1, "Mouse");
		int pId = (int) product.getId();
		String pDesc = (String) product.getDescription();

		System.out.println("Product id : " + pId);
		System.out.println("Product Desc : " + pDesc);
	}
}

