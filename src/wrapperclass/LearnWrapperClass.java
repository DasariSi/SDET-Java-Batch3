package wrapperclass;

public class LearnWrapperClass {

	public static void main(String[] args) {

		/**
		 * Type Conversion
		 */
		int x = 10;
		double y = 250000;

		y = x;
		System.out.println(y);

		/**
		 * TYpe Casting- higher to lower
		 */
		x = (int) y;
		System.out.println(x);

		int x1 = 9;
		char c = (char) x1;
		System.out.println(c);

	}

}
