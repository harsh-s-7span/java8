package features.anonymousinnerclass;

// Difference between anonymous inner class and lambda expression wrt "this" keyword
public class Demo4
{
	int x = 10;

	public static void main(String[] args)
	{
		Demo4 obj = new Demo4();
		obj.test1();
		obj.test2();
	}

	private void test1(){
		FunctionalInterfaceDemo demo = new FunctionalInterfaceDemo()
		{
			int x = 20;
			@Override
			public void callMe()
			{
				System.out.println("this keyword refers x = " + this.x);
			}
		};
		demo.callMe();
	}

	private void test2(){
		FunctionalInterfaceDemo demo = () -> {
			int x = 20;
			System.out.println("this keyword refers x = " + this.x);
		};
		demo.callMe();
	}
}

@FunctionalInterface
interface FunctionalInterfaceDemo
{
	void callMe();
}

