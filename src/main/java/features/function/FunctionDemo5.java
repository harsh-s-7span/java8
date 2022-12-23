package features.function;

import java.util.function.Function;

public class FunctionDemo5
{
	// function chaining
	public static void main(String[] args)
	{
		String[] strings = {"This is Demo", "My Name is Harsh", "Java is language"};

		FunctionDemo5 demo = new FunctionDemo5();

		Function<String, String> capitalize = str -> str.toUpperCase();
		Function<String, String> subStr = str -> str.substring(0, 5);

		for(String str : strings){
			demo.check(capitalize.andThen(subStr), str);
		}
	}

	public void check(Function<String, String> function, String str){
		System.out.println(function.apply(str));
	}

}
