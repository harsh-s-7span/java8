package features.streams;

import java.util.Arrays;
import java.util.List;

public class StreamDemo4
{
	public static void main(String[] args)
	{
		// toArray() method of stream

		List<Character> name = Arrays.asList('H', 'A', 'R', 'S', 'H');
		Character[] alphabetArray = name.stream().toArray(Character[]::new);

		for (Character c : alphabetArray)
			System.out.printf(c + "");
	}
}
