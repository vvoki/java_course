package ca.qa.sandbox;

import ca.qa.sandbox.java.Square;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by viktoriiaomelchenko on 2017-12-06.
 */
public class SquareTests {

    @Test
    public void testArea() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25.0 );
    }
}
