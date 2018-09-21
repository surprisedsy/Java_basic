package java1.Day4.practice;

import java1.Day3.practice.ISoundable;

public class SoundTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printSound(new Cat());
		printSound(new Dog());
		printSound(new Sparrow());
		printSound(new Duck());		
	}
	
	public static void printSound(ISoundable isd)
	{
		System.out.println(isd.sound());
	}
}
