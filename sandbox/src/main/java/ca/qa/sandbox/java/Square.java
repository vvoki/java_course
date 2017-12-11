package ca.qa.sandbox.java;

/**
 * Created by viktoriiaomelchenko on 2017-11-17.
 */
public class Square {
    public double l;

    public Square (double len) {
        this.l = len;
    }

    public double area () {
        return this.l * this.l;
    }
}
