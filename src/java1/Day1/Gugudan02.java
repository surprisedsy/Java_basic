package java1.Day1;

public class Gugudan02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 9; i++)
		{
			System.out.println("\t");			
						
			for (int j = 1; j <= 9; j++)
			{
				//System.out.println(i + "*" + j + "=" + (i*j));      // println -> ����Ű ��� ����.
				System.out.print(j + "*" + i + "=" + (j*i) + "\t");  // print -> �ٹٲ� ���� ������ �ٿ�����.
			}
		}
	}

}
