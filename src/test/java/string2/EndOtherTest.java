package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class EndOtherTest {

    @Test
    public void returnsTrueWhenBothStringsOfSameLengthAreEqualIgnoringCase() {
        EndOther endOther = new EndOther();

        assertTrue("Expected to return true when both strings have same length & equal", endOther.endOther("the", "thE"));
    }

    @Test
    public void returnsFalseWhenBothStringsOfSameLengthAreNotEqual() {
        EndOther endOther = new EndOther();

        assertFalse("Expected to return false as both strings are not equal",endOther.endOther("thee", "The"));
    }

    @Test
    public void returnsTrueIfFirstStringAppearsAtEndOfSecondStringIgnoringCase() {
        EndOther endOther = new EndOther();

        assertTrue("Expected true as first string appears at end of second string", endOther.endOther("AbC", "HiaBc"));
    }

    @Test
    public void returnsTrueIfSecondStringAppearsAtEndOfFirstStringIgnoringCase() {
        EndOther endOther = new EndOther();

        assertTrue("Expected true as second string appears at end of first string", endOther.endOther("Hiabc", "abc"));
    }

    @Test
    public void returnsFalseWhenBothStringOfVariedLengthAreNotEqual() {
        EndOther endOther = new EndOther();

        assertFalse("Expected false as second string does not appear at end of first string",
                    endOther.endOther("Hiabc", "abcd"));
    }
}