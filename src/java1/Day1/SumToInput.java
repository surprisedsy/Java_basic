package java1.Day1;
import java.util.*;


public class SumToInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ют╥б : ");
		int count = scanner.nextInt();
		int temp = 0;
		
		for (int i = 0; i <= count ; i++)
		{			
			temp += i;
		}
		
		System.out.println(temp);
	}
}
