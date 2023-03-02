package multi_threading.synchronization.need_static_block;

public class MyThreadA extends Thread
{
	BookTheaterSeat bookTheaterSeat;
	int seats;
	public MyThreadA(BookTheaterSeat bookTheaterSeat, int seats)
	{
		this.bookTheaterSeat = bookTheaterSeat;
		this.seats = seats;
	}

	@Override
	public void run()
	{
		bookTheaterSeat.bookSeats(this.seats);
	}
}
