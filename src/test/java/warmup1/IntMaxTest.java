package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntMaxTest {

    @Test
    public void returnLargestInt() {
        IntMax intMax = new IntMax();

        assertEquals(5, intMax.intMax(2, 4, 5));
    }
}