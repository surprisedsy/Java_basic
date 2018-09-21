package animal;

public class Prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duck d = new Duck();
		Sparrow sp = new Sparrow();
		
		printAnimal(d);
		printAnimal(sp);
		
	}
	
	public static void printAnimal(Bird bd)
	{
		bd.fly();
		bd.sing();
		bd.toString();
	}
}
