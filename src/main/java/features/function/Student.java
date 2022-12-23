package features.function;

public class Student
{
	String name;
	Integer marks;

	public Student(String name, Integer marks){
		this.name = name;
		this.marks = marks;
	}
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getMarks()
	{
		return marks;
	}

	public void setMarks(Integer marks)
	{
		this.marks = marks;
	}
}
