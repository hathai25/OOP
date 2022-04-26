package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;


public class DateTest {
	public static void main(String[] args) throws ParseException {
		MyDate aDate = new MyDate();
		aDate.print();
		System.out.println("Type in your date: ");
		aDate.accept();
		
		SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
	    Date d1 = sdformat.parse("2019-04-15");
	    Date d2 = sdformat.parse("2019-08-10");
	    Date d3 = sdformat.parse("2020-08-10");
	    Date d4 = sdformat.parse("2021-08-15");
	    Date d5 = sdformat.parse("2019-05-10");
	    DateUtils.CompareTwoDates(d1, d2);
	    
	    Date[] arrayDates = {d1, d2, d3, d4, d5};
	    DateUtils.sortDates(arrayDates);
	    for (int i = 0; i<arrayDates.length; i++) {
	    	System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(arrayDates[i]) + "\n");
	    }
	}
}
