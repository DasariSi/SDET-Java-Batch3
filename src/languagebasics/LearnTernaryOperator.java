package languagebasics;

public class LearnTernaryOperator {

	public static void main(String[] args) {

		/**
		 * it is shorthand of if-else
		 */

		int n = 33;

		String result = (n > 33) ? "Pass" : "Fail";
		System.out.println("Result is " + result);

		char c = 'A';

		/**
		 * conditional chk ? pass : fail
		 */
		char d = (c == 'A') ? 'P' : 'F';

		System.out.println(d);

	}

}
