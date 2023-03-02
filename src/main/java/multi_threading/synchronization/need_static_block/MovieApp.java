package multi_threading.synchronization.need_static_block;

public class MovieApp
{
	public static void main(String[] args)
	{
		BookTheaterSeat obj1 = new BookTheaterSeat();
		MyThreadA myThread1 = new MyThreadA(obj1, 7);
		myThread1.setName("Person-1");
		MyThreadA myThread2 = new MyThreadA(obj1, 8);
		myThread2.setName("Person-2");

		BookTheaterSeat obj2 = new BookTheaterSeat();
		MyThreadA myThread3 = new MyThreadA(obj2, 7);
		myThread3.setName("Person-3");
		MyThreadA myThread4 = new MyThreadA(obj2, 8);
		myThread4.setName("Person-4");

		myThread1.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();
	}
}
