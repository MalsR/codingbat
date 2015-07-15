package string1;

import org.junit.Test;

import static org.junit.Assert.*;

public class LastTwoTest {

    @Test
    public void returnsSwappedCharsWhenStringLenghtIsTwo() {
        LastTwo lastTwo = new LastTwo();

        assertEquals("ba", lastTwo.lastTwo("ab"));
    }
}