import java.util.Date;

public class Student {
	private int studentId;
	private String studentName;
	private Date birthday;
	private float gpa;

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	public Student(int studentId, String studentName, Date birthday, float gpa) {
		setStudentId(studentId);
		setStudentName(studentName);
		setBirthday(birthday);
		setGpa(gpa);
	}
}
