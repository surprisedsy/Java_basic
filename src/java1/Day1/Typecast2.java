package java1.Day1;

public class Typecast2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b;
		int i = 414;
		float f = 123.456f;
		
		b = (byte)i;
		System.out.println("int 414��  byte�� ��ȯ : " + b);
		i = (int)f;
		System.out.println("float 123.456�� int�� ��ȯ : " + i);
		b = (byte)f;
		System.out.println("float 123.456�� int�� ��ȯ : " + b);
	}
}
