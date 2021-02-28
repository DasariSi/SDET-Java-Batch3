package lab1;

public class UnaryOperatorDemo {

	public static void main(String[] args) {

		int n1 = 4, n2 = 5;

		/**
		 * n1 is first used and then incremented and n2 is incremented before use
		 */
		int n3 = n1++ + ++n2;   //4+6
		System.out.println(n3);//10

		/**
		 * n1=5 from above step n2=6
		 */
		n3 = n1++ + ++n2; //5+7
		System.out.println(n3);//12

		
		/**
		 * n1=6 as result of post incre from above step
		 * n1=7 as result of pre incre in this step
		 */
		int n4 = (++n1 + n2++) + n1;  //7+7+7
		System.out.println(n4);//21

		int n5 = (++n1 + n2++) + n2; //8+8+9
		System.out.println(n5); //25

		int n6 = n2 + (++n1 + n2++);//9+9+9
		System.out.println(n6);//27

	}

}
