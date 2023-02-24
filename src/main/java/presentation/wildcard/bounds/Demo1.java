package presentation.wildcard.bounds;

import presentation.wildcard.bounds.utils.Father;
import presentation.wildcard.bounds.utils.GrandFather;
import presentation.wildcard.bounds.utils.Son;

import java.util.ArrayList;
import java.util.List;

public class Demo1
{
	public static void main(String[] args)
	{
		List<GrandFather> grandFatherList = new ArrayList<>();
		List<Father> fatherList = new ArrayList<>();
		List<Son> sonList = new ArrayList<>();



		// test(grandFatherList);
		test(fatherList);
		test(sonList);
	}

	public static void test(List<? extends Father> fatherList)
	{
		// fatherList.add(fatherList.get(0));
		// sonList.add(new Son());
		// sonList.add(new Father());

		for(Father father : fatherList)
		{
			System.out.println(father);
		}
	}

	public static <T extends Father> void test2(List<T> sonList)
	{
		sonList.add(sonList.get(0));
		// sonList.add(new Son());
		// sonList.add(new Father());
	}
}
