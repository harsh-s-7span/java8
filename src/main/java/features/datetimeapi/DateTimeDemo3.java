package features.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class DateTimeDemo3
{
	public static void main(String[] args)
	{
		LocalDate birthday = LocalDate.of(2001, Month.APRIL, 30);
		LocalDate currentDate = LocalDate.now();

		// logic won't work for leap year. so I put a condition....
		if(!birthday.isLeapYear())
		{
			Period period = Period.between(currentDate, birthday);

			System.out.println("You are " + period.getYears() + " years, " + period.getMonths() + " months and " + period.getDays() + " days old.");

			int yearsToAdd = currentDate.getYear() - birthday.getYear();

			LocalDate nextBirthday = birthday.plusYears(yearsToAdd);
			System.out.println("Next birthday date : " + nextBirthday);

			Period period1 = Period.between(nextBirthday, currentDate);
			System.out.println("Wising you a very happy birthday in advance ;) \n Your next birthday " + period1.getYears() + " years, " + Math.abs(period1.getMonths()) + " months, " + Math.abs(period1.getDays()) + " days to go :)");
		}
	}
}
