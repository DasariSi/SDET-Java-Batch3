package conditionalstatements;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		sc.close();
		
		boolean bflg = false;
		
		switch (c) {
		case 'a':
		case 'A':
		case 'e':
		case 'i':
		case 'o':
			bflg = true;
		}

		if (bflg == true)
			System.out.println("Vowel");
		else {
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
				System.out.println("Consonant");
			else
				System.out.println("Invalid char");

		}

	}

}
