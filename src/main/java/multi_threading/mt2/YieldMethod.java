package multi_threading.mt2;

public class YieldMethod implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1; i<=3; i++)
		{
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + " -> " + i);
		}
	}

	public static void main(String[] args)
	{
		YieldMethod task1 = new YieldMethod();
		Thread thread1 = new Thread(task1);

		YieldMethod task2 = new YieldMethod();
		Thread thread2 = new Thread(task2);

		YieldMethod task3 = new YieldMethod();
		Thread thread3 = new Thread(task3);

		thread1.start();
		thread2.start();
		thread3.start();
	}
}
