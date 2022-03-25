package day10;

class Person {
	protected String fname = "John";
	protected String lname = "Doe";
	protected String email = "john@doe.com";
	protected int age = 24;
}

public class AccessModifierDemo extends Person {
	private int graduationYear = 2019;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		AccessModifierDemo myObj = new AccessModifierDemo();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
	}

}
