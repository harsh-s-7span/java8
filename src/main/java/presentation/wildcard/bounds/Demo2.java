package presentation.wildcard.bounds;

import presentation.wildcard.bounds.utils.Father;
import presentation.wildcard.bounds.utils.GrandFather;
import presentation.wildcard.bounds.utils.Son;

import java.util.ArrayList;
import java.util.List;

public class Demo2
{
	public static void main(String[] args)
	{
		List<GrandFather> grandFatherList = new ArrayList<>();
		List<Father> fatherList = new ArrayList<>();
		List<Son> sonList = new ArrayList<>();

		test(grandFatherList);
		test(fatherList);
		// test(sonList);
	}
	
	public static void test(List<? super Father> fatherList)
	{
		fatherList.add(new Father());
		for (Object obj : fatherList)
		{
			System.out.println(obj);
		}
	}
}
