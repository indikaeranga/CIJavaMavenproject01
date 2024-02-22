
import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class IntegrationTest {
    public Main main;
    @Test
    public void testAdditionAndMultiplication() {
        main =new Main();

        // Test addition and multiplication together
        assertEquals(10, main.addition(main.multiply(2, 3), 4));
    }

    @Test
    public void testDivisionAndSubtraction() {
        main =new Main();

        // Test division and subtraction together
        assertEquals(2, main.division(main.substration(8, 2), 3));
    }

    @Test
    public void testPowerAndAbsoluteValue() {
        main =new Main();

        // Test power and absolute value together
        assertEquals(25, main.power(main.absoluteValue(-5), 2));
    }

}
