package wrapperclass;

public class FetchNumericValue {

	public static void main(String[] args) {

		String str = "sjshshvhsh1234.567scjsvhsvjvh";
		int pos1 = 0;
		int pos2 = 0;
		char[] c = str.toCharArray();

		for (int i = 0; i < c.length; i++) {

			if (Character.isDigit(c[i])) {
				pos1 = i;
				break;
			}
		}

		for (int i = pos1; i < (c.length - pos1); i++) {

			if (Character.isDigit(c[i]) || c[i] == '.') {

			} else {
				pos2 = i;
				break;
			}
		}

		str = str.substring(pos1, pos2);
		System.out.println(str);

		double d = Double.parseDouble(str);
		System.out.println(d);

		
		
		
		
		
		
		
		
	}

}
