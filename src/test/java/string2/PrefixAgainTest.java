package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrefixAgainTest {

    @Test(expected = IllegalArgumentException.class)
    public void throwsExceptionWhenCharPrefixIsGreaterThanStringLength() {
        PrefixAgain prefixAgain = new PrefixAgain();

        prefixAgain.prefixAgain("Hello", 6);
        prefixAgain.prefixAgain2("Hello", 6);
    }

    @Test
    public void returnsTrueWhenCalculatedStringPrefixAppearsAnywhereElseInString() {
        PrefixAgain prefixAgain = new PrefixAgain();

        assertTrue(prefixAgain.prefixAgain("Hellheo", 2));
        assertTrue(prefixAgain.prefixAgain2("Hellheo", 2));
    }

    @Test
    public void returnsTrueWhenStringContainsSameCharsLengthOfTwoAndPrefixLengthIsOne() {
        PrefixAgain prefixAgain = new PrefixAgain();

        assertTrue(prefixAgain.prefixAgain("aa", 1));
        assertTrue(prefixAgain.prefixAgain2("aa", 1));
    }

    @Test
    public void returnsFalseWhenCalculatedStringPrefixDoesNotAppearAnywhereElseInString() {
        PrefixAgain prefixAgain = new PrefixAgain();

        assertFalse("Expected to return false since prefix does not contain anywhere else in String",
                prefixAgain.prefixAgain("abXYabc", 3));
    }
}