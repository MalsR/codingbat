package warmup1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class SleepInTest {

    private SleepIn sleepIn;

    @Before
    public void setUp() throws Exception {
        sleepIn = new SleepIn();
    }

    @Test
    public void sleepInIfNotWeekdayAndNotInVacation() {
        assertTrue(sleepIn.sleepIn(false, false));
    }

    @Test
    public void noSleepInIfWeekDayAndNotInVacation() {
        assertFalse(sleepIn.sleepIn(true, false));
    }

    @Test
    public void sleepInIfNotWeekdayAndInVacation() {
        assertTrue(sleepIn.sleepIn(false, true));
    }

    @Test
    public void sleepInIfWeekdayAndInVacation() {
        assertTrue(sleepIn.sleepIn(true, true));
    }
}