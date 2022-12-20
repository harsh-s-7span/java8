package features.functionainterface;

public class RunnableFuncInterfaceDemo
{
	public static void main(String[] args)
	{
		Runnable runnable = () -> {
			for (int i=0; i< 10; i++){
				System.out.println("Child Thread : " + i);
			}
		};

		Thread t1 = new Thread(runnable);
		t1.start();
		for (int i=0; i< 10; i++){
			System.out.println("Main Thread : " + i);

		}
	}
}
