package wrapperclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LearnDates {

	public static void main(String[] args) {

		Date d = new Date();
		SimpleDateFormat format=new SimpleDateFormat("MM/dd/yyyy");
		String strDate=format.format(d);
		System.out.println(strDate);
		
		format=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		strDate=format.format(d);
		System.out.println(strDate);
		
		SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
		
		Date d1;
		try {
			d1 = df.parse("31/12/2021");
			System.out.println(d1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		Date d3 = new Date();
		System.out.println(d3.getTime());
		
		
		
		
		
	}

}
