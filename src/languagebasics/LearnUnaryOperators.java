package languagebasics;

public class LearnUnaryOperators {

	public static void main(String[] args) {

		
		/**
		 * Unary Minus
		 */
		int n=10;
		n=-n;
		System.out.println(n);
		
		
		/**
		 * Pre Increment or Decrement ++x  --x : First increment and then use it
		 */
		int n1=5;
		System.out.println(++n1);
		//System.out.println(--n1);
		
		
		/**
		 * Post Increment x++ : First use and then increment it
		 */
		int n2=5;
		System.out.println(n2++);
		System.out.println(n2);
		
		
		
		
	}

}
