package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class DelDelTest {

    @Test
    public void returnsStringWithoutDelIfStringDelStartsOnFirstIndex() {
        DelDel delDel = new DelDel();

        assertEquals("aHello", delDel.delDel("adelHello"));
    }

    @Test
    public void returnsUnchangedStringIfStringDelDoesNotStartOnFirstIndex() {
        DelDel delDel = new DelDel();

        assertEquals("hedelllo", delDel.delDel("hedelllo"));
    }

    @Test
    public void returnsUnchangedStringWhenStringIsEmpty() {
        DelDel delDel = new DelDel();

        assertEquals("", delDel.delDel(""));
    }

    @Test
    public void returnsUnchangedStringWhenStringIsOnlySingleChar() {
        DelDel delDel = new DelDel();

        assertEquals("a", delDel.delDel("a"));
    }

}