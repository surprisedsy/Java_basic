package java1.Day1;

public class Arith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		int b = 3;

/*		System.out.println(a + b); // 10
		System.out.println(a - b); // 3
		System.out.println(a * b); // 21
		System.out.println(a / b); // 2
		System.out.println(a % b); // 1
		System.out.println(-a); // -7

		System.out.println(++a); // 8
		System.out.println(a); // 8

		System.out.println(--b); // 2
		System.out.println(b); // 2

		System.out.println(a++); // 8
		System.out.println(a); // 9

		System.out.println(b--); // 2
		System.out.println(b); // 1
*/
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println((a > b) && (a < b));
		System.out.println((a > b) || (a < b));
				
		boolean x = 7 == 9;
		x = 9.5 >= 9.5;		
		System.out.println(x);  // true
		
		x = 8 != 9 - 1;
		System.out.println(x);  // false
		
		x = false == (10 == 0);
		System.out.println(x);  // true
		
	}

}
