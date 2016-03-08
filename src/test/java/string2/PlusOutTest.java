package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOutTest {

    @Test
    public void returnsStringReplacedWithPlusesWhenWholeWordToExcludeDoesNotExist() {
        PlusOut plusOut = new PlusOut();

        assertEquals("Expected the whole string to be replaced with pluses as no match of the word 'at'" +
                "was found", "++++", plusOut.plusOut("hello", "at"));
    }

    @Test
    public void returnsEmptyStringWhenStringToReplaceIsEmpty() {
        PlusOut plusOut = new PlusOut();

        assertEquals("Expected empty string to return as string to check is empty", "", plusOut.plusOut("", "ate"));
    }

    @Test
    public void returnsStringReplacedWithPlusesExcludingWordToFilter() {
        PlusOut plusOut = new PlusOut();

        assertEquals("Expected only a single occurrence of 'xy' to be returned with the pluses",
                "++xy++", plusOut.plusOut("12xy34", "xy"));
    }

    @Test
    public void returnsStringReplacedWithPlusesExcludingWordToFilterWithMultipleOccurrences() {
        PlusOut plusOut = new PlusOut();

        assertEquals("Expected only two occurrences of 'xy' with the rest consisting of pluses",
                "++xy++++xy+++++++++", plusOut.plusOut("12xy3456xyz890xd982", "xy"));
    }

    @Test
    public void returnsStringReplacedWithPlusesWhenWordToExcludeIsAtEndOfString() {
        PlusOut plusOut = new PlusOut();

        assertEquals("Expected only a single occurrence of 'xy' with the rest consisting of pluses",
                "+++++xy", plusOut.plusOut("Helloxy", "xy"));
    }
}