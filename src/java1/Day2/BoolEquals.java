package java1.Day2;

public class BoolEquals {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
				
		int[] a = {10, 20, 30};
		int[] b = {10, 20, 30};
		int[] c = null;
		
		boolean result = equals(a, b);
		
		System.out.println("equals(a, b) : " + result);		       // 값 자체를 비교 -> true
		System.out.println("a.equals(b) : " + (a.equals(b)));     // 밑에 두개는 주소를 비교 -> false
		System.out.println("a == b : " + (a == b));
		
		c = a;
		a[0] = 100;
		System.out.println("c[0] : " + c[0]);
		
		
	}
	
	
	public static boolean equals(int[] a, int[] b) {
		
		
		if(a == null)
		{
			return false;
		}
		
		if(b == null)
		{
			return false;
		}
		
		if(a.length != b.length)
		{
			return false;
		}
		
		int length = a.length;
		for(int i = 0; i < length; i++)
		{
			if(a[i] != b[i])
			{
				return false;
			}
		}
		
		return true;
		
		
		
		
		
		
		/*if (a.length != b.length) {
			return false;
		} else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					return false;
				}
			}
		}

		return true;
*/
	}
}
	
