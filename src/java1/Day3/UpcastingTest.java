package java1.Day3;

public class UpcastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student("gildong");
		Person p = s;
		
		System.out.println(p.getName());
		s.setGrade("A");
		System.out.println(s.getGrade());
	}

}
