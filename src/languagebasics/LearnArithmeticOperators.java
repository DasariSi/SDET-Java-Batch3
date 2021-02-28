package languagebasics;

public class LearnArithmeticOperators {

	public static void main(String[] args) {
		
		/**
		 * Addition, Subt, Multiplication, Divison-remainder & quotient
		 */
		
		int a= 5,b=10;
	
		System.out.println("First Number:"+a);
		System.out.println("Second Number:"+b);
		
		
		int sum=a+b;
		System.out.println("Sum of a+b="+sum);
		
		int sub=a-b;
		System.out.println("Subtraction of a-b ="+sub);
		
		int mul=a*b;
		System.out.println("Multiplication of a*b="+mul);
		
		int quo=b/a;
		System.out.println("Quoteint b/a:"+quo);
		
		int rem=b%a;
		System.out.println("Remainder b%a:"+rem);
		

		System.out.println("Assignment opeartor :"+ (a +=b));  //a=a+b  --> a+=b
		System.out.println("Assignment opeartor :"+ (a -=b));
		System.out.println("Assignment opeartor :"+ (a *=b));
		System.out.println("Assignment opeartor :"+ (a /=b));
		System.out.println("Assignment opeartor :"+ (a %=b));
		
		
		
	}

}
