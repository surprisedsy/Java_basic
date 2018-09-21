package java1.Day4;

public class StringChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aBcAbCabcABC";
		
		
		System.out.println(str.charAt(2));
		
		System.out.println(str.indexOf("abc"));
		
		System.out.println(str.length());	
		
		System.out.println(str.replace('a', 'R'));
		System.out.println(str.replaceAll("abc", "123"));
		
		System.out.println(str.substring(0, 3));
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
	}

}
