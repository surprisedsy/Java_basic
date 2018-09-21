package java1.Day4;

public class WrapperClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Integer i = new Integer(10);
		System.out.println(i);
		
		Character c = new Character('c');
		System.out.println(c);
		
		Float f = new Float(3.14);
		System.out.println(f);
		
		Boolean b = new Boolean(true);
		System.out.println(b);*/
		
		
		Integer i = new Integer("10");
		System.out.println(i);
		System.out.println(i.intValue());						// string -> int형 변환에 사용. 둘 중 어떤걸 써도 상관 없음. 근데 엄청 많이 씀.
		System.out.println(Integer.parseInt("10"));
				
		
		Double d = new Double("3.14");
		System.out.println(d);
		
		Boolean b = new Boolean("false");
		System.out.println(b);
	}

}
