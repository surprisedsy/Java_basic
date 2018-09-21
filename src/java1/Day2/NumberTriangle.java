package java1.Day2;

public class NumberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length != 1)
		{
			System.out.println("입력 1 : ");
		}
		
		int count = new Integer(args[0]).intValue(); // 문자열을 정수형으로 변환
		//int count = Integer.parseInt(args[0]);
		
		for(int i = 0; i <= count; i++)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}
}
