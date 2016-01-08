package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatSeparatorTest {

    @Test
    public void returnsEmptyStringOnlyWhenCountIsZero() {
        RepeatSeparator repeatSeparator = new RepeatSeparator();

        String actualString = repeatSeparator.repeatSeparator("Hello", "-", 0);

        assertEquals("", actualString);
    }

    @Test
    public void returnsWordRepeatedByCountAndSeparatedBySeparator() {
        RepeatSeparator repeatSeparator = new RepeatSeparator();

        assertEquals("Word-Word-Word", repeatSeparator.repeatSeparator("Word", "-", 3));
        assertEquals("ThisAndThis", repeatSeparator.repeatSeparator("This", "And", 2));
    }

}