package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SandwichBreadTest {

    @Test
    public void returnsStringInMiddleIfStringHasBreadPrefixAndSuffix() {
        SandwichBread sandwichBread = new SandwichBread();

        assertEquals("jam", sandwichBread.getSandwich("breadjambread"));
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
}