package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class XyBalanceTest {

    @Test
    public void returnsFalseWhenThereIsNoYCharsAfterXChar() {
        XyBalance xyBalance = new XyBalance();

        assertFalse("Expected to return false as there is no 'y' to balance 'x'", xyBalance.xyBalance("aaxbb"));
        assertFalse("Expected to return false as there is no 'y' to balance 'x'", xyBalance.xyBalance2("aaxbb"));
    }

    @Test
    public void returnsFalseWhenYCharacterAppearsBeforeXCharacter() {
        XyBalance xyBalance = new XyBalance();

        assertFalse("Expected to return false as 'y' is before 'x'", xyBalance.xyBalance("yaabxbb"));
        assertFalse("Expected to return false as 'y' is before 'x'", xyBalance.xyBalance2("yaabxbb"));
    }

    @Test
    public void returnsTrueWhenThereIsAYCharacterAfterXCharacter() {
        XyBalance xyBalance = new XyBalance();

        assertTrue("Expected to return true as a 'y' is after 'x'", xyBalance.xyBalance("aaxbyb"));
        assertTrue("Expected to return true as a 'y' is after 'x'", xyBalance.xyBalance2("aaxbyb"));
    }

    @Test
    public void returnsTrueWhenThereIsNoXCharacterInString() {
        XyBalance xyBalance = new XyBalance();

        assertTrue("Expected to return true as there is no 'x' char", xyBalance.xyBalance("aaabbb"));
        assertTrue("Expected to return true as there is no 'x' char", xyBalance.xyBalance2("aaabbb"));
    }

    @Test
    public void returnsTrueWhenStringContainsOnlySingleCharacterY() {
        XyBalance xyBalance = new XyBalance();

        assertTrue("Expected to return true as there is only a single char that is not 'x'", xyBalance.xyBalance("y"));
        assertTrue("Expected to return true as there is only a single char that is not 'x'", xyBalance.xyBalance2("y"));
    }

    @Test
    public void returnsTrueWhenStringIsEmpty() {
        XyBalance xyBalance = new XyBalance();

        assertTrue("Expected to return true with empty string", xyBalance.xyBalance(""));
        assertTrue("Expected to return true with empty string", xyBalance.xyBalance2(""));
    }

    @Test
    public void returnsFalseWhenStringContainsOnlyX() {
        XyBalance xyBalance = new XyBalance();

        assertFalse("Expected to return false when only char is 'x'", xyBalance.xyBalance("x"));
        assertFalse("Expected to return false when only char is 'x'", xyBalance.xyBalance2("x"));
    }
}