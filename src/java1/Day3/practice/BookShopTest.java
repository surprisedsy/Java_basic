package java1.Day3.practice;

import java.util.Scanner;

public class BookShopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookShop bookShop = new BookShop();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�뿩�ϰ� ���� å�� ��ȣ�� �Է��ϼ���. : ");
		
		int bookNum = scan.nextInt();
		if(bookNum > 10)
		{
			System.out.println("1 ~ 10�� ���ڸ� �Է��� �ּ���.");
		}
		scan.close();
		
		
		bookShop.books[0] = new Book(1, "Ʈ���϶���", "�����Ĵ� ���̾�");
		bookShop.books[1] = new Book(2, "����", "�����Ĵ� ���̾�");
		bookShop.books[2] = new Book(3, "��Ŭ����", "�����Ĵ� ���̾�");
		bookShop.books[3] = new Book(4, "�극��ŷ��", "�����Ĵ� ���̾�");
		bookShop.books[4] = new Book(5, "�Ƹ���", "������");
		bookShop.books[5] = new Book(6, "�����׵�", "�赿��");
		bookShop.books[6] = new Book(7, "�����ϱ� û���̴�", "�賭��");
		bookShop.books[7] = new Book(8, "��õ", "õ��");
		bookShop.books[8] = new Book(9, "�¹���", "������");
		bookShop.books[9] = new Book(10, "Ǯ�Ͽ콺", "������");
		
		
		bookShop.rentBook(bookNum);
		bookShop.displayBookInfo(bookShop.books);
		// bookShop.displayBookInfo();

	}

}
