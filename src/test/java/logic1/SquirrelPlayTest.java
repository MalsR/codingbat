package logic1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquirrelPlayTest {

    @Test
    public void playsWhenTempIsEqualTo60OrOver() {
        SquirrelPlay squirrelPlay = new SquirrelPlay();

        assertTrue(squirrelPlay.squirrelPlay(75, false));
    }

    @Test
    public void playsWhenTempIsLessThanOrEqualTo90() {
        SquirrelPlay squirrelPlay = new SquirrelPlay();

        assertTrue(squirrelPlay.squirrelPlay(90, false));
    }

    @Test
    public void doesNotPlayWhenTempIsOver90AndNotInSummer() {
        SquirrelPlay squirrelPlay = new SquirrelPlay();

        assertFalse(squirrelPlay.squirrelPlay(91, false));
    }

    @Test
    public void playsWhenTempIs90OrOverDuringSummer() {
        SquirrelPlay squirrelPlay = new SquirrelPlay();

        assertTrue(squirrelPlay.squirrelPlay(94, true));
    }

    @Test
    public void playsWhenTempIsEqualTo100OrLessDuringSummer() {
        SquirrelPlay squirrelPlay = new SquirrelPlay();

        assertTrue(squirrelPlay.squirrelPlay(100, true));
    }

    @Test
    public void doesNotPlayWhenTempIsLessThan60DuringSummer() {
        SquirrelPlay squirrelPlay = new SquirrelPlay();

        assertFalse(squirrelPlay.squirrelPlay(59, true));
    }

    @Test
    public void doesNotPlayWhenTempIsMoreThan100DuringSummer() {
        SquirrelPlay squirrelPlay = new SquirrelPlay();

        assertFalse(squirrelPlay.squirrelPlay(101, true));
    }
}