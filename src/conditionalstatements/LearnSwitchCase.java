package conditionalstatements;

public class LearnSwitchCase {

	public static void main(String[] args) {

		int n = 2;

		switch (n) {
		case 1:
			System.out.println("Value is 1");
			break;
		case 2:
			System.out.println("Value is 2");
			break;
		case 3:
			System.out.println("Value is 3");
			break;
		default:
			System.out.println("Invalid case");
			break;

		}

		String op = "+";
		int a = 5, b = 2;

		switch (op) {
		case "+":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		default:
			System.out.println("Invalid");
			break;
		}

		/*
		 * COde to Description 
		 */
		
		System.out.println(getIFSCCOde("SBI"));
		
	}
	
	
	public static String getIFSCCOde(String strBranchName)
	{
		String strCode = null;
		switch (strBranchName) {
		case "SBI": strCode="SBI001";
			break;
		case "HDFC": strCode="HDFC002";	
		default:
			break;
		}
		return strCode;
	}
	
	
	

}
