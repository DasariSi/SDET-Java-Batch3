package languagebasics;

public class LearnDataTypes {

	public static void main(String[] args) {
		
		/**
		 * Boolean type
		 */
		boolean bflag = false;
		System.out.println("Boolean Type Variable default Value:"+bflag);
		bflag=true;
		System.out.println("Boolean Value:"+bflag);
		
		/**
		 * Integer Type
		 */
		byte b1= -127;  //-128 to 127  -1 byte
		System.out.println("Byte Value:"+b1);
		byte b2 = 0;
		System.out.println("Default Value:"+b2);
		
		short s1=32767;
		System.out.println("Short Value:"+s1);
		
		int s2 =1515556;
		System.out.println("Integer Value:"+s2);
		
		long s3 =155755545;
		System.out.println("Long Value:"+s3);
		
		
		
		
		/**
		 * FLoat
		 */
		float f1 =(float) 152.575759585558544555;
		double f2 = 1523.455656554585488448844888848888848848844848848448;
		
		System.out.println("Float is "+f1);
		System.out.println("Double is "+f2);
		
		/**
		 * CHar
		 */

		char c1 = 'A';
		System.out.println("char c1:"+c1);
		char c2 = 0;
		System.out.println("char default value is "+c2);
		
		
		/**
		 * String
		 */
		String str ="ABD is legend";
		System.out.println("String value is "+str);
		
		
	}

}
