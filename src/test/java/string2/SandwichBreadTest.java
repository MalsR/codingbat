package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SandwichBreadTest {

    @Test
    public void returnsWordInMiddleIfStringHasBreadPrefixAndSuffix() {
        SandwichBread sandwichBread = new SandwichBread();

        assertEquals("jam", sandwichBread.getSandwich("breadjambread"));
    }

    @Test
    public void returnsWordInMiddleIfWordBreadSurroundsAnyWordInString() {
        SandwichBread sandwichBread = new SandwichBread();

        assertEquals("jam", sandwichBread.getSandwich("xxbreadjambreadyy"));
    }

    @Test
    public void returnsEmptyStringIfWordBreadDoesNotSurroundAnyOtherWordInString() {
        SandwichBread sandwichBread = new SandwichBread();

        assertEquals("", sandwichBread.getSandwich("breadhello"));
    }

    @Test
    public void returnsEmptyStringIfWordBreadDoesNotExist() {
        SandwichBread sandwichBread = new SandwichBread();

        assertEquals("", sandwichBread.getSandwich("breedhello"));
    }

    //TODO
    //Test When string has only multiple instances of bread
    //Should return "" when string has e.g. three instances of bread
}