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
				System.out.println(book.getTitle() + "��(��) �뿩 �ƽ��ϴ�.");
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
	
	/*public void displayBookInfo()				//�ڱ� �ʵ��� �����̱� ������ ���� ���� �� �ᵵ ��
	{
		for(int i = 0; i < books.length; i++)
		{
			Book book = books[i];
			book.print();
		}
	}*/
	
}
