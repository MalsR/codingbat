package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class EveryNthTest {

    @Test
    public void returnsSameStringWhenGivenStringIsEmpty() {
        EveryNth everyNth = new EveryNth();

        assertEquals("", everyNth.everyNth("", 1));
    }

    @Test
    public void returnsSameStringWhenGivenStringLengthIsOne() {
        EveryNth everyNth = new EveryNth();

        assertEquals("a", everyNth.everyNth("a", 2));
    }

    @Test
    public void returnsStringWithFirstCharWhenGivenStringLengthIsTwo() {
        EveryNth everyNth = new EveryNth();

        assertEquals("a", everyNth.everyNth("ac", 2));
    }

    @Test
    public void returnsUpdatedStringWhenGivenStringLengthIsMoreThanOne() {
        EveryNth everyNth = new EveryNth();

        assertEquals("Mrce", everyNth.everyNth("Miracle", 2));
    }
}