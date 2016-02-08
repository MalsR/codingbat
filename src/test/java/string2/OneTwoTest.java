package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class OneTwoTest {

    @Test
    public void movesFirstCharToComeAfterNextTwoChars_WhenStringLengthIsThree() {
        OneTwo oneTwo = new OneTwo();

        assertEquals("cat", oneTwo.oneTwo("tca"));
    }

    @Test
    public void movesFirstCharToComeAfterNextTwoCharsAndIgnoreAnyCharGroupLessThanThreeInLength() {
        OneTwo oneTwo = new OneTwo();

        assertEquals("catat", oneTwo.oneTwo("tcaat"));
    }

    @Test
    public void movesFirstCharToComeAfterNextTwoChars_WhenStringLengthIsSix() {
        OneTwo oneTwo = new OneTwo();

        assertEquals("dogeat", oneTwo.oneTwo("gdotea"));
    }

    @Test
    public void returnsEmptyStringWhenStringLengthIsLessThanThree() {
        OneTwo oneTwo = new OneTwo();

        assertEquals("", oneTwo.oneTwo("at"));
    }

}