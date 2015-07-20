package string1;

import org.junit.Test;

import static org.junit.Assert.*;

public class WithoutXTest {

    @Test
    public void returnsUnChangedStringWhenFirstAndLastCharIsNotX() {
        WithoutX withoutX = new WithoutX();

        assertEquals("Hello", withoutX.withoutX("Hello"));
    }

    @Test
    public void returnsStringWithoutStartX() {
        WithoutX withoutX = new WithoutX();

        assertEquals("Hello", withoutX.withoutX("xHello"));
    }

    @Test
    public void returnsStringWithoutEndX() {
        WithoutX withoutX = new WithoutX();

        assertEquals("Hello", withoutX.withoutX("Hellox"));
    }

    @Test
    public void returnsUnchangedStringWhenEmpty() {
        WithoutX withoutX = new WithoutX();

        assertEquals("", withoutX.withoutX(""));
    }
}