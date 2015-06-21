package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoneTeenTest {

    @Test
    public void returnsTrueIfOnlyFirstArgumentIsInRange13To19Inclusive() {
        LoneTeen loneTeen = new LoneTeen();

        assertTrue(loneTeen.loneTeen(13, 20));
    }

    @Test
    public void returnsTrueIfOnlySecondArgumentIsInRange13To19Inclusive() {
        LoneTeen loneTeen = new LoneTeen();

        assertTrue(loneTeen.loneTeen(9, 18));
    }

    @Test
    public void returnsFalseIfBothArgumentsIsInRange13To19Inclusive() {
        LoneTeen loneTeen = new LoneTeen();

        assertFalse(loneTeen.loneTeen(13, 19));
    }
}