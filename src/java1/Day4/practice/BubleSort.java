package java1.Day4.practice;

public class BubleSort {

	public void buble() {
		
		int[] bubleArray = { 5, 9, 3, 8, 60, 20, 1 };
		int temp = 0;

		for (int i = 0; i < bubleArray.length; i++)
		{
			for (int j = 0; j < bubleArray.length - (i + 1); j++)
			{
				if (bubleArray[j + 1] < bubleArray[j]) // ÀÚ¸®¹Ù²Þ
				{
					temp = bubleArray[i + 1];
					bubleArray[i + 1] = bubleArray[i];
					bubleArray[i] = temp;
					
					System.out.print(bubleArray[i] + " ");
				}
			}
		}
	}
}
