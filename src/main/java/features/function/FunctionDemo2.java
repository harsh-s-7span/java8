package features.function;

import java.util.function.Function;

public class FunctionDemo2
{
	public static void main(String[] args)
	{
		Student harsh = new Student("Harsh", 70);
		Student anup = new Student("Anup", 90);

		Function<Student, String> printGrades = student -> {
			if(student == null)
				return null;

			Integer marks = student.getMarks();
			if(marks > 80 && marks < 100)
				return "Distinction";
			else if (marks > 60 && marks <= 80)
				return "A";

			return "Pass";
		};

		System.out.println(harsh.getName() + " : " + printGrades.apply(harsh));
		System.out.println(anup.getName() + " : " + printGrades.apply(anup));
	}
}
