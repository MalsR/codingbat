package logic1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AlarmClock {

//    Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating
//    if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring.
//
//    Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
//    Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
//
//    alarmClock(1, false) → "7:00"
//    alarmClock(5, false) → "7:00"
//    alarmClock(0, false) → "10:00"

    public String alarmClock(int day, boolean vacation) {

        Set<Integer> weekDays = new HashSet<>();
        weekDays.add(1);
        weekDays.add(2);
        weekDays.add(3);
        weekDays.add(4);
        weekDays.add(5);

        if (weekDays.contains(day)) {
            return vacation ? "10:00" : "7:00";
        } else {
            return vacation ? "off" : "10:00";
        }
    }
}
