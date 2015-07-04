package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class AltPairsTest {

    @Test
    public void returnsSameStringWhenStringLengthIsOne() {
        AltPairs altPairs = new AltPairs();

        assertEquals("M", altPairs.altPairs("M"));
    }

    @Test
    public void returnsStringMadeUpOfZeroAndOneCharAtIndexesWhenGivenStringLengthIsTwo() {
        AltPairs altPairs = new AltPairs();

        assertEquals("ba", altPairs.altPairs("ba"));
    }

    @Test
    public void returnsStringMadeUpOfZeroOneFourAndFiveCharAtWhenGivenStringLengthIsSix() {
        AltPairs altPairs = new AltPairs();

        assertEquals("kien", altPairs.altPairs("kitten"));
    }

    @Test
    public void returnsStringMadeUpOfAllConfiguredIndexesWhenGivenStringLengthIsMoreThanNine() {
        AltPairs altPairs = new AltPairs();

        assertEquals("Congrr", altPairs.altPairs("CodingHorror"));
        assertEquals("Chole", altPairs.altPairs("Chocolate"));
    }
}