package java1.Day4;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "aaa";
		String b = a;
		String c = new String("aaa");
		
		System.out.println(a.equals(b));			// 값 비교 : true
		System.out.println(a == b);				// 주소 비교 : true	
		System.out.println(a == c);				// 주소 비교 : false
		System.out.println(a.equals(c));			// 값 비교 : true
	}
}
