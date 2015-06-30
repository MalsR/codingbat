package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayCount9Test {

    @Test
    public void returnsCorrectNumberOfNinesInArray() {
        ArrayCount9 arrayCount = new ArrayCount9();

        assertEquals(2, arrayCount.arrayCount9(new int[]{1, 9, 3, 9, 0}));
    }

    @Test
    public void returnsZeroWhenArrayHasNoNines() {
        ArrayCount9 arrayCount9 = new ArrayCount9();

        assertEquals(0, arrayCount9.arrayCount9(new int[] {2, 3, 4, 18}));
    }
}