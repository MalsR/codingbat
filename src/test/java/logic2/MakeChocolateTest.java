package logic2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MakeChocolateTest {
    //TODO update example test names

    @Test
    public void returnsMinusOneIfCombinationDoesNotMeetGoal() {
        MakeChocolate makeChocolate = new MakeChocolate();

        assertEquals(-1, makeChocolate.makeChocolate(2, 1, 10));
    }

    @Test
    public void returnsNumOfSmallBarsWhenCombinationsExactlyMatchGoal() {
        MakeChocolate makeChocolate = new MakeChocolate();

        assertEquals(4, makeChocolate.makeChocolate(4, 1, 9));
    }

    @Test
    public void returnsNumOfSmallBarsWhenBiggerBarsExceedGoal() {
        MakeChocolate makeChocolate = new MakeChocolate();

        assertEquals(2, makeChocolate.makeChocolate(4, 2, 7));
    }

    @Test
    public void returnsNumOfSmallBarsWhenBiggerBarsDoesNotExceedGoal() {
        MakeChocolate makeChocolate = new MakeChocolate();

        assertEquals(2, makeChocolate.makeChocolate(4, 1, 7));
        assertEquals(5, makeChocolate.makeChocolate(6, 1, 10));
    }
}