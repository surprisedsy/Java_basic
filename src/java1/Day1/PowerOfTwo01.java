package java1.Day1;
import java.util.*;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int result = 1;
		
		System.out.print("제곱시킬 수 : ");
		
		int pow = scanner.nextInt();
		
		
		/*while(result > 0)
		{
			result = (int) Math.pow(pow, 2);
			System.out.println("2의 " + pow + "제곱근은 " + result + " 입니다.");
			break;
		}*/
		
		for (int i = 0; i < 10; i++)
		{
			i = (int) Math.pow(pow, 2);
			System.out.println("2의 " + pow + "제곱근은 " + i + " 입니다.");
		}
	}

}
