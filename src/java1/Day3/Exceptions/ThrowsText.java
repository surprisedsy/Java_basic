package java1.Day3.Exceptions;

import java.io.IOException;

public class ThrowsText {
	
	
	public void suspiciousMethod() throws MyException
	{
		System.out.println("예외 발생 전");
		
		//throw new IOException();
		throw new MyException("error!!!!!!!!!!!");
		
		//System.out.println("예외 발생 후");
	}
}
