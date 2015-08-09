package logic1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CaughtSpeedingTest {

    @Test
    public void returnsZeroWhenSpeedIsLessThanSixty() {
        CaughtSpeeding caughtSpeeding = new CaughtSpeeding();

        assertEquals(0, caughtSpeeding.caughtSpeeding(55, false));
    }

    @Test
    public void returnsZeroWhenSpeedIsSixty() {
        CaughtSpeeding caughtSpeeding = new CaughtSpeeding();

        assertEquals(0, caughtSpeeding.caughtSpeeding(60, false));
    }

    @Test
    public void returnsZeroWhenSpeedIsLessThanSixtyFiveOnBirthday() {
        CaughtSpeeding caughtSpeeding = new CaughtSpeeding();

        assertEquals(0, caughtSpeeding.caughtSpeeding(65, true));
    }

    @Test
    public void returnsOneWhenSpeedIsLessThanEighty() {
        CaughtSpeeding caughtSpeeding = new CaughtSpeeding();

        assertEquals(1, caughtSpeeding.caughtSpeeding(75, false));
    }

    @Test
    public void returnsOneWhenSpeedIsEighty() {
        CaughtSpeeding caughtSpeeding = new CaughtSpeeding();

        assertEquals(1, caughtSpeeding.caughtSpeeding(80, false));
    }

    @Test
    public void returnsOneWhenSpeedIsLessThanEightyFiveOnBirthday() {
        CaughtSpeeding caughtSpeeding = new CaughtSpeeding();

        assertEquals(1, caughtSpeeding.caughtSpeeding(85, true));
    }

    @Test
    public void returnsTwoWhenSpeedIsEightyOneOrMore() {
        CaughtSpeeding caughtSpeeding = new CaughtSpeeding();

        assertEquals(2, caughtSpeeding.caughtSpeeding(81, false));
    }

    @Test
    public void returnsTwoWhenSpeedIsEightySixOrMoreOnBirthday() {
        CaughtSpeeding caughtSpeeding = new CaughtSpeeding();

        assertEquals(2, caughtSpeeding.caughtSpeeding(86, true));
    }
}