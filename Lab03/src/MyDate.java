import java.util.Calendar;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MyDate {
	private int day;
	private int month;
	private int year;
	//getters, setters
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	//Constructors
	public MyDate() {
		super();
		Calendar defaultDate = Calendar.getInstance();
		this.day = defaultDate.get(Calendar.DATE) + 1;
		this.month = defaultDate.get(Calendar.MONTH) + 1;
		this.year = defaultDate.get(Calendar.YEAR);
	}
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public MyDate(String date) {
		super();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d yyyy", Locale.US);
		try {
			LocalDate rawDate = LocalDate.parse(date, formatter);
			this.day = rawDate.getDayOfMonth();
			this.month = rawDate.getMonthValue();
			this.year = rawDate.getYear();
		} catch (Exception x) {System.out.println("Invalid date!");}
	}
	//methods
	public void accept() {
		Scanner keyboard = new Scanner(System.in);
		String date = keyboard.nextLine();
		keyboard.close();
		MyDate inputDate = new MyDate(date);
		System.out.println("Your input date is: " + inputDate.getDay() + "-" + inputDate.getMonth() + "-" + inputDate.getYear());
	}
	
	public void print() {
		MyDate currentDate = new MyDate();
		System.out.println("Current date is: " + currentDate.getDay() + "-" + currentDate.getMonth() + "-" + currentDate.getYear());
	}
}
