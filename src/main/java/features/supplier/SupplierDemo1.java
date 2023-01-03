package features.supplier;

import java.util.Date;
import java.util.function.Supplier;
public class SupplierDemo1
{
	public static void main(String[] args)
	{
		// supplier to get system date
		Supplier<Date> dateSupplier = () -> new Date();
		System.out.println("Date: " + dateSupplier.get());

		// supplier to get random name from given array.
		Supplier<String> randomeNameSupplier = () -> {
			String[] randomStrings = {"Bottle", "Book", "Pen", "Charger", "Table"};
			int x = (int) (Math.random() * 5);
			return randomStrings[x];
		};
		System.out.println("Random name : " + randomeNameSupplier.get());

		// supplier to get random OTP.
		Supplier<Integer> generateOpt = () -> {
			Double d = Math.random() * 999999;
			return d.intValue();
		};
		System.out.printf("OPT : " + generateOpt.get());
	}
}
