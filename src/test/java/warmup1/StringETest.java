package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringETest {

    @Test
    public void returnsTrueIfStringHasOneE() {
        StringE stringE = new StringE();

        assertTrue(stringE.stringE("Hello"));
    }

    @Test
    public void returnsTrueIfStringHasTwoEs() {
        StringE stringE = new StringE();

        assertTrue(stringE.stringE("Helloe"));
    }

    @Test
    public void returnsTrueIfStringHasThreeEs() {
        StringE stringE = new StringE();

        assertTrue(stringE.stringE("Helloerte"));
    }

    @Test
    public void returnsFalseIfStringHasMoreThanThreeEs() {
        StringE stringE = new StringE();

        assertFalse(stringE.stringE("Beeee"));
    }
}