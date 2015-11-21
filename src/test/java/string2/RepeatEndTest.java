package string2;

import org.junit.Test;

import java.nio.channels.ReadPendingException;

import static org.junit.Assert.*;

public class RepeatEndTest {

    @Test
    public void returnsEmptyStringWhenRepetitionNumberIsZero() {
        RepeatEnd repeatEnd = new RepeatEnd();

        assertEquals("Expected to return empty string where repetition is zero", "", repeatEnd.repeatEnd("Bye", 0));
    }

    @Test
    public void returnsRepeatableEndSectionOfStringWhenRepetitionNumberIsOne() {
        RepeatEnd repeatEnd = new RepeatEnd();

        assertEquals("Expected to return 'o' when repetition is one", "o", repeatEnd.repeatEnd("Hello", 1));
    }

    @Test
    public void returnsRepeatableEndSectionOfStringWhenRepetitionNumberIsTwo() {
        RepeatEnd repeatEnd = new RepeatEnd();

        assertEquals("", "yeye", repeatEnd.repeatEnd("Bye", 2));
    }

    @Test
    public void returnsRepeatableEndSectionOfStringWhenRepetitionNumberIsThree() {
        RepeatEnd repeatEnd = new RepeatEnd();

        assertEquals("", "llollollo", repeatEnd.repeatEnd("Hello", 3));
    }

    @Test
    public void returnsEmptyStringWhenStringToRepeatIsEmpty() {
        RepeatEnd repeatEnd = new RepeatEnd();

        assertEquals("", "", repeatEnd.repeatEnd("", 1));
    }
}