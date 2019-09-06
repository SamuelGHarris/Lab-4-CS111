/**
* CS 111 Section No. 002
* Lab Assignment 4
* @author Samuel Harris
**/

import java.util.Calendar;

public class Person {

	private String firstName;
	private String lastName;
	private Date dob;

	// null contructor
	public Person() {
		this.firstName = "AAAA";
		this.lastName = "BBBB";
		this.dob = new Date();
	}

	// contructor which takes firstname,lastname and age
	public Person(String first, String last, Date dob) {
		this.firstName = first;
		this.lastName = last;
		this.dob = dob;

	}

	// getter for DateOfBirth
	public Date getDOB() {
		return this.dob;
	}

	// Getter for first name
	public String getFirst() {
		return this.firstName;
	}

	// Getter for last name
	public String getLast() {
		return this.lastName;
	}

	public int getAge() {
		return ((Calendar.getInstance().get(Calendar.YEAR)) - (dob.getYear()));
	}

	public boolean equals(Object o) {
		return ((o instanceof Person) && (this.firstName.equals(((Person) o).firstName))
				&& (this.lastName.equals(((Person) o).lastName)) && (this.dob.equals(((Person) o).dob)));
	}

	public String toString() {
		return (" Firstname: " + firstName + " LastName: " + lastName + " Age: " + this.getAge());
	}
}