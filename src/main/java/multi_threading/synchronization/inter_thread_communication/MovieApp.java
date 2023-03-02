package multi_threading.synchronization.inter_thread_communication;

public class MovieApp
{
	public static void main(String[] args) throws InterruptedException
	{
		TotalEarning totalEarning = new TotalEarning();
		totalEarning.start();

		//		try
		//		{
		//			totalEarning.join();
		//		}catch (Exception e)
		//		{
		//			e.printStackTrace();
		//		}
		synchronized (totalEarning)
		{
			totalEarning.wait();
			System.out.println("Total Earning is : " + totalEarning.total);
		}

	}
}
