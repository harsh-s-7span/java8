package multi_threading.mt2;

public class JoinMethodDemo1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=6; i<=8; i++)
		{
			System.out.println(Thread.currentThread().getName() + " - " + i);
		}
	}

	public static void main(String[] args)
	{
		JoinMethodDemo1 tread1 = new JoinMethodDemo1();
		tread1.setName("child");
		tread1.start();

		for(int i=1; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName() + " - " + i);
			if(i==5)
			{
				try{
					tread1.join();
				}catch (Exception e){
					System.out.println("Exception Occurred : " + e.getMessage());
				}
			}
		}

		for(int i=9; i<=15; i++)
		{
			System.out.println(Thread.currentThread().getName() + " - " + i);
		}
	}
}
