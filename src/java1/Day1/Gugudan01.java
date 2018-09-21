package java1.Day1;

public class Gugudan01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int i = 2;  // 2단부터 시작
		int j = 1;
		
		while(i <= 9)
		{
			System.out.println("\t");
			
			while(j <= 9)
			{
				System.out.println(i + "x" + j + "=" + (i*j));
				j++;
			}		
			
			j = 1; // 다음 단수를 위해 j값 초기화
			i++;
			
		}//end of while
*/		
		
		int i = 1;  // 2단부터 시작
		int j = 1;
		
		while(j <= 9)
		{
			System.out.println("\t");
			
			while(i <= 9)
			{
				System.out.print(i + "x" + j + "=" + (i*j) + "\t");  // for문 말고 while로 오른쪽 정렬.
				i++;
			}		
			
			i = 1; // 다음 단수를 위해 i값 초기화
			j++;
			
		}
	}//end of main

}
