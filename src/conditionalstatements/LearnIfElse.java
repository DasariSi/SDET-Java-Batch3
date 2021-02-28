package conditionalstatements;

public class LearnIfElse {

	public static void main(String[] args) {

		int x = 15;
		int y = 10;

		String operation = "-";

		int result = 0;
		if (operation == "+") {
			result = x + y;
		}
		if (operation == "-") {
			result = x - y;
		}
		if (operation == "*") {
			result = x * y;
		}

		System.out.println("Result:" + result);

		operation = "aaa";

		if (operation == "+") {
			result = x + y;
		} else if (operation == "-") {
			result = x - y;
		} else if (operation == "*") {
			result = x * y;
		} else {
			System.out.println("Invalid Operation");
		}

	}

}
