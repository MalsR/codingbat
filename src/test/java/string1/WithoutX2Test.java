package string1;

import org.junit.Test;

import static org.junit.Assert.*;

public class WithoutX2Test {

    @Test
    public void returnsStringWithoutXWhenItIsFirstChar() {
        WithoutX2 withoutX2 = new WithoutX2();

        assertEquals("Hello", withoutX2.withoutX2("xHello"));
    }

    @Test
    public void returnsStringWithoutXWhenItIsSecondChar() {
        WithoutX2 withoutX = new WithoutX2();

        assertEquals("Hello", withoutX.withoutX2("Hxello"));
    }

    @Test
    public void returnsStringWithoutXWhenItIsFirstTwoChars() {
        WithoutX2 withoutX2 = new WithoutX2();

        assertEquals("ello", withoutX2.withoutX2("xxello"));
    }

    @Test
    public void returnsUnchangedStringXIsNotFirstTwoChars() {
        WithoutX2 withoutX2 = new WithoutX2();

        assertEquals("Hex", withoutX2.withoutX2("Hex"));
    }

    @Test
    public void returnsEmptyWhenStringIsEmpty() {
        WithoutX2 withoutX2 = new WithoutX2();

        assertEquals("", withoutX2.withoutX2(""));
    }

    @Test
    public void returnsEmptyStringWhenStringIsOnlyX() {
        WithoutX2 withoutX2 = new WithoutX2();

        assertEquals("", withoutX2.withoutX2("x"));
    }

    @Test
    public void returnsEmptyStringWhenStringIsOnlyXX() {
        WithoutX2 withoutX2 = new WithoutX2();

        assertEquals("", withoutX2.withoutX2("xx"));
    }
}