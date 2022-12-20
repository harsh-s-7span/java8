package features.defaultmethod;

public class Demo1{
	public static void main(String[] args)
	{
		Impl1 impl1 = new Impl1();
		impl1.test1();
		Impl2 impl2 = new Impl2();
		impl2.test2();
	}
}

class Impl1 implements InterfaceExp
{
	void test1(){
		Impl1 impl1 = new Impl1();
		impl1.callMe();
	}
}

class Impl2 implements InterfaceExp{
	@Override
	public void callMe()
	{
		System.out.println("Changing the implementation....");
	}
	void test2(){
		Impl2 impl2 = new Impl2();
		impl2.callMe();
	}

}

interface InterfaceExp{
	default void callMe(){
		System.out.println("Default implementation of the method...");
	}
}