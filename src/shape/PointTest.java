package shape;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point(2, 5);
		Point p2 = new ColorPoint(3, 4, "red");
		Point p3 = new ColorPoint(4);
		
		
		p3.setY(200);
		p3.setColor("yellow");
				
		
		p1.Show();
		p2.Show();
		p3.Show();
	}

}
