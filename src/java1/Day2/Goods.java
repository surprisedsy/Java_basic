package java1.Day2;

public class Goods {
	
		private String name = " ";
		private int price = 0;
		private int countStock = 0;
		private int countSold = 0;		
		static int countOfGoods = 0;
		
		public Goods()
		{
			System.out.println("������ Goods()");
			Goods.countOfGoods++;
		}
	
		public Goods(String name, int price, int countStock, int countSold) {
						
			super();
			
			System.out.println("��--------��----------��");
			this.name = name;
			this.price = price;
			this.countStock = countStock;
			this.countSold = countSold;
		}
		
		public void showInfo()
		{
			System.out.println("��ǰ �̸� : " + name);
			System.out.println("���� : " + price);
			System.out.println("����� : " + countStock);
			System.out.println("�ȸ����� : " + countSold);
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
