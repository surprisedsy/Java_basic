package java1.Day3.practice;

public class BookShop{
	
	Book[] books = new Book[10];
	Book book = new Book();
	
	public void displayBookInfo(Book[] books)
	{
		for(int i = 0; i < books.length; i++)
		{
			Book book = books[i];
			book.print();
		}
	}
	
	public void rentBook(int booknum)
	{
		/*for(int i = 0; i < books.length; i++)
		{
			if(booknum == i)
			{				
				book.setTitle(book.title);
				System.out.println(book.getTitle() + "이(가) 대여 됐습니다.");
			}	
		}*/
		
		for(Book book : books)
		{
			if (book.getBookNo() == booknum) {
				
				books[booknum].stateCode = 0;
				book.rent();
				break;
			}
		}
		
	}
	
	/*public void displayBookInfo()				//자기 필드의 변수이기 때문에 인자 없이 걍 써도 됨
	{
		for(int i = 0; i < books.length; i++)
		{
			Book book = books[i];
			book.print();
		}
	}*/
	
}
