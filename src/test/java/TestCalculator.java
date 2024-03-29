import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {


    public Main main;
    @Test
    public void testMainConstrctor()
    {
        main =new Main();

        assertNotEquals(main,null);
    }

    @Test
    public void testadd()
    {
        main=new Main();
        assertEquals(4,main.addition(2,2));
    }
    @Test
    public void testSubstration()
    {
        main=new Main();
        assertEquals(0,main.substration(2,2));
    }
    @Test
    public void testmultiply()
    {
        main=new Main();
        assertEquals(6,main.multiply(3,2));
    }
    @Test
    public void testminimum()
    {
        main=new Main();
        assertEquals(3,main.minimum(8,3));
    }
    @Test
    public void testmaximum()
    {
        main=new Main();
        assertEquals(8,main.maximum(8,3));
    }
    @Test
    public void testdivision()
    {
        main=new Main();
        assertEquals(2,main.division(8,4));
    }
    @Test
    public void testmodulus()
    {
        main=new Main();
        assertEquals(3,main.modulus(7,4));
    }
    @Test
    public void testpower()
    {
        main=new Main();
        assertEquals(27,main.power(3,3));
    }
    @Test
    public void testfactorial()
    {
        main=new Main();
        assertEquals(6,main.factorial(3));
    }
    @Test
    public void testabsoluteValue()
    {
        main=new Main();
        assertEquals(7,main.absoluteValue(7));
    }

}
