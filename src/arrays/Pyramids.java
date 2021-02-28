package arrays;

public class Pyramids {

	public static void main(String[] args) {

		int noOfElem = 1;
		int rw = 5;
		int col = rw * 2 - 1;
		int noOfSpaces = col / 2;

		for (int i = 1; i <= rw; i++) {
			System.out.println();
			for (int j = 1; j <= col; j++) {

				if (j <= noOfSpaces || j > (col - noOfSpaces))
					System.out.print(" ");
				else
					System.out.print("*");

			}

			noOfSpaces = noOfSpaces - 1;
			noOfElem = noOfElem + 2;

		}

		rw = 5;
		col = rw * 2 - 1;
		noOfSpaces = 0;
		noOfElem = col;

		for (int i = 1; i <= rw; i++) {
			System.out.println();
			for (int j = 1; j <= col; j++) {
				if (j <= noOfSpaces || j > (col - noOfSpaces))
					System.out.print(" ");
				else
					System.out.print("*");

			}

			noOfSpaces = noOfSpaces + 1;
			noOfElem = noOfElem - 2;

		}

	}

}
