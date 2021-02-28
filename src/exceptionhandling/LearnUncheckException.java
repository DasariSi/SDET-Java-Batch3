package exceptionhandling;

public class LearnUncheckException {

	public static void main(String[] args) {

		String str=null;
		
		if(str.equals("Test"))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		
		
		
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println(arr[6]);

		int n1 = 10;
		int n2 = 0;

		System.out.println(n1 / n2);

	}

}
