package java1.Day1;
import java.util.*;

public class PrimeDetect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.print("�Ҽ����� �Ǵ��� ���� : ");
		
		int divisor = 2;
		int num = stdin.nextInt();
		boolean isPrime = true;
	
		
		while(divisor <= num)
		{
			divisor++;
		}
		
		if(num % divisor != 0)
		{			
			System.out.println(num + "�� �Ҽ��Դϴ�.");			
		}
		else
		{
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
		}
		
		
		/*while (divisor <= num && isPrime)
		{
			isPrime = (num % divisor) != 0;
			divisor++;
		}
		
		if(isPrime)
		{
			System.out.println(num + "�� �Ҽ��Դϴ�.");
		}
		else
		{
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");	
		}*/
		
		
		
		
	}
}
