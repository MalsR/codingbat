package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrontTimesTest {

    @Test
    public void returnsSameStringWhenStringIsEmpty() {
        FrontTimes frontTimes = new FrontTimes();

        assertEquals("", frontTimes.frontTimes("", 1));
    }

    @Test
    public void returnsLongerStringWithNTimesWhenGivenStringLengthIsThree() {
        FrontTimes frontTimes = new FrontTimes();

        assertEquals("AbcAbcAbc", frontTimes.frontTimes("Abc", 3));
    }

    @Test
    public void returnsLongerStringWithNTimesWhenGivenStringIsOverThreeInLength() {
        FrontTimes frontTimes = new FrontTimes();

        assertEquals("HelHel", frontTimes.frontTimes("Hello", 2));
    }
}