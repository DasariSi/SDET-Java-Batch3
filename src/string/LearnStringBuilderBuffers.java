package string;

public class LearnStringBuilderBuffers {

	public static void main(String[] args) {

		String str = "Testing is fun";
		System.out.println(str.concat(" for everone"));
		System.out.println(str);

		//String is immutable - in sense that once created cant be modify without new obj
		
		str=str.concat(" for everyone");
		System.out.println(str);
		
		
		StringBuilder str1 = new StringBuilder("Testing String");
		str1.append(" Builder");
		System.out.println(str1);
		System.out.println(str1.reverse());
		
		
		StringBuffer str2 = new StringBuffer("Testing String");
		str2.append(" Buffer");
		System.out.println(str2);
		
	}

}
