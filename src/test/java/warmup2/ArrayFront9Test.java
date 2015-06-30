package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayFront9Test {

    @Test
    public void returnsFalseIfFirstFourElementsDoesNotContainANine() {
        ArrayFront9 arrayFront9 = new ArrayFront9();

        assertFalse(arrayFront9.arrayFront9(new int[]{2 ,3 ,4, 5, 9}));
    }

    @Test
    public void returnsTrueIfFirstFourElementsContainsANine() {
        ArrayFront9 arrayFront9 = new ArrayFront9();

        assertTrue(arrayFront9.arrayFront9(new int[] {9, 2, 3, 4 }));
    }

    @Test
    public void returnsFalseIfArrayLengthIsLessThanFour() {
        ArrayFront9 arrayFront9 = new ArrayFront9();

        assertFalse(arrayFront9.arrayFront9(new int[]{2, 3, 4}));
    }
}