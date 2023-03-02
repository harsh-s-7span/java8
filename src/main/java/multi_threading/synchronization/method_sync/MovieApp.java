package multi_threading.synchronization.method_sync;

public class MovieApp extends Thread
{
	static BookTheaterSeat bookTheaterSeat = new BookTheaterSeat();
	int seats;
	@Override
	public void run()
	{
		bookTheaterSeat.bookSeats(this.seats);
	}

	public static void main(String[] args)
	{
		MovieApp person1 = new MovieApp();
		person1.seats = 7;
		person1.setName("Person_1");

		MovieApp person2 = new MovieApp();
		person2.seats = 8;
		person2.setName("Person_2");

		person1.start();
		person2.start();
	}
}
