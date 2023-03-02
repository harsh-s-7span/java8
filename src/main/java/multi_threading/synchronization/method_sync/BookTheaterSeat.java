package multi_threading.synchronization.method_sync;

public class BookTheaterSeat
{
	int totalSeats = 10;
	synchronized public void bookSeats(int seats)
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
