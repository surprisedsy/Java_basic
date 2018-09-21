package shape;

public class Point {
	
	int x = 0;
	int y = 0;
	String color = "";
	

	public Point(int x) {
		super();
		this.x = x;
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public void Show()
	{
		System.out.println("점 [x = " + x + ", y = " + y + "] 를 그렸습니다.");
	}
	
	
	public void Show(boolean visible)
	{
		if(visible)
		{
			System.out.println("점 [x = " + x + ", y = " + y + "] 를 그렸습니다.");
		}
		else
		{
			System.out.println("점 [x = " + x + ", y = " + y + "] 를 지웠습니다.");
		}
	}

}
