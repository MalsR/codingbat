package logic2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MakeBricksTest {

    @Test
    public void returnsFalseWhenGoalIsBiggerThanProvidedBricks() {
        MakeBricks makeBricks = new MakeBricks();

        assertFalse(makeBricks.makeBricks(1, 5, 30));
        assertFalse(makeBricks.makeBricks(7, 1, 19));
        assertFalse(makeBricks.makeBricks(1, 0, 6));
    }

    @Test
    public void returnsTrueIfGoalLineCanBeBuiltByBothBricks() {
        MakeBricks makeBricks = new MakeBricks();

        assertTrue(makeBricks.makeBricks(3, 2, 10));
        assertTrue(makeBricks.makeBricks(3, 1, 8));
        assertTrue(makeBricks.makeBricks(1, 2, 11));
    }
}