package java1.Day2;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Goods goods = new Goods("Nikon", 400000, 30, 50);
				
		/*goods.setName("Nikon");
		goods.setPrice(400000);
		goods.setCountStock(30);
		goods.setCountSold(50);*/
			
		goods.showInfo();
		
		/*System.out.println("goodsOfCount : " + Goods.countOfGoods);
		
		Goods goods2 = new Goods();		
		//goods2.countOfGoods = 100; // ȭ�� �Ʒ����� countOfGoods�� 100���� ����
		System.out.println("goodsOfCount : " + Goods.countOfGoods);
		
		Goods goods3 = new Goods();
		System.out.println("goodsOfCount : " + Goods.countOfGoods);  // static ������� �ν��Ͻ��� �����Ǹ鼭 �����ڰ� ��Ű�´�� ���� �þ��
*/	}

}
