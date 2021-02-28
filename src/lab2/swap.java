package lab2;

public class swap {

	public static void main(String[] args) {
		swap1(10, 7);

	}

	public static void swap1(int a, int b) {

		System.out.println("Before Swap: a=" + a + " b=" + b);
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swap: a=" + a + " b=" + b);

	}

}
