package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MixStringTest {

    @Test
    public void returnsFirstStringWhenSecondStringIsEmpty() {
        MixString mixString = new MixString();

        assertEquals("Expected to return the first string when second is empty",
                     "Hello", mixString.mixString("Hello", ""));
    }

    @Test
    public void returnsSecondStringWhenFirstStringIsEmpty() {
        MixString mixString = new MixString();

        assertEquals("Expected to return the second string when first is empty",
                "Bye", mixString.mixString("", "Bye"));
    }

    @Test
    public void returnsMixedFirstAndSecondStringsWithRemainingFirstStringAtEnd() {
        MixString mixString = new MixString();

        assertEquals("Expected ro return a string with ascending mix of first and second chars and the remaining" +
                "at the end", "HSealmlo", mixString.mixString("Hello", "Sam"));
    }

    @Test
    public void returnsMixedFirstAndSecondStringsWithRemainingSecondStringAtEnd() {
        MixString mixString = new MixString();

        assertEquals("Expected ro return a string with ascending mix of first and second chars and the remaining" +
                "at the end", "HMeolrlnoing", mixString.mixString("Hello", "Morning"));
    }

    @Test
    public void returnsEmptyStringWhenBothStringsAreEmpty() {
        MixString mixString = new MixString();

        assertEquals("Expected to return empty string", "", mixString.mixString("", ""));
    }

}