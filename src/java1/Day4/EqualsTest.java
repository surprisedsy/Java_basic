package java1.Day4;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "aaa";
		String b = a;
		String c = new String("aaa");
		
		System.out.println(a.equals(b));			// �� �� : true
		System.out.println(a == b);				// �ּ� �� : true	
		System.out.println(a == c);				// �ּ� �� : false
		System.out.println(a.equals(c));			// �� �� : true
	}
}
