/**
* CS 111 Section No. 002
* Lab Assignment 4
* @author Samuel Harris
**/

public class Teacher extends Person {
	private String department;

	public Teacher() {
		super();
		department = "CCCC";
	}

	public Teacher(String firstname, String lastname, Date dob, String department) {
		super(firstname, lastname, dob);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public String toString() {
		return (super.toString() + " Department: " + department);
	}

	public boolean equals(Object o) {
		return ((o instanceof Teacher) && (super.equals((Person) o))
				&& (this.department.equals(((Teacher) o).department)));
	}
}
