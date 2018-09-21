package java1.Day3.Exceptions;

public class ArrayException {
	
	public static void main(String[] args)
	{
		int[] intArray = new int[5];
		intArray[0] = 0;
		
		try
		{
			for(int i = 0; i < 5; i++)
			{
				intArray[i + 1] = i + 1 + intArray[i];
				System.out.println("intAray[ " + i + "]" + "=" + intArray[i]);
			}
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
}
