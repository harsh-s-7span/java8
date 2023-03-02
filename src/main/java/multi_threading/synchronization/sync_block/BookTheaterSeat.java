package multi_threading.synchronization.sync_block;

public class BookTheaterSeat
{
	int totalSeats = 10;
	public void bookSeats(int seats)
	{
		try
		{
			Thread.sleep(1000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Booking seats for " + Thread.currentThread().getName());

		synchronized(this){
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

}
