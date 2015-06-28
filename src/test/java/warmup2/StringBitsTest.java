package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringBitsTest {

    @Test
    public void returnsEmptyStringWhenGivenStringIsEmpty() {
        StringBits stringBits = new StringBits();

        assertEquals("", stringBits.stringBits(""));
    }

    @Test
    public void returnsEveryOtherCharStaringWithFirstGivenString() {
        StringBits stringBits = new StringBits();

        assertEquals("Hello", stringBits.stringBits("Heeololeo"));
    }

}