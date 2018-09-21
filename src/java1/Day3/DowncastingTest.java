package java1.Day3;

public class DowncastingTest {
	
	public static void main(String[] args)
	{
		Person p = new Student("gildongA-PPA");
		Student s = (Student) p;
		
		System.out.println(s.getName());
		s.setGrade("B");
		System.out.println(s.getGrade());
	}
}
