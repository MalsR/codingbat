package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOutTest {

    @Test
    public void returnsWholeStringReplacedWithPlusesWhenWordsToFilterOutDoNotExist() {
        //hmm quite a long method name
        PlusOut plusOut = new PlusOut();

        assertEquals("++++", plusOut.plusOut("hello", "at"));
    }

    @Test
    public void returnsEmptyStringWhenEmpty() {
        PlusOut plusOut = new PlusOut();

        assertEquals("", plusOut.plusOut("", "ate"));
    }
}