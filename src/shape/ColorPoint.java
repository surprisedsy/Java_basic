package shape;

public class ColorPoint extends Point {

	public ColorPoint(int x) {
		super(x);
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void Show()
	{
		System.out.println("점 [x = " + x + ", y = " + y + ", color = " + color + "] 를 그렸습니다.");
	}


}
