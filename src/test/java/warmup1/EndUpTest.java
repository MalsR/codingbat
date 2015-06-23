package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class EndUpTest {

    @Test
    public void returnsStringInUpperCaseWhenLengthIsLessThanThree() {
        EndUp endUp = new EndUp();

        assertEquals("HI", endUp.endUp("hi"));
    }

    @Test
    public void returnsLastThreeCharsUpperCaseWhenStringLenghtIsMoreThanThree() {
        EndUp endUp = new EndUp();

        assertEquals("welcome ALL", endUp.endUp("welcome all"));
    }

    @Test
    public void returnsEmptyStringWhenGivenStringIsEmpty() {
        EndUp endUp = new EndUp();

        assertEquals("", endUp.endUp(""));
    }

}