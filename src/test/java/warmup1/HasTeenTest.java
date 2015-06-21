package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class HasTeenTest {

    @Test
    public void returnsTrueIfFirstArgumentIsIn13To19InclusiveRange() {
        HasTeen hasTeen = new HasTeen();

        assertTrue(hasTeen.hasTeen(13, 25, 35));
    }

    @Test
    public void returnsTrueIfSecondArgumentIsIn13To19InclusiveRange() {
        HasTeen hasTeen = new HasTeen();

        assertTrue(hasTeen.hasTeen(9, 15, 23));
    }

    @Test
    public void returnsTrueIfThirdArgumentIsIn13To19InclusiveRange() {
        HasTeen hasTeen = new HasTeen();

        assertTrue(hasTeen.hasTeen(2, 12, 19));
    }

    @Test
    public void returnsFalseIfAllArgumentsIsNotIn13To19Range() {
        HasTeen hasTeen = new HasTeen();

        assertFalse(hasTeen.hasTeen(2, 23, 11));
    }
}