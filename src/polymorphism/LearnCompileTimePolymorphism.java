package polymorphism;

public class LearnCompileTimePolymorphism {

	int add(int a, int b)
	{
		return a+b;
	}
	
	int add(int a, int b, int c )
	{
		return a+b+c;
	}
	
	double add(double a,double b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {

		LearnCompileTimePolymorphism obj = new LearnCompileTimePolymorphism();
		System.out.println(obj.add(5, 10));
		System.out.println(obj.add(5.10, 7.10));
		System.out.println(obj.add(5, 9, 11));
		
	}

}
