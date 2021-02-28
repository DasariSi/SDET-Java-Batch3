package string;

public class StringComparisons {

	public static void main(String[] args) {

		
		String str1="Test";
		String str2="Test";
		
		String str3=new String("Test");
		String str4=new String("Test");
		
		System.out.println(str1==str2);//true
		System.out.println(str3==str4);//false  
		System.out.println(str1==str3);//false
		
		
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str1.equals(str2));
		
		
		
	}

}
