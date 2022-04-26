package dates;

import java.util.Date;

public class DateUtils {
	public static void CompareTwoDates(Date d1, Date d2) {
		if(d1.compareTo(d2) > 0) {
	         System.out.println("Date 1 occurs after Date 2");
	      } else if(d1.compareTo(d2) < 0) {
	         System.out.println("Date 1 occurs before Date 2");
	      } else if(d1.compareTo(d2) == 0) {
	         System.out.println("Both dates are equal");
	      }
	}
	public static void sortDates(Date[] arrayDates) {
		for (int i = 0; i<arrayDates.length; i++) {
			for (int j = i+1; j< arrayDates.length; j++) {
				if (arrayDates[i].compareTo(arrayDates[j]) > 0) {
					Date temp;
					temp = arrayDates[i];
					arrayDates[i] = arrayDates[j];
					arrayDates[j] = temp;
				}
			}
		}
	}
}
