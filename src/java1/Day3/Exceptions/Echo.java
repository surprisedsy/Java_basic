package java1.Day3.Exceptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Echo {
	
	public static void main(String[] args)
	{
		InputStreamReader input = new InputStreamReader(System.in);
		
		BufferedReader reader = new BufferedReader(input);
		String keyboardinput = "";
		
		try {
			keyboardinput = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print(keyboardinput);
		System.out.println(" has entered.");
	}
}
