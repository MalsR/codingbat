package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Close10Test {

    @Test
    public void returnsTrueWhenFirstArgumentIsNearestToTen() {
        Close10 close10 = new Close10();

        assertEquals(7, close10.close10(7, 14));
    }

    @Test
    public void returnsTrueWhenSecondArgumentIsNearestToTen() {
        Close10 close10 = new Close10();

        assertEquals(11, close10.close10(7, 11));
    }

    @Test
    public void returnsZeroWhenBothArgumentsAreNearestToTen() {
        Close10 close10 = new Close10();

        assertEquals(0, close10.close10(8, 8));
    }
}