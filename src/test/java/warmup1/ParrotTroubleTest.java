package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParrotTroubleTest {

    @Test
    public void returnsFalseIfParrotIsNotTalking() {
        ParrotTrouble parrotTrouble = new ParrotTrouble();

        assertFalse(parrotTrouble.parrotTrouble(false, 4));
    }

    @Test
    public void returnsFalseIfParrotIsTalkingAndHourIsSeven() {
        ParrotTrouble parrotTrouble = new ParrotTrouble();

        assertFalse(parrotTrouble.parrotTrouble(false, 7));
    }

    @Test
    public void returnsTrueIfParrotIsTalkingAndHourIsBeforeSeven() {
        ParrotTrouble parrotTrouble = new ParrotTrouble();

        assertTrue(parrotTrouble.parrotTrouble(true, 6));
    }

    @Test
    public void returnsTrueIfParrotIsTalkingAndHourIsAfterTwenty() {
        ParrotTrouble parrotTrouble = new ParrotTrouble();

        assertTrue(parrotTrouble.parrotTrouble(true, 21));
    }

    @Test
    public void returnsFalseIfParrotIsNotTalkingAndHourIsAfterTwenty() {
        ParrotTrouble parrotTrouble = new ParrotTrouble();

        assertFalse(parrotTrouble.parrotTrouble(false, 21));
    }
}