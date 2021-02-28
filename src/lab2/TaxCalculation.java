package lab2;

public class TaxCalculation {

	public static String empId = "A1793";

	public static int standardDeduction = 50000;

	public static double totalTax = 0;

	public static void main(String[] args) {

		int eightyC = 150000;
		int eightyD = 200000;
		int ctc = 1000000;

		System.out.println("Total Ctc of Emp:" + empId + " is " + ctc);
		int deductableAmt = getDeductions(eightyC, eightyD, standardDeduction);
		int taxableIncome = getTaxableIncome(ctc, deductableAmt);
		totalTax = getTotalTax(taxableIncome);
		displayTax();

	}

	public static int getDeductions(int eightyC, int eightyD, int standardDed) {
		int ded = 0;
		ded = eightyC + eightyD + standardDed;
		System.out.println("Deductions:" + ded);
		return ded;
	}

	public static int getTaxableIncome(int ctc, int deductionAmt) {
		return ctc - deductionAmt;
	}

	public static double getTotalTax(int taxIncome) {
		double d = (taxIncome > 500000 && taxIncome <= 1000000) ? 0.10 : (taxIncome <= 500000 ? 0.00 : 0.30);

		System.out.println("Taxable Income:" + taxIncome);
		System.out.println("Tax SLab:" + d);
		d = d * taxIncome;
		return d;
	}

	public static void displayTax() {
		System.out.println(totalTax);
	}

}
