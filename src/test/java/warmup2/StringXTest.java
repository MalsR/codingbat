package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringXTest {

    @Test
    public void returnsUpdatedStringWhereAllXInBetweenCharsAreRemoved() {
        StringX stringX = new StringX();

        assertEquals("abcd", stringX.stringX("abxxxcd"));
    }

    @Test
    public void returnsUpdatedStringWhereAllXAreRemovedApartFromStartAndFinish() {
        StringX stringX = new StringX();

        assertEquals("xHix", stringX.stringX("xxHxix"));
    }
}