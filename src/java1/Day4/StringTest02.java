package java1.Day4;

public class StringTest02 {
	
	public static void main(String[] args)
	{
		String a = new String(" abcd");
		String b = new String(",efg");
		
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();
		System.out.println( "-----" + a + "------" );
		
		a = a.replaceAll("ab", "12");
		System.out.println(a);					// 12cd, efg
		
		String s[] = a.split(", ");
		for(int i = 0; i < s.length; i++)
		{
			System.out.println(s[i]);			// 12cd
		}												//efg
		
		a = a.substring(3);						//d, efg
		System.out.println(a);					
		
		char c = a.charAt(2);
		System.out.println(c);					//e
		
	}
}
