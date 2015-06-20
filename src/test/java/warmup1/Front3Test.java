package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Front3Test {

    @Test
    public void returnsUpdatedStringWhenGivenStringIsMoreThanThreeInLength() {
        Front3 front3 = new Front3();

        assertEquals("batbatbat", front3.front3("batting"));
    }

    @Test
    public void returnsUpdatedStringWhenGivenStringIsEqualToThreeInLength() {
        Front3 front3 = new Front3();

        assertEquals("tabtabtab", front3.front3("tab"));
    }

    @Test
    public void returnsUpdatedStringWhenGivenStringIsLessThanThreeInLength() {
        Front3 front3 = new Front3();

        assertEquals("bababa", front3.front3("ba"));
    }

}