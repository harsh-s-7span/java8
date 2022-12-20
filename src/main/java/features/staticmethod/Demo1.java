package features.staticmethod;

public class Demo1 implements StaticMethodInterface1
{
	public static void main(String[] args)
	{
		Demo1 demo1 = new Demo1();
		// demo1.test();
		// Demo1.test();
		StaticMethodInterface1.test();
	}
}

interface StaticMethodInterface1{
	static void test()
	{
		System.out.println("Static method...");
	}
}