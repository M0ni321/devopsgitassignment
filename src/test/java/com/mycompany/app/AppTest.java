package test.java.com.mycompany.app;

import main.java.com.mycompany.app.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest
{

    @Test
    public void testAddition() {
        assertEquals(2.0, App.addition(1,1));
    }

    @Test
    public void testSubtraction() {
        assertEquals(0.0, App.subtraction(1,1));
    }

    @Test
    public void testDivision() {
        assertEquals("2.0", App.division(2,1));
    }

    @Test
    public void testDivisionByZero() {
        assertEquals("Division by zero not possible", App.division(2,0));
    }

    @Test
    public void testMultiplication() {
        assertEquals(1.0, App.multiplication(1,1));
    }
}
