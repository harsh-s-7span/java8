package features.anonymousinnerclass;

public class Demo3
{
	public static void main(String[] args)
	{
		// Anonymous inner class that extends concrete class - (lambda expression cannot do this)
		ConcreteDemo concreteDemo = new ConcreteDemo(){
			public void test(){
				System.out.println("Concrete class :: Changing the implementation");
			}
		};
		concreteDemo.test();

		// Anonymous inner class that extends abstract class - (lambda expression cannot do this)
		AbstractDemo abstractDemo = new AbstractDemo(){
			@Override
			public void first()
			{
				System.out.println("Abstract class :: First Method..");
			}

			@Override
			public void second()
			{
				System.out.println("Abstract class :: Second Method...");
			}
		};
		abstractDemo.first();
		abstractDemo.second();

		// Anonymous inner class that implements an interface - (lambda expression cannot do this)
		InterfaceExp interfaceExp = new InterfaceExp()
		{
			@Override
			public void method1()
			{
				System.out.println("Anonymous impl :: method 1");
			}

			@Override
			public void method2()
			{
				System.out.println("Anonymous impl :: method 2");
			}

			@Override
			public void method3()
			{
				System.out.println("Anonymous impl :: method 3");
			}
		};
		interfaceExp.method1();
		interfaceExp.method2();
		interfaceExp.method3();

		// Here only we can replace anonymous class with lambda expression
		InterfaceExp2 interfaceExp2 = () -> System.out.println("We can only use lambda expression here..");
		interfaceExp2.singleMethod();
	}
}

class ConcreteDemo{
	public void test(){
		System.out.println("Concrete Class method..");
	}
}

// Anonymous inner class that extends concrete class - (lambda expression cannot do this)
abstract class AbstractDemo{
	public abstract void first();
	public abstract void second();

}

interface InterfaceExp{
	void method1();
	void method2();
	void method3();
}

interface InterfaceExp2{
	void singleMethod();
}