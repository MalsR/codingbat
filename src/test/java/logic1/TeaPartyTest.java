package logic1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeaPartyTest {

    @Test
    public void returnsOneIfBothTeaAndCandyAreAtLeastFive() {
        TeaParty teaParty = new TeaParty();

        assertEquals(1, teaParty.teaParty(5, 6));
    }

    @Test
    public void returnsZeroIfEitherTeaOrCandyIsLessThanFive() {
        TeaParty teaParty = new TeaParty();

        assertEquals(0, teaParty.teaParty(3, 6));
    }

    @Test
    public void returnsTwoIfEitherTeaOrCandyIsAtLeastDoubleTheAmountOfOther() {
        TeaParty teaParty = new TeaParty();

        assertEquals(2, teaParty.teaParty(20, 6));
    }
}