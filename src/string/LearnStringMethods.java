package string;

public class LearnStringMethods {

	public static void main(String[] args) {

		String str = "ABD is legend";

		// 1.Length
		System.out.println("Length of String");
		System.out.println(str.length());

		// 2.charAt
		System.out.println("CharAt:");
		System.out.println(str.charAt(2));

		// 3.Substring
		System.out.println("Substring:");
		System.out.println(str.substring(2));
		System.out.println(str.substring(2, 8));

		// 4.COncatentaion
		System.out.println("Concatenation");
		System.out.println(str.concat(" in Cricket"));

		// 5.IndexOf
		System.out.println("IndexOf and LastIndexOf");
		System.out.println(str.indexOf("legend"));
		System.out.println(str.lastIndexOf("is"));

		String s = "C://Documents//SDET//Java//LearningMaterial.xls";
		System.out.println(s.indexOf("//"));
		System.out.println(s.lastIndexOf("//"));
		System.out.println(s.substring(s.lastIndexOf("//") + 2));
		System.out.println(s.substring(s.indexOf(".")));

		// 6.Equals
		System.out.println("Equals and EqualsIgnoreCase:");
		System.out.println(str.equals("ABD is legend"));
		System.out.println(str.equalsIgnoreCase("ABD Is leGEND"));

		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

		// 8.trim is to remove extra spaces from front and rear
		System.out.println("Trim:");
		String str1 = " ABD is legend ";
		System.out.println(str1);
		System.out.println(str1.trim());

		// 9. Starts and Ends with
		System.out.println("Starts WIth and Ends With:");
		System.out.println(str.startsWith("ABD"));
		System.out.println(str.endsWith("legend"));

		System.out.println("Contains:");
		System.out.println(str.contains("legend"));

		System.out.println("Empty- null or Blank eveluates to true");
		String str2 = "";
		System.out.println(str2.isEmpty());

		// Split
		System.out.println("Split:");
		String str3 = "PL1,PL2,PL3,PL4,PL5";

		String[] arr = str3.split(",");
		for (String string : arr) {
			System.out.println(string);
		}

		str3 = "test123@gmail.com";
		arr = str3.split("@");
		for (String string : arr) {
			System.out.println(string);
		}

		// String to char
		char[] c = str.toCharArray();
		for (char d : c) {
			System.out.println(d);
		}

	}

}
