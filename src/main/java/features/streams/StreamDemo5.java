package features.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo5
{
	public static void main(String[] args)
	{
		Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6);
		integerStream.forEach(System.out::println);
		System.out.println("---");

		Stream<String> nameStream = Stream.of("Harsh", "Anup", "Nandani", "Rimpal");
		nameStream.filter(str -> str.length() > 5).forEach(System.out::printf);
		System.out.println("----");

		Integer[] intArray = new Integer[]{10,20,30,40,50,60};
		Stream<Integer> intArrayStream = Stream.of(intArray);
		intArrayStream.forEach(System.out::println);
		System.out.println("-----");

		Integer[][] twoDArray = new Integer[2][3];
		twoDArray[0][0] = 1;
		twoDArray[0][1] = 2;
		twoDArray[0][2] = 3;
		twoDArray[1][0] = 4;
		twoDArray[1][1] = 5;
		twoDArray[1][2] = 6;

		System.out.println("Stream of two dimension array..");
		Stream<Integer[]> twoDArrayStream = Stream.of(twoDArray);
		twoDArrayStream.forEach(integers -> {
			for(int i : integers)
				System.out.printf(i + " ");
			System.out.println();
		});
	}
}
