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
			System.out.println(this.title + "이(가) 대여 됬습니다.");
	}
	
	public void print()
	{
		/*if(stateCode == 0)
			System.out.println("대여중");
		else
			System.out.println("재고 있음");				if로 해도 됨. 나중에 해보기
*/		
		System.out.println("책 제목 : " + title + " 작가 : " + author + " 대여 유무 : " + (stateCode == 1 ? "재고 있음" : "대여중" ));
	}
}
