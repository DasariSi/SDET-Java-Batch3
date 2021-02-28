package lab7;

public class UpperLowerCase {

	public static void main(String[] args) {

		String str = "ABDdefGHIjklMNOpqr@%123";

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			System.out.println(c + " :" + Character.isDigit(c));
			System.out.println(c + " :" + Character.isAlphabetic(c));
			System.out.println(c + " :" + Character.isUpperCase(c));

		}

		
		
		
	}

}
