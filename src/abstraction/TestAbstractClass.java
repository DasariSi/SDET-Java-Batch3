package abstraction;

public class TestAbstractClass {

	public static void main(String[] args) {
	
	Rectangle obj = new Rectangle();
	System.out.println(obj.getArea(6, 4));
	obj.display("Rectangle");
	
	Square obj1 = new Square();
	System.out.println(obj1.getArea(5, 7));
	obj1.display("Square");
		
	}

}
