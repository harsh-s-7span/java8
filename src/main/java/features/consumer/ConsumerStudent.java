package features.consumer;

import java.util.List;

class ConsumerStudent{
	String name;
	Integer marks;
	String grade;
	public ConsumerStudent(String name, Integer marks){
		this.name = name;
		this.marks = marks;
	}

	public String getName(){
		return this.name;
	}
	public Integer getMarks(){
		return this.marks;
	}
	public String getGrade(){
		return this.grade;
	}
	public void setGrade(String grade){
		this.grade = grade;
	}
	
	public static List<ConsumerStudent> populate(List<ConsumerStudent> studentList){
		studentList.add(new ConsumerStudent("Harsh", 70));
		studentList.add(new ConsumerStudent("Anup", 80));
		studentList.add(new ConsumerStudent("Rimpal", 93));
		studentList.add(new ConsumerStudent("Sarthik", 55));
		studentList.add(new ConsumerStudent("Krutarth", 45));
		studentList.add(new ConsumerStudent("Nandani", 75));
		return studentList;
	}
}
