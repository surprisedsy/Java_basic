package java1.Day1;

import java.util.Scanner; // ctr + shift + O �ϸ� �ڵ����� import

public class NHelloWorld01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("�Է°� : ");
		
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int result = 0;

		while (count > result) {
			System.out.println("Hello World");
			result++;
		}// end of while
		scanner.close();
		
		for (int i = 0; i < count; i++)
		{			
			System.out.println("Hello World");
		}// end of for
		
	}// end of main

}
