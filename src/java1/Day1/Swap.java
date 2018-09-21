package java1.Day1;

public class Swap {
	
	public static void main(String[] args)
	{
		int n1 = 10;
		int n2 = 30;
		
		if(n1 < n2)
		{
			int temp = n1;
			n1 = n2;
			n2 = temp;  // 두 변수의 값을 바꾸는 방법			
		}
		
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;
		
		if(a1 >= a2 && a1 >= a3)
		{
			System.out.println(a1);
		}
		if(a2 > a1 && a2 >= a3)
		{
			System.out.println(a2);
		}
		if(a3 > a1 && a3 > a2)
		{
			System.out.println(a3);
		}		
	}
}
