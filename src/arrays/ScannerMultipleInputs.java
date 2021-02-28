package arrays;

import java.util.Scanner;

public class ScannerMultipleInputs {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("User should specify no of Inputs user want to enter:");
		int n = sc.nextInt();
		String[] str = new String[n];

		sc.nextLine();

		for (int i = 0; i < str.length; i++)
			str[i] = sc.nextLine();

		sc.close();

		System.out.println("Values ENtered:");
		for (String st : str) {
			System.out.println(st);
		}

	}

}
