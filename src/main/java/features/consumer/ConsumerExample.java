package features.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class ConsumerExample
{
	public static void main(String[] args)
	{
		List<ConsumerStudent> consumerStudentList = new ArrayList<>();
		ConsumerStudent.populate(consumerStudentList);

		Predicate<ConsumerStudent> checkMarks = consumerStudent -> consumerStudent.getMarks() >= 60;
		Function<ConsumerStudent, String> calculateGrade = obj -> {
			if(obj.getMarks() > 90)
				return "A";
			else if (obj.getMarks() >= 80)
				return "B";
			else if (obj.getMarks() >= 70)
				return "C";
			else if (obj.getMarks() >= 35)
				return "D";
			else
				return "E";
		};
		Consumer<ConsumerStudent> print = consumerStudent -> {
			System.out.println("Name: " + consumerStudent.getName() + "\n"
			+ "Marks: " + consumerStudent.getMarks() + "\n"
			+ "Grade: " + calculateGrade.apply(consumerStudent));
		};

		for(ConsumerStudent consumerStudent : consumerStudentList){
			if(checkMarks.test(consumerStudent)){
				print.accept(consumerStudent);
				System.out.println("------------------------------");
			}
		}

	}

}