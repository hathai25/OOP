package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;


public class DateTest {
	public static void main(String[] args) throws ParseException {
		MyDate aDate = new MyDate();
		System.out.println("Type in your date: ");
		aDate.accept();
		
		SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
	    Date d1 = sdformat.parse("2019-04-15");
	    Date d2 = sdformat.parse("2019-08-10");
	    DateUtils.CompareTwoDates(d1, d2);
	}
}
