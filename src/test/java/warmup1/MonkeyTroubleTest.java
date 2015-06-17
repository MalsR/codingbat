package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MonkeyTroubleTest {

    @Test
    public void returnsTrueIfBothMonkeysAreSmiling() {
        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();

        assertTrue(monkeyTrouble.monkeyTrouble(true, true));
    }

    @Test
    public void returnsTrueIfNeitherMonkeysAreSmiling() {
        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();

        assertTrue(monkeyTrouble.monkeyTrouble(false, false));
    }

    @Test
    public void returnsFalseIfOnlyOneMonkeyIsSmiling() {
        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();

        assertFalse(monkeyTrouble.monkeyTrouble(true, false));
        assertFalse(monkeyTrouble.monkeyTrouble(false, true));
    }
}