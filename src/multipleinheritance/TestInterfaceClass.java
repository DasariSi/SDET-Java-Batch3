package multipleinheritance;

public class TestInterfaceClass implements Int1,Int2 {

	public static void main(String[] args) {
		
		TestInterfaceClass obj = new TestInterfaceClass();
		obj.disp();
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		Int1.super.disp();
		
		
		Int2.super.disp();
	}





}
