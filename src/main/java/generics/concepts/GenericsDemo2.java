package generics.concepts;

import generics.utils.Product;

// Without generics
public class GenericsDemo2
{
	// Before generics, we were using Object and everytime we are type casting it's value before using.
	// See the Product class.
	public static void main(String[] args)
	{
		Product product = new Product(1, "Mouse");
		int pId = (int) product.getId();
		String pDesc = (String) product.getDescription();

		System.out.println("Product id : " + pId);
		System.out.println("Product Desc : " + pDesc);
	}
}

