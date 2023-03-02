package multi_threading.executor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo1
{
	public static void main(String[] args)
	{
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		MyThread myThread1 = new MyThread();
		MyThread myThread2 = new MyThread();
		MyThread myThread3 = new MyThread();

		Thread thread1 = new Thread(myThread1);
		thread1.setName("A");
		Thread thread2 = new Thread(myThread2);
		thread2.setName("B");
		Thread thread3 = new Thread(myThread3);
		thread3.setName("C");

		System.out.println("Starting....");

		executorService.execute(thread1);
		executorService.execute(thread2);
		executorService.execute(thread3);
	}
}

class MyThread implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1; i<5; i++)
		{
			System.out.println(Thread.currentThread().getName() + " -- " + i);
		}
	}
}
