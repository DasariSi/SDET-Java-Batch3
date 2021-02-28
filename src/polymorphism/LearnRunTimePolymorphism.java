package polymorphism;

public class LearnRunTimePolymorphism {

	public static void main(String[] args) {

		
		ParentClass obj = new ParentClass();
		obj.disp();
		
		obj = new ChildClass();
		obj.disp();
		
		
		ChildClass obj1 = new ChildClass();
		obj1.disp();
		
	}
	
	
	
	

}
