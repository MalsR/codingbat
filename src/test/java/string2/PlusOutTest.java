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
    public void returnsEmptyStringWhenStringToReplaceIsEmpty() {
        PlusOut plusOut = new PlusOut();

        assertEquals("", plusOut.plusOut("", "ate"));
    }

    @Test
    public void returnsStringReplacedWithPlusesOnWordsToFilter() {
        PlusOut plusOut = new PlusOut();

        assertEquals("++xy++", plusOut.plusOut("12xy34", "xy"));
    }
}