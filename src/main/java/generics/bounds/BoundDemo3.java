package generics.bounds;

import java.util.ArrayList;
import java.util.List;

public class BoundDemo3
{
	public static void main(String[] args)
	{
		List<Family> families = new ArrayList<>();
		List<GrandFather> grandFatherList = new ArrayList<>();
		grandFatherList.add(new GrandFather("GrandFather"));
		List<Father> fatherList = new ArrayList<>();
		fatherList.add(new Father("Father"));
		List<Son> sonList = new ArrayList<>();
		sonList.add(new Son("Son"));
		List<GrandSon> grandSonList = new ArrayList<>();
		grandSonList.add(new GrandSon("GrandSon"));

		// familyTree(families); - cannot do that
		familyTree(grandFatherList);
		familyTree(fatherList);
		familyTree(sonList);
		familyTree(grandSonList);
	}

	// Use of wildcard, Here I don't know, which type of data come but
	// Whatever type come, I've set upper bound that It must extend the GrandFather class
	// There is one limitation with upper bound, we cannot modify the data. it's read-only.
	public static void familyTree(List<? extends GrandFather> list)
	{

		for(GrandFather i : list)
		{
			System.out.println("Class is " + i.getClass().getName());
			System.out.println("Name : " + i.name);
		}
		System.out.println();
	}
}
class Family{
	String name;

	public Family(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
class GrandFather extends Family{
	public GrandFather(String name)
	{
		super(name);
	}
}
class Father extends GrandFather{
	public Father(String name)
	{
		super(name);
	}
}
class Son extends Father{
	public Son(String name)
	{
		super(name);
	}
}
class GrandSon extends Son{
	public GrandSon(String name)
	{
		super(name);
	}
}
