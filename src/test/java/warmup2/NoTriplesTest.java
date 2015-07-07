package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class NoTriplesTest {

    @Test
    public void returnsFalseIfArrayContainsAnyTriples() {
        NoTriples noTriples = new NoTriples();

        assertFalse(noTriples.noTriples(new int[]{1,2,2,2,3,4,2,2,2}));
    }

    @Test
    public void returnsTrueIfArrayDoesNotContainAnyTriples() {
        NoTriples noTriples = new NoTriples();

        assertTrue(noTriples.noTriples(new int[]{1,2,3,2,3,4,2,6,2}));
    }
}