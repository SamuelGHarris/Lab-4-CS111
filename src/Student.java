/**
* CS 111 Section No. 002
* Lab Assignment 4
* @author Samuel Harris
**/

public class Student extends Person {
	private double gpa;
	private int studentID;
	private Teacher advisor;

	/**
	 * Default Constructor
	 */
	public Student() {
		super();
		gpa = 0.0;
		studentID = 0;
		advisor = new Teacher();
	}

	/**
	 * Parameterized Constructor
	 * @param firstname - A students first name
	 * @param lastname - A students last name
	 * @param dob - A students date of birth 
	 * @param gpa - A students grade point average
	 * @param studentID - Student identification number
	 * @param adv - Advisor
	 */
	public Student(String firstname, String lastname, Date dob, double gpa, int studentID, Teacher adv) {
		super(firstname, lastname, dob);
		this.gpa = gpa;
		this.studentID = studentID;
		advisor = adv;
	}

	//Accessors for data members.
	
	public int getStudentID() {
		return studentID;
	}

	public double getGPA() {
		return gpa;
	}

	public Teacher getAdvisor() {
		return advisor;
	}

	public boolean equals(Object o) {
		return ((o instanceof Student) && (super.equals((Person) o)) && (this.gpa == ((Student) o).gpa)
				&& (this.studentID == ((Student) o).studentID) && (this.advisor.equals(((Student) o).advisor)));
	}

	public String toString() {
		return (super.toString() + advisor.toString() + " GPA: " + gpa + " StudentID: " + studentID);
	}
}
