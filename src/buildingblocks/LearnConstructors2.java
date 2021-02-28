package buildingblocks;

public class LearnConstructors2 {

	public static void main(String[] args) {

		int qty=19;
		int price=100;
		String product="Shoes";
		
		LearnConstructors obj = new LearnConstructors(product, qty, price);
		obj.display();
		
	}

}
