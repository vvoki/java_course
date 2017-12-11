package ca.qa.sandbox.java;

/**
 * Created by viktoriiaomelchenko on 2017-11-17.
 */
public class Rectangle {
    public double a;
    public double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area () {
        return this.a * this.b;
    }
}
