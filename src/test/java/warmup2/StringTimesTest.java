package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringTimesTest {

    @Test
    public void returnsSameStringWhenGivenStringIsEmpty() {
        StringTimes stringTimes = new StringTimes();

        assertEquals("", stringTimes.stringTimes("", 1));
    }

    @Test
    public void returnsSameStringWhenNumberIsZero() {
        StringTimes stringTimes = new StringTimes();

        assertEquals("", stringTimes.stringTimes("Hi", 0));
    }

    @Test
    public void returnsLargerStringNTimesTheGivenNumber() {
        StringTimes stringTimes = new StringTimes();

        assertEquals("HiHiHi", stringTimes.stringTimes("Hi", 3));
    }
}