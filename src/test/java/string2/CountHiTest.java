package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountHiTest {

    @Test
    public void returnsZeroWhenHiIsNotPresent() {
        CountHi countHi = new CountHi();

        assertEquals(0, countHi.countHi("Just a plain old String"));
    }

    @Test
    public void returnsNumberOfTimesWhenHiIsPresent() {
        CountHi countHi = new CountHi();

        assertEquals(1, countHi.countHi("abc hi ho"));
        assertEquals(1, countHi.countHi("hi"));
        assertEquals(2, countHi.countHi("hihi"));
    }

    @Test
    public void returnsZeroWhenStringHasOnlySingleChar() {
        CountHi countHi = new CountHi();

        assertEquals(0, countHi.countHi("h"));
    }
}