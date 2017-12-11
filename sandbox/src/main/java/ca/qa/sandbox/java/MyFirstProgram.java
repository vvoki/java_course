package ca.qa.sandbox.java;

public class MyFirstProgram {

	public static void main (String[] args) {
		hello("world");
		hello("user");
		hello("Vikachka");

		Square s = new Square(5);
		System.out.println("Square area is " + s.area());

		Rectangle r = new Rectangle(3, 4);
		System.out.println("Rectangle area is " + r.area());
	}

	public static void hello (String something) {
		System.out.println("Hello, " + something + "!");
	}

}