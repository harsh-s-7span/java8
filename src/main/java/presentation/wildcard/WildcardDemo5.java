package presentation.wildcard;

import java.util.ArrayList;
import java.util.List;

public class WildcardDemo5
{
	public static void main(String[] args)
	{
		List<Float> src = new ArrayList<>();
		List<Integer> dest = new ArrayList<>();

		//copyNumbers1(src, dest);
		copyNumbers2(src, dest);
	}

	public static <T extends Number> void copyNumbers1(List<T> src, List<T> dest)
	{
		dest.addAll(src);
	}

	// the code is dependent on type parameter : unbound second approach
	public static void copyNumbers2(List<?> src, List<?> dest)
	{
		// dest.addAll(src);
	}
}
