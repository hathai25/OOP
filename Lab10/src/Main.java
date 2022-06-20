import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IllegalGPAException, IllegalBirthDayException {
		Scanner keyboard = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter studen ID: ");
		int studentId = keyboard.nextInt();
		System.out.println("Enter studen name: ");
		String studentName = keyboard.nextLine();
		System.out.println("Enter the Date ");
		String date = keyboard.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date birthday=null;
		try {
		    //Parsing the String
		    birthday = dateFormat.parse(date);
		} catch (ParseException e) {
		    // TODO Auto-generated catch block
			System.err.println("Invalid date format");
		    throw(new IllegalBirthDayException());
		}
		System.out.println("Enter studen gpa: ");
		float gpa = keyboard.nextFloat();
		if (gpa < 0.0 || gpa > 10.0) {
			System.err.println("Invalid gpa");
			throw (new IllegalGPAException());
		}
		Student student = new Student(studentId, studentName, birthday, gpa);
	}

}
