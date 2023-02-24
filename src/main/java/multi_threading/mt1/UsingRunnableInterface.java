package multi_threading.mt1;

public class UsingRunnableInterface implements Runnable
{
	public static void main(String[] args)
	{
		UsingRunnableInterface firstThread = new UsingRunnableInterface();
		Thread thread1 = new Thread(firstThread);

		UsingRunnableInterface secondThread = new UsingRunnableInterface();
		Thread thread2 = new Thread(secondThread);

		UsingRunnableInterface thirdThread = new UsingRunnableInterface();
		Thread thread3 = new Thread(thirdThread);

		thread1.start();
		thread1.setName("Thread_1");

		thread2.start();
		thread2.setName("Thread_2");

		thread3.start();
		thread3.setName("Thread_3");
	}

	@Override
	public void run()
	{
		try{
			for(int i=1; i<=10; i++){
				System.out.println(Thread.currentThread().getName() + " - " + i);
			}
		}catch (Exception e){
			System.out.println("Exception occurred : " + e.getMessage());
		}
	}
}
