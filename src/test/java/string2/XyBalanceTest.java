package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class XyBalanceTest {

    @Test
    public void returnsFalseWhenThereIsNoYCharsAfterXChar() {
        XyBalance xyBalance = new XyBalance();

        assertFalse(xyBalance.xyBalance("aaxbb"));
    }

    @Test
    public void returnsFalseWhenYCharacterAppearsBeforeXCharacter() {
        XyBalance xyBalance = new XyBalance();

        assertFalse(xyBalance.xyBalance("yaabxbb"));
    }

    @Test
    public void returnsTrueWhenThereIsAYCharacterAfterXCharacter() {
        XyBalance xyBalance = new XyBalance();

        assertTrue(xyBalance.xyBalance("aaxbyb"));
    }
}