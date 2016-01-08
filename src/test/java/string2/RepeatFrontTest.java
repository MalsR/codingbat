package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatFrontTest {

    private static final String message = "Expected a string to be return with the first N characters of the string, " +
            "followed by returning the first n-1 characters of the string";

    @Test
    public void shouldReturnStringPrefixOfFirstNCharactersOfTheStringFollowedBy_N_MinusOne() {
        RepeatFront repeatFront = new RepeatFront();

        assertEquals(message, "IcI", repeatFront.repeatFront("Ice Cream", 2));
        assertEquals(message, "ChocChoChC", repeatFront.repeatFront("Chocolate", 4));
    }

    @Test
    public void shouldReturnEmptyStringWhenTimesToRepeatIsZero() {
        RepeatFront repeatFront = new RepeatFront();

        String actualString = repeatFront.repeatFront("Chocolate", 0);

        assertEquals("", actualString);
    }
}