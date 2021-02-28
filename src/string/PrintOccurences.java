package string;

public class PrintOccurences {

	public static void main(String[] args) {

		String str = "DevLabsAlliances";
		int[] occur = new int[26];
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				occur[str.charAt(i) - 'a']++;
			}
		}

		for (int i = 0; i < occur.length; i++) {
			if (occur[i] > 0) {
				System.out.println("No of Occurrences of char " + (char) ('a' + i) + " is " + occur[i]);
			}
		}
	}
}
