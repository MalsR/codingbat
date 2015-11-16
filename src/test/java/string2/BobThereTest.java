package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class BobThereTest {

    @Test
    public void returnTrueIfStringContainsBob() {
        BobThere bobThere = new BobThere();

        assertTrue(bobThere.bobThere("abcbob"));
    }

    @Test
    public void returnsTrueIfStringContainsBobWhereOCanBeAnyCharacter() {
        BobThere bobThere = new BobThere();

        assertTrue("Expected true as string contains bob where char o is replaced by 9", bobThere.bobThere("b9b"));
    }

    @Test
    public void returnsFalseWhenStringDoesNotContainBob() {
        BobThere bobThere = new BobThere();

        assertFalse("Expected false as string does not contain bob or bob where o is replaced",
                bobThere.bobThere("abchellob"));
    }

    @Test
    public void returnsFalseWhenStringIsEmpty() {
        BobThere bobThere = new BobThere();

        assertFalse(bobThere.bobThere(""));
    }
}