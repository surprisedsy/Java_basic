package java1.Day1;
import java.util.*;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int result = 1;
		
		System.out.print("������ų �� : ");
		
		int pow = scanner.nextInt();
		
		
		/*while(result > 0)
		{
			result = (int) Math.pow(pow, 2);
			System.out.println("2�� " + pow + "�������� " + result + " �Դϴ�.");
			break;
		}*/
		
		for (int i = 0; i < 10; i++)
		{
			i = (int) Math.pow(pow, 2);
			System.out.println("2�� " + pow + "�������� " + i + " �Դϴ�.");
		}
	}

}
