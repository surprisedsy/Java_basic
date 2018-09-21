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
		
		Rect rect = (Rect) obj;		// ������ ���̿� obj�� ���̰� ������ true ��ȯ
		
		if((this.width * this.height) == (rect.width * rect.height))
			return true;
		else
			return false;
	}
}
