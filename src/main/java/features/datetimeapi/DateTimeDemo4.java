package features.datetimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Map;

public class DateTimeDemo4
{
	public static void main(String[] args)
	{
		ZoneId zone = ZoneId.systemDefault();
		System.out.println("System default zone : " + zone);
		System.out.println();

		Map<String, String> zoneIdMap = zone.SHORT_IDS;

		ZoneId zoneId;
		for(Map.Entry<String, String> entry : zoneIdMap.entrySet())
		{
			zoneId = ZoneId.of(entry.getValue());
			System.out.println(entry.getKey() + "  -  " + entry.getValue());
			System.out.println("=> Zone Id : " + zoneId.getId());
			System.out.println("=> Zone Name : " + zoneId.getDisplayName(TextStyle.FULL, Locale.US));
			System.out.println("=> Zone current time : " + ZonedDateTime.now(zoneId));
			System.out.println("-------------------------------------");
		}

	}
}
