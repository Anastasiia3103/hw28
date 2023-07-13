import hw28.MathLibrary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathLibraryTest {
    @Test
    public void testAddition() {
        double result = MathLibrary.add (2.5, 3.5);
        Assertions.assertEquals (6.0, result);
    }

    @Test
    public void testDivision() {
        double result = MathLibrary.divide (10.0, 2.0);
        Assertions.assertEquals (5.0, result);
    }
    @Test
    public void testSubtract() {
        double result = MathLibrary.subtract(5.0, 3.0);
        Assertions.assertEquals(2.0, result);
    }

    @Test
    public void testMultiply() {
        double result = MathLibrary.multiply(4.0, 2.5);
        Assertions.assertEquals(10.0, result);
    }
    @Test
    public void testDivisionByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            MathLibrary.divide(10.0, 0.0);
        });
    }
}
