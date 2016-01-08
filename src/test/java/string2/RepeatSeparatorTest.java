package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatSeparatorTest {

    @Test
    public void returnsEmptyStringWhenTimesToRepeatIsZero() {
        RepeatSeparator repeatSeparator = new RepeatSeparator();

        String actualString = repeatSeparator.repeatSeparator("Hello", "-", 0);

        assertEquals("Expected empty string to be returned when count is zero", "", actualString);
    }

    @Test
    public void returnsStringRepeatedByNumberOfTimesUsingSeparator() {
        RepeatSeparator repeatSeparator = new RepeatSeparator();

        assertEquals("Word-Word-Word", repeatSeparator.repeatSeparator("Word", "-", 3));
        assertEquals("ThisAndThis", repeatSeparator.repeatSeparator("This", "And", 2));
    }
}