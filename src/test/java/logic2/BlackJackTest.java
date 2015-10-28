package logic2;

import org.junit.Test;

import static org.junit.Assert.*;

public class BlackJackTest {

    @Test
    public void returnZeroWhenBothNumbersAreOverTwentyOne() {
        BlackJack blackJack = new BlackJack();

        assertEquals(0, blackJack.blackjack(22, 25));
    }

    @Test
    public void returnValueClosestToTwentyOne() {
        BlackJack blackJack = new BlackJack();

        assertEquals(19, blackJack.blackjack(19, 22));
        assertEquals(21, blackJack.blackjack(21, 22));
    }

    @Test
    public void returnValueClosestToTwentyOneWhenBothValuesAreBelowOrEqualToTwentyOne() {
        BlackJack blackJack = new BlackJack();

        assertEquals(19, blackJack.blackjack(19, 18));
        assertEquals(20, blackJack.blackjack(19, 20));
    }
}