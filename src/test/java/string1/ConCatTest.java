package string1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConCatTest {

    @Test
    public void returnsConcatStringWhenDoubleCharDoesNotExists() {
        ConCat conCat = new ConCat();

        assertEquals("dogcat", conCat.conCat("dog", "cat"));
    }

    @Test
    public void returnsConcatStringWithOneDoubleCharRemoved() {
        ConCat conCat = new ConCat();

        assertEquals("dogat", conCat.conCat("dog", "gat"));
    }

    @Test
    public void returnsConcatStringWhenSecondStringIsEmpty() {
        ConCat conCat = new ConCat();

        assertEquals("dog", conCat.conCat("dog", ""));
    }

    @Test
    public void returnsConcatStringWhenFirstStringIsEmpty() {
        ConCat conCat = new ConCat();

        assertEquals("dog", conCat.conCat("", "dog"));
    }
}