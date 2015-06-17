package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;


public class SleepInTest {

    @Test
    public void sleepInIfNotWeekdayAndNotInVacation() {
        SleepIn sleepIn = new SleepIn();

        assertTrue(sleepIn.sleepIn(false, false));
    }

    @Test
    public void noSleepInIfWeekDayAndNotInVacation() {
        SleepIn sleepIn = new SleepIn();

        assertFalse(sleepIn.sleepIn(true, false));
    }

    @Test
    public void sleepInIfNotWeekdayAndInVacation() {
        SleepIn sleepIn = new SleepIn();

        assertTrue(sleepIn.sleepIn(false, true));
    }

    @Test
    public void sleepInIfWeekdayAndInVacation() {
        SleepIn sleepIn = new SleepIn();

        assertTrue(sleepIn.sleepIn(true, true));
    }
}