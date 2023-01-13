package features.datetimeapi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.time.temporal.TemporalField;
import java.util.Locale;

public class DateTimeDemo1
{
	public static void main(String[] args)
	{
		// date & time api basics
		LocalDate localDate = LocalDate.now();
		System.out.println("Current date : " + localDate);
		System.out.println("\t Day : "+ localDate.getDayOfMonth());
		System.out.println("\t Month : " + localDate.getMonthValue());
		System.out.println("\t Year : " + localDate.getYear());
		System.out.println("\t Day of the week : " + localDate.getDayOfWeek().getValue());
		System.out.println("\t Day of the year : " + localDate.getDayOfYear());
		System.out.println("\t Name of the month : " + localDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
		System.out.println("\t Chronology calender type : " + localDate.getChronology().getCalendarType());
		System.out.println("\t Chronology display name : " + localDate.getChronology().getDisplayName(TextStyle.FULL_STANDALONE, Locale.ENGLISH));
		System.out.println("\t Era name : " + localDate.getEra().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
		System.out.println();

		LocalTime localTime = LocalTime.now();
		System.out.println("Current Time : " + localTime);
		System.out.println("\t Hour : " + localTime.getHour());
		System.out.println("\t Minute : " + localTime.getMinute());
		System.out.println("\t Second : " + localTime.getSecond());
		System.out.println("\t Nano : " + localTime.getNano());
	}
}
