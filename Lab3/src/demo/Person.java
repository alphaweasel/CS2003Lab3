package demo;

public class Person {
	static int currentYear = 2017;
	private String name;
	private int birthdate;
	private int age;

	// constructor
	public Person(String name, int birthdateInput) {
		this.name = name;
		this.birthdate = birthdateInput;
	} // end constructor(String, int)

	// resets the birth date to the current year
	public void reset_birthday(int year) {
		birthdate = year;
	} // end method reset_birthday

	// prints out the name of the person, their birth year, and their age
	public void display() {
		System.out.println("This is " + name);
		System.out.printf("I was born in %d. ", birthdate);
		age = currentYear - birthdate;
		System.out.printf("I am %d years old ", age);
	} // end method display

	// checks to see if the person is 65 or older
	public void isSenior() {
		if (age >= 65) {
			System.out.println("\nI'm a senior citizen");
		} else {
			System.out.println("\nI'm not old enough to be classified as a senior by Medicare!");
		}
	}// end method isSenior

	// main method
	public static void main(String[] args) {
		Person John = new Person("John", 1957);
		John.display();
		John.isSenior();
	} // end main

}