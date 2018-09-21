package java1.Day4.practice.math;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RectTriangle recttri = new RectTriangle(6, 2);
		Rectangle rect = new Rectangle(5, 6);
		
		Shape[] ArrayList = new Shape[2];
		ArrayList[0] = recttri;
		ArrayList[1] = rect;
		
		for(int i = 0; i < ArrayList.length; i++)
		{
			System.out.println("Area[" + i + "] : " + ArrayList[i].getArea());
			System.out.println("Perimeter[" + i + "] : " +ArrayList[i].getPerimeter());
		}
		
		if(ArrayList[1] != null)
		{
			rect.ss = 0.5;
			System.out.println("New Area[" + 1 + "] : " + ArrayList[1].getArea());
			System.out.println("New Perimeter[" + 1 + "] : " +ArrayList[1].getPerimeter());
		}
		
	}

}
