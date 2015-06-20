package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StartHiTest {

    @Test
    public void returnsTrueIfGivenStringStartsWithHi() {
        StartHi startHi = new StartHi();

        assertTrue(startHi.startHi("hi how are you?"));
    }

    @Test
    public void returnsTrueIfGivenStringIsHiOnly() {
        StartHi startHi = new StartHi();

        assertTrue(startHi.startHi("hi"));
    }

    @Test
    public void returnsFalseIfGivenStringIsEmpty() {
        StartHi startHi = new StartHi();

        assertFalse(startHi.startHi(""));
    }

    @Test
    public void returnsFalseIfGivenStringDoesNotContainHi() {
        StartHi startHi = new StartHi();

        assertFalse(startHi.startHi("hello say what"));
    }

    @Test
    public void returnsFalseIfGivenStringContainsHi() {
        StartHi startHi = new StartHi();

        assertFalse(startHi.startHi("hello hi there"));
    }
}