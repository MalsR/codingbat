package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonkeyTroubleTest {

    private MonkeyTrouble monkeyTrouble;

    @Before
    public void setUp() throws Exception {
        monkeyTrouble = new MonkeyTrouble();
    }

    @Test
    public void returnsTrueIfBothMonkeysAreSmiling() {
        assertTrue(monkeyTrouble.monkeyTrouble(true, true));
    }

    @Test
    public void returnsTrueIfNeitherMonkeysAreSmiling() {
        assertTrue(monkeyTrouble.monkeyTrouble(false, false));
    }

    @Test
    public void returnsFalseIfOnlyOneMonkeyIsSmiling() {
        assertFalse(monkeyTrouble.monkeyTrouble(true, false));
        assertFalse(monkeyTrouble.monkeyTrouble(false, true));
    }
}