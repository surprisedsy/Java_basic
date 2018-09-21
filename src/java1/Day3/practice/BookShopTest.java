package java1.Day3.practice;

import java.util.Scanner;

public class BookShopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookShop bookShop = new BookShop();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("대여하고 싶은 책의 번호를 입력하세요. : ");
		
		int bookNum = scan.nextInt();
		if(bookNum > 10)
		{
			System.out.println("1 ~ 10의 숫자를 입력해 주세요.");
		}
		scan.close();
		
		
		bookShop.books[0] = new Book(1, "트와일라잇", "스테파니 메이어");
		bookShop.books[1] = new Book(2, "뉴문", "스테파니 메이어");
		bookShop.books[2] = new Book(3, "이클립스", "스테파니 메이어");
		bookShop.books[3] = new Book(4, "브레이킹던", "스테파니 메이어");
		bookShop.books[4] = new Book(5, "아리랑", "조정래");
		bookShop.books[5] = new Book(6, "젊은그들", "김동인");
		bookShop.books[6] = new Book(7, "아프니깐 청춘이다", "김난도");
		bookShop.books[7] = new Book(8, "귀천", "천상병");
		bookShop.books[8] = new Book(9, "태백산맥", "조정래");
		bookShop.books[9] = new Book(10, "풀하우스", "원수연");
		
		
		bookShop.rentBook(bookNum);
		bookShop.displayBookInfo(bookShop.books);
		// bookShop.displayBookInfo();

	}

}
