package hust.soict.it2.date;

import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MyDate {
    private int year, day, intMonth;
    private String month;
	//getters, setters
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
    public int getIntMonth() {
        return intMonth;
    }
	public void setIntMonth(String month) {
        switch (month) {
                case "January", "Jan", "jan":
                    intMonth = 1;
                    break;
                case "February", "Feb", "feb":
                    intMonth = 2;
                    break;
                case "March", "Mar", "mar":
                    intMonth = 3;
                    break;
                case "April", "Apr", "apr":
                    intMonth = 4;
                    break;
                case "May", "may":
                    intMonth = 5;
                    break;
                case "June", "Jun", "jun":
                    intMonth = 6;
                    break;
                case "July", "Jul", "jul":
                    intMonth = 7;
                    break;
                case "August", "Aug", "aug":
                    intMonth = 8;
                    break;
                case "September", "Sep", "sep":
                    intMonth = 9;
                    break;
                case "October", "Oct", "oct":
                    intMonth = 10;
                    break;
                case "November", "Nov", "nov":
                    intMonth = 11;
                    break;
                case "December", "Dec", "dec":
                    intMonth = 12;
                    break;
                default:
                    break;
            }
    }
	//Constructors
	public MyDate() {
		super();
        this.month = new SimpleDateFormat("MMMM").format(new Date());
        this.day = Integer.parseInt(new SimpleDateFormat("d").format(new Date()));
        this.year = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()));
	}
	public MyDate(int day, String month, int year) {
		super();
	    this.setMonth(month);
	    this.setYear(year);
	    this.setDay(day);
	    setIntMonth(month);
	}
	public MyDate(String date) {
		super();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.US);
		try {
			LocalDate rawDate = LocalDate.parse(date, formatter);
			this.day = rawDate.getDayOfMonth();
			this.intMonth = rawDate.getMonthValue();
			this.year = rawDate.getYear();
		} catch (Exception x) {System.out.println("Invalid date!");}
	}
	//methods
	public void accept() {
		Scanner keyboard = new Scanner(System.in);
		String date = keyboard.nextLine();
		keyboard.close();
		MyDate inputDate = new MyDate(date);
		System.out.println("Your input date is: " + inputDate.getDay() + "/" + inputDate.getIntMonth() + "/" + inputDate.getYear());
	}
	
	public void print() {
		MyDate current = new MyDate();
        StringBuilder str;
        if (current.getDay() % 10 == 1) {
            str = new StringBuilder().append(current.getDay()).append("st");
        } else if (current.getDay() % 10 == 2) {
            str = new StringBuilder().append(current.getDay()).append("nd");
        } else {
            str = new StringBuilder().append(current.getDay()).append("th");
        }
        System.out.println("Today is: " + current.getMonth() + " " + str + " " + current.getYear());
	}
}