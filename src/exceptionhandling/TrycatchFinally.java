package exceptionhandling;

public class TrycatchFinally {

	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);
			System.out.println("Inside Try .......");
			int arr[] = { 1, 2, 3, 4, 5 };
			System.out.println(arr[6]);

		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e1) {
			e1.printStackTrace();
		} finally {
			System.out.println("Finally Block Executed irresepective of exception occur or not");

			try {
				// conn.close;
			} catch (Exception e) {

			}

		}

		try {
			int arr[] = { 1, 2, 3, 4, 5 };
			System.out.println(arr[6]);

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Next Step");

	}

}
