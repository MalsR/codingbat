package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatFrontTest {

    @Test
    public void shouldReturnStringWithPrefixRepeatedWhenTimesToRepeatIsTwo() {
        RepeatFront repeatFront = new RepeatFront();

        String actualString = repeatFront.repeatFront("Ice Cream", 2);

        assertEquals("IcI", actualString);
    }

    @Test
    public void shouldReturnStringPrefixRepeatedWhenTimesToRepeatIsFour() {
        RepeatFront repeatFront = new RepeatFront();

        String actualString = repeatFront.repeatFront("Chocolate", 4);

        assertEquals("ChocChoChC", actualString);
    }

    @Test
    public void shouldReturnEmptyStringWhenTimesToRepeatIsZero() {
        RepeatFront repeatFront = new RepeatFront();

        String actualString = repeatFront.repeatFront("Chocolate", 0);

        assertEquals("", actualString);
    }
}