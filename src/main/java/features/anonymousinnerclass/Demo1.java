package features.anonymousinnerclass;

// Anonymous inner class example without lambda expression
public class Demo1
{
	public static void main(String[] args)
	{
		Runnable runnable = new Runnable()
		{
			@Override
			public void run()
			{
				for(int i=1; i<=10; i++)
					System.out.println("Anonymous Inner class : " + i);
			}
		};

		Thread task1 = new Thread(runnable);
		task1.start();

		for(int i=1; i<=10; i++)
			System.out.println("Outer class : " + i);
	}
}
