package java1.Day1;

public class Gugudan01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int i = 2;  // 2�ܺ��� ����
		int j = 1;
		
		while(i <= 9)
		{
			System.out.println("\t");
			
			while(j <= 9)
			{
				System.out.println(i + "x" + j + "=" + (i*j));
				j++;
			}		
			
			j = 1; // ���� �ܼ��� ���� j�� �ʱ�ȭ
			i++;
			
		}//end of while
*/		
		
		int i = 1;  // 2�ܺ��� ����
		int j = 1;
		
		while(j <= 9)
		{
			System.out.println("\t");
			
			while(i <= 9)
			{
				System.out.print(i + "x" + j + "=" + (i*j) + "\t");  // for�� ���� while�� ������ ����.
				i++;
			}		
			
			i = 1; // ���� �ܼ��� ���� i�� �ʱ�ȭ
			j++;
			
		}
	}//end of main

}
