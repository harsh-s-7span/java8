package features.predicate;

import java.util.function.Predicate;

public class PredicateDemo4
{
	public static void main(String[] args)
	{
		Predicate<PredicateEmployee> isHarsh = Predicate.isEqual(new PredicateEmployee(1, "Harsh", 22, "Porbandar"));

		PredicateEmployee emp1 = new PredicateEmployee(1, "Harsh", 22, "Porbandar");
		PredicateEmployee emp2 = new PredicateEmployee(2, "Anup", 25, "Ahmedabad");

		System.out.println(isHarsh.test(emp1));
		System.out.println(isHarsh.test(emp2));

	}
}
