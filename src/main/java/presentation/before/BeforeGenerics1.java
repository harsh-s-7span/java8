package presentation.before;

import java.util.ArrayList;
import java.util.List;

public class BeforeGenerics1
{
	public static void main(String[] args)
	{
		List list = new ArrayList();
		list.add(new Integer(100));
		list.add(new String("Hello"));

		Integer num = (Integer) list.get(0);
		String str = (String) list.get(1);

		System.out.println(num + " & " + str);
	}
}
