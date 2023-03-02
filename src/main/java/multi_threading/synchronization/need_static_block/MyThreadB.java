package multi_threading.synchronization.need_static_block;

public class MyThreadB extends Thread
{
	BookTheaterSeat bookTheaterSeat;
	int seats;
	public MyThreadB(BookTheaterSeat bookTheaterSeat, int seats)
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
