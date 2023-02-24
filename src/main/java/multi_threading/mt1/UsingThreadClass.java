package multi_threading.mt1;

public class UsingThreadClass extends Thread
{
	@Override
	public void run()
	{
		try
		{
			for(int i=1; i<=10; i++)
			{
				System.out.println("Child Thread : " + i);
			}
		}
		catch (Exception e){
			System.out.println("Exception Occurred : " + e);
		}
	}

	public static void main(String[] args)
	{
		UsingThreadClass thread1 = new UsingThreadClass();
		thread1.start();

		try
		{
			for(int i=1; i<=10; i++)
			{
				System.out.println("Main Thread : " + i);
			}
		}
		catch (Exception e){
			System.out.println("Exception Occurred : " + e);
		}
	}
}
