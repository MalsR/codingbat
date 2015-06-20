package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Front22Test {

    @Test
    public void returnsStringWithFirstTwoCharsInFrontAndBack() {
        Front22 front22 = new Front22();

        assertEquals("hehellohe", front22.front22("hello"));
    }

    @Test
    public void returnsSameStringWhenGivenStringIsEmpty() {
        Front22 front22 = new Front22();

        assertEquals("", front22.front22(""));
    }

    @Test
    public void returnsSameStringWhenGivenStringIsTwoInLenght() {
        Front22 front22 = new Front22();

        assertEquals("hahaha", front22.front22("ha"));
    }

    @Test
    public void returnsStringWithCharInFrontAndBackWhenStringIsOneInLength() {
        Front22 front22 = new Front22();

        assertEquals("xxx", front22.front22("x"));
    }

}