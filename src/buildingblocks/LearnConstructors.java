package buildingblocks;

public class LearnConstructors {

	String pname;
	int qty;
	int price;

	/**
	 * Default COnstructor - which does not have not any parameters
	 */
	public LearnConstructors() {
		System.out.println("Initialising the Class: LearnConstructors");
	}

	/**
	 * Parametrized Constructors
	 * @param pname
	 * @param qty
	 * @param price
	 */
	public LearnConstructors(String pname, int qty, int price) {
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	}

	public void display() {
		System.out.println("Product Name:" + pname);
		System.out.println("Product Qty:" + qty);
		System.out.println("Price:" + price);
	}

	public static void main(String[] args) {

		LearnConstructors obj = new LearnConstructors();

		LearnConstructors obj1 = new LearnConstructors("Jeans", 150, 750);
		obj1.display();
		

	}

}
