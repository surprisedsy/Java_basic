package java1.Day4;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/*	String greeting = "Hello JAVA!";
		System.out.println(greeting.charAt(0));
		System.out.println(greeting.charAt(10));
		System.out.println(greeting.substring(1,  3));
		
		
		String str1 = "hello Java";
		String str2 = str1.toUpperCase();
		String str3 = str2.concat("??");
		String str4 = "!".concat(str2).concat("@");
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);*/
		
		
		
		
		
		/*String s1 = "abcd";
		String s2 = new String("abcd");
		String s3 = s1;
		String s4 = "abcd";						// String pool
		
		System.out.println("(s1 == s2) : " + (s1 == s2));
		System.out.println("(s1 == s3) : " + (s1 == s3));
		System.out.println("(s1 == s4) : " + (s1 == s4));
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("s1.equals(s3) : " + s1.equals(s3));
		System.out.println("s1.equals(s4) : " + s1.equals(s4));*/
		
		
		
		/*char letter = 'A';
		System.out.println(letter);
		System.out.println((int)letter);		// int�� 4byte�� char�� 2byte�ϱ� (int) ����
		
		
		
		String greeting = "Hello JAVA!";
		System.out.println(greeting);
		
		//System.out.println("Hello  "JAVA!");
		System.out.println("Hello \"JAVA!\"\n");
		System.out.println("Hello \"JAVA!\"");		//Ư���� ���� �տ��� \ ���ָ� ��µ�
*/		
				
		
		/*Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);
		
		if(a.equals(b))
			System.out.println("�簢�� a�� �簢�� b�� �����ϴ�.");
		else
			System.out.println("�簢�� a�� �簢�� b�� �ٸ��ϴ�.");
		
		if(a.equals(c))
			System.out.println("�簢�� a�� �簢�� c�� �����ϴ�.");
		else
			System.out.println("�簢�� a�� �簢�� c�� �ٸ��ϴ�.");
		
		if(b.equals(c))
			System.out.println("�簢�� b�� �簢�� c�� �����ϴ�.");
		else
			System.out.println("�簢�� b�� �簢�� c�� �ٸ��ϴ�.");*/
		
		
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = a;
		
		
		System.out.println("a == b : " + (a == b));
		System.out.println("a == c : " + (a == c));
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		
		System.out.println("a.equals(b) : " + (a.equals(b)));
		System.out.println("a.equals(c) : " + (a.equals(c)));
		
		/*System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p);	*/				// �ƹ��͵� �Ⱦ��� println�� toString�� ȣ�������.
	}

}
