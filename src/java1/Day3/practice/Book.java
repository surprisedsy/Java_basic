package java1.Day3.practice;

public class Book {
		
	int bookNo;
	String title;
	String author;
	int stateCode;
	

	public void Book() {}
	
	public Book(int bookNo, String title, String author) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public void Book(int stateCode) {
		
		this.stateCode = stateCode;
		//stateCode = 1;
	}
	
	
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void rent()
	{
		if(stateCode == 0)
			System.out.println(this.title + "��(��) �뿩 ����ϴ�.");
	}
	
	public void print()
	{
		/*if(stateCode == 0)
			System.out.println("�뿩��");
		else
			System.out.println("��� ����");				if�� �ص� ��. ���߿� �غ���
*/		
		System.out.println("å ���� : " + title + " �۰� : " + author + " �뿩 ���� : " + (stateCode == 1 ? "��� ����" : "�뿩��" ));
	}
}
