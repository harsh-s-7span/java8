package generics.concepts;

import generics.utils.Shape;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo6
{
	public static void main(String[] args)
	{
		List list = new ArrayList<>();
		list.add(1);
		list.add("Harsh");

		Shape<Integer> integerShape = new Shape<>();
		integerShape.setT(1);
		Shape rawShape = integerShape;
		System.out.println("rawShape object pointing to integerShape...");
		System.out.println("Raw shape : " + rawShape.getT());


		Shape rawShape2 = new Shape();
		rawShape2.setT("Hello");
		Shape<Integer> integerShape2 = rawShape2;

		System.out.println("IntegerShape2 pointing to rawShape2");
		System.out.println("Integer Shape 2 : " + integerShape2.getT());

		integerShape2.setT(10);
		System.out.println("Raw Shape 2 : " + rawShape2.getT());
	}
}
