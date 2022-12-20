package features.anonymousinnerclass;

// Anonymous inner class example with lambda expression
public class Demo2
{
	public static void main(String[] args)
	{
		Runnable runnable = () -> {
			for(int i=1; i<=10; i++)
				System.out.println("Anonymous inner class : " + i);
		};

		Thread task1 = new Thread(runnable);
		task1.start();

		for(int i=1; i<=10; i++)
			System.out.println("Outer class : " + i);
	}
}
