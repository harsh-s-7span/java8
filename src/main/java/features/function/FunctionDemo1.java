package features.function;

import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionDemo1
{
	public static void main(String[] args)
	{
		// return the length of the string
		Function<String, Integer> function = str -> str.length();
		System.out.println(function.apply("Harsh"));
		System.out.println(function.apply("Hello World"));

		System.out.println();

		// return the square of the integer
		Function<Integer, Integer> squareNumber = i -> i*i;
		System.out.println(squareNumber.apply(4));
		System.out.println(squareNumber.apply(8));

		System.out.println();

		// remove white space from the string
		Function<String, String> removeSpace = str -> {
			if(str == null || str.isEmpty())
				return str;

			return str.replaceAll(" ", "");
		};

		System.out.println(removeSpace.apply("My Name Is Harsh"));
		System.out.println(removeSpace.apply(null));
		System.out.println(removeSpace.apply("          "));
		System.out.println(removeSpace.apply("Java Is Very Popular Language"));

		System.out.println();

		// count the total white space in the string
		Function<String, Integer> countTotalSpace = str -> {
			if (str == null || str.isEmpty())
				return 0;

			return str.length() - str.replaceAll(" ", "").length();
		};

		System.out.println(countTotalSpace.apply("How many whites spaces are in this"));
	}
}
