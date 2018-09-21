package java1.Day4;

public class Rect {
	
	int width = 0;
	int height = 0;
	
	public Rect(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		Rect rect = (Rect) obj;		// 현재의 넓이와 obj의 넓이가 같으면 true 반환
		
		if((this.width * this.height) == (rect.width * rect.height))
			return true;
		else
			return false;
	}
}
