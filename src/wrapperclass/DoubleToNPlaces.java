package wrapperclass;

import java.math.BigDecimal;

public class DoubleToNPlaces {

	public static void main(String[] args) {

		System.out.println(BigDecimal.valueOf(123.456789).setScale(2, BigDecimal.ROUND_HALF_UP));
		System.out.println(BigDecimal.valueOf(143.45678546548859).setScale(4, BigDecimal.ROUND_HALF_UP));
		System.out.println(BigDecimal.valueOf(123.454657854855585454).setScale(10, BigDecimal.ROUND_HALF_UP));
		System.out.println(BigDecimal.valueOf(123.454657854855585454).setScale(8, BigDecimal.ROUND_HALF_UP));
		
	}

}
