package features.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo2
{
	public static void main(String[] args)
	{
		List<ConsumerTest> consumerTestList = ConsumerTest.populateObjects();

		Consumer<List<ConsumerTest>> printObj = consumerTest -> consumerTest.forEach(obj -> System.out.println(obj.toString()));

		System.out.println("Print List of objects");
		printObj.accept(consumerTestList);

	}
}