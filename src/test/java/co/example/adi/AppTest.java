
package co.example.adi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for Calculator App.
 */
public class AppTest {

    @Test
    public void testAddition() {
        assertEquals(15.0, 10.0 + 5.0);
    }

    @Test
    public void testSubtraction() {
        assertEquals(5.0, 10.0 - 5.0);
    }

    @Test
    public void testMultiplication() {
        assertEquals(50.0, 10.0 * 5.0);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, 10.0 / 5.0);
    }
}
