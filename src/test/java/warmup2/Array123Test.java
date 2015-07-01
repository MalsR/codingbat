package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Array123Test {

    @Test
    public void returnsTrueIfArrayContains123InOrder() {
        Array123 array123 = new Array123();

        assertTrue(array123.array123(new int[]{1,4,3,5,1,2,3}));
        assertTrue(array123.array123(new int[]{1, 1, 2, 3, 1}));
    }

    @Test
    public void returnsFalseIfArrayDoesNotContain123InOrder() {
        Array123 array123 = new Array123();

        assertFalse(array123.array123(new int[]{1, 1, 2, 4, 1}));
    }

    @Test
    public void returnsFalseIfArrayIsEmpty() {
        Array123 array123 = new Array123();

        assertFalse(array123.array123(new int[]{}));
    }

    @Test
    public void returnsTrueIfArrayHasOnlyElements123() {
        Array123 array123 = new Array123();

        assertTrue(array123.array123(new int[]{1,2,3}));
    }

    @Test
    public void returnsFalseIfArrayHasOnly1And2() {
        Array123 array123 = new Array123();

        assertFalse(array123.array123(new int[]{1,2}));
    }
}