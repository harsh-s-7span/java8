package generics.concepts;

import generics.utils.GenericProduct;

// With generics
public class GenericsDemo3
{
	// After making Product Generic, The compiler will handle all the things with ensures type safety.
	public static void main(String[] args)
	{
		GenericProduct<Integer, String> product = new GenericProduct<>(1,"Mouse");
		int id = product.getId();
		String desc = product.getDescription();

		System.out.println("Product id : " + id);
		System.out.println("Description : " + desc);

		System.out.println();

		GenericProduct<String, String> product1 = new GenericProduct<>("A1", "Charger");
		String pId = product1.getId();
		String pDesc = product1.getDescription();

		System.out.println("Product id : " + pId);
		System.out.println("Description : " + pDesc);
	}
}
