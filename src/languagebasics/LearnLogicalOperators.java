package languagebasics;

public class LearnLogicalOperators {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		int c = 15;

		/**
		 * AND- All conditions must satisfy to make it true
		 */

		System.out.println((a > b) && (a != 0));
		System.out.println((a < b) && (c > a) && (c > b));

		/**
		 * OR -Atlease one condition satisfy to make it true
		 */
		System.out.println((a > b) || (a == 0));

		/**
		 * NOT - true if expression is false
		 */

		System.out.println(!((a > b) && (a != 0)));

	}

}
