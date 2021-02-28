package wrapperclass;

public class StringConversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * From STring to other data types
		 */

		String str = "235";

		int x = Integer.parseInt(str);
		System.out.println(x);

		System.out.println(Double.parseDouble(str));

		System.out.println(Boolean.parseBoolean(str));

		System.out.println(Float.parseFloat(str));

		for (int i = 0; i < str.length(); i++)
			System.out.println(str.charAt(i));

		/**
		 * To STring from other data types
		 */
		int n = 10;
		System.out.println(String.valueOf(n));

		double n1 = 1001.2;
		System.out.println(String.valueOf(n1));

		float f = 10;
		System.out.println(String.valueOf(f));

		char c = 'Y';
		System.out.println(String.valueOf(c));

		boolean b = true;
		System.out.println(String.valueOf(b));

	}

}
