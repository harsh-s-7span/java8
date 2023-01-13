package features.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;

public class DateTimeDemo2
{
	public static void main(String[] args)
	{
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Current Date & Time : " + dateTime);

		LocalDateTime customDateTime = LocalDateTime.of(2022, Month.FEBRUARY, 28, 12,00);
		System.out.println("Random Date & Time : " + customDateTime);
		System.out.println("Custom D&T Second : " + customDateTime.getSecond());

		System.out.println("Custom Date & Time : " + customDateTime);
		System.out.println("=> Adding 5 Days : " + customDateTime.plusDays(5));
		System.out.println("=> Adding 13 Hours : " + customDateTime.plusHours(13));
		System.out.println("=> Adding -1 month : " + customDateTime.plusMonths(-1));
		System.out.println("=> Adding 5 weeks : " + customDateTime.plusWeeks(5));
		System.out.println("=> Adding 1000 Years : " + customDateTime.plusYears(1000));
		System.out.println("=> Plus 10 days : " + customDateTime.plus(5, ChronoUnit.DAYS));
		System.out.println("=> Plus 5 Years : " + customDateTime.plus(Period.ofYears(5)));
		System.out.println("=> Plus 2 weeks : " + customDateTime.plus(Period.ofWeeks(2)));

		System.out.println();
		System.out.println("Custom Date & Time : " + customDateTime);
		LocalDate localDate = LocalDate.MAX;
		// Check this :)
		// System.out.println("=> Adding Max value of LocalDate in LocalDateTime : " + customDateTime.plus(Period.of(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth())));
		System.out.println("=> Subtracting Max value of LocalDate in LocalDateTime : " + customDateTime.minus(Period.of(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth())));

	}
}
