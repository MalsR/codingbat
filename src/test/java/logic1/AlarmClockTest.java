package logic1;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlarmClockTest {

    @Test
    public void returnsSevenAMAlarmOnWeekday() {
        AlarmClock alarmClock = new AlarmClock();

        assertEquals("7:00", alarmClock.alarmClock(1, false));
        assertEquals("7:00", alarmClock.alarmClock(5, false));
    }

    @Test
    public void returnsTenAMAlarmOnWeekends() {
        AlarmClock alarmClock = new AlarmClock();

        assertEquals("10:00", alarmClock.alarmClock(0, false));
        assertEquals("10:00", alarmClock.alarmClock(6, false));
    }

    @Test
    public void returnsTenAMAlarmOnWeekdayWhenOnVacation() {
        AlarmClock alarmClock = new AlarmClock();

        assertEquals("10:00", alarmClock.alarmClock(1, true));
        assertEquals("10:00", alarmClock.alarmClock(5, true));
    }

    @Test
    public void returnsTenAMAlarmOnWeekendsWhenOnVacation() {
        AlarmClock alarmClock = new AlarmClock();

        assertEquals("off", alarmClock.alarmClock(0, true));
        assertEquals("off", alarmClock.alarmClock(6, true));
    }
}