package java1.Day2;

public class Goods {
	
		private String name = " ";
		private int price = 0;
		private int countStock = 0;
		private int countSold = 0;		
		static int countOfGoods = 0;
		
		public Goods()
		{
			System.out.println("생성자 Goods()");
			Goods.countOfGoods++;
		}
	
		public Goods(String name, int price, int countStock, int countSold) {
						
			super();
			
			System.out.println("생--------성----------자");
			this.name = name;
			this.price = price;
			this.countStock = countStock;
			this.countSold = countSold;
		}
		
		public void showInfo()
		{
			System.out.println("상품 이름 : " + name);
			System.out.println("가격 : " + price);
			System.out.println("재고개수 : " + countStock);
			System.out.println("팔린개수 : " + countSold);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getCountStock() {
			return countStock;
		}

		public void setCountStock(int countStock) {
			this.countStock = countStock;
		}

		public int getCountSold() {
			return countSold;
		}

		public void setCountSold(int countSold) {
			this.countSold = countSold;
		}
		
}
