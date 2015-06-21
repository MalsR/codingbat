package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MixStartTest {

    @Test
    public void returnsTrueWhenSecondAndThirdCharsStartWithIX() {
        MixStart mixStart = new MixStart();

        assertTrue(mixStart.mixStart("pix"));
    }

    @Test
    public void returnsFalseWhenProvidedStringIsEmpty() {
        MixStart mixStart = new MixStart();

        assertFalse(mixStart.mixStart(""));
    }

    @Test
    public void returnsFalseWhenSecondAndThirdCharsDoesNotStartWithIX() {
        MixStart mixStart = new MixStart();

        assertFalse(mixStart.mixStart("bit him"));
    }

    @Test
    public void returnsFalseWhenStringToCompareIsOnlyTwoInLength() {
        MixStart mixStart = new MixStart();

        assertFalse(mixStart.mixStart("mi"));
    }

}