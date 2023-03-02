package multi_threading.synchronization.need_static_block;

public class BookTheaterSeat
{
	// Remove static keyword from variable and method to see the problem.
	static int totalSeats = 10;
	synchronized static public void bookSeats(int seats)
	{
		try
		{
			Thread.sleep(1000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Booking seats for " + Thread.currentThread().getName());

		if(totalSeats >= seats)
		{
			System.out.println(Thread.currentThread().getName() + ", you have successfully booked " + seats + " seats. Enjoy !!");
			totalSeats -= seats;
			System.out.println("Seats left : " + totalSeats);
		}else{
			System.out.println("Not enough seats to book. Sorry !!");
			System.out.println("Seats left : " + totalSeats);
		}
	}

}
