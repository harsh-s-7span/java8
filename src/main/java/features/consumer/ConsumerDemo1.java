package features.consumer;

import java.util.function.Consumer;

public class ConsumerDemo1
{
	public static void main(String[] args)
	{
		Consumer<String> printConsumer = str -> System.out.println("Consuming " + str);
		printConsumer.accept("Harsh");
		printConsumer.accept("Shiyani");
		printConsumer.accept("Java Developer");
	}
}
