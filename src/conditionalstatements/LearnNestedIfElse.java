package conditionalstatements;

import java.util.Scanner;

public class LearnNestedIfElse {

	public static void main(String[] args) {

		//int n = 15;

		System.out.println("ENter the number:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		
		if (n == 0) {
			System.out.println("Num is zero");
		} 
		else {

			if (n > 0)
				System.out.println("Positive");
			else
				System.out.println("Negative");
		}

		String str="Virat";
		if(str=="Virat")
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		
		
	}

}
