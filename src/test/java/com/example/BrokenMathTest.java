package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



public class BrokenMathTest {
    @Test
    public void testAddition() {
        BrokenMath math = new BrokenMath(0);
        assertEquals(5, math.add(2, 3)); // This will fail due to the incorrect implementation
    }

    @Test
    public void testFactorial() {
        BrokenMath math = new BrokenMath(0);
        assertEquals(120, math.factorial(5)); // Works but inefficient for large numbers
    }

    @Test
    public void testDivision() {
        BrokenMath math = new BrokenMath(0);
        assertEquals(2, math.divide(10, 5)); // Missing return statement could cause issues
        assertThrows(ArithmeticException.class, () -> math.divide(10, 0));
    }
}
