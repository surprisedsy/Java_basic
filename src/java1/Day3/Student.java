package java1.Day3;

public class Student extends Person{
	
	private String grade;
	private String major;
	
	
	public Student(int age, String name, int height, int weight)
	{
		super (age, name, height, weight);
	}
	
	public Student(String name)
	{
		super(name);
	}
	
	public void setGrade(String grade)
	{
		this.grade = grade;
	}
		
	public String getGrade() {
		return grade;
	}

	public void set()
	{
		age = 30;
		//name = "gildong";
		height = 175;
		weight = 68;
	}
}
