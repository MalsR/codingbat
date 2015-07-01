package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringMatchTest {

    @Test
    public void returnsTwoWhenStringHasTwoMatchingSubStringLengthOfTwo() {
        StringMatch stringMatch = new StringMatch();

        assertEquals(2, stringMatch.stringMatch("abc", "abc"));
    }

    @Test
    public void returnsThreeWhenStringHasThreeMatchingSubStringLengthOfTwo() {
        StringMatch stringMatch = new StringMatch();

        assertEquals(3, stringMatch.stringMatch("xxcaazz", "xxbaaz"));
    }

    @Test
    public void returnsZeroWhenNoMatchingSubStringLengthOfTwoExists() {
        StringMatch stringMatch = new StringMatch();

        assertEquals(0, stringMatch.stringMatch("abc", "adc"));
    }

    @Test
    public void returnsZeroWhenFirstStringToMatchIsEmpty() {
        StringMatch stringMatch = new StringMatch();

        assertEquals(0, stringMatch.stringMatch("", "adc"));
    }

    @Test
    public void returnsZeroWhenSecondStringToMatchIsEmpty() {
        StringMatch stringMatch = new StringMatch();

        assertEquals(0, stringMatch.stringMatch("abc", ""));
    }

}