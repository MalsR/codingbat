package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SandwichBreadTest {

    @Test
    public void returnsStringInMiddleIfStringExistsBreadPrefixAndSuffix() {
        SandwichBread sandwichBread = new SandwichBread();

        assertEquals("jam", sandwichBread.getSandwich("breadjambread"));
    }

    @Test
    public void returnsStringInMiddleIfStringBreadSurroundsAnyWordInString() {
        SandwichBread sandwichBread = new SandwichBread();

        assertEquals("jam", sandwichBread.getSandwich("xxbreadjambreadyy"));
    }

    @Test
    public void returnsEmptyStringIfStringBreadDoesNotSurroundAnyOtherInString() {
        SandwichBread sandwichBread = new SandwichBread();

        assertEquals("", sandwichBread.getSandwich("breadhello"));
    }

    @Test
    public void returnsStringInMiddleIfMoreThanTwoInstancesOfBreadSurroundsAnyWordInString() {
        SandwichBread sandwichBread = new SandwichBread();

        assertEquals("breadbutter", sandwichBread.getSandwich("xxbreadbreadbutterbreadxx"));
    }

    @Test
    public void returnsEmptyStringIfWordBreadDoesNotExist() {
        SandwichBread sandwichBread = new SandwichBread();

        assertEquals("", sandwichBread.getSandwich("breedhello"));
    }

    @Test
    public void returnsEmptyStringIfStringHasMultipleInstancesOfBreadOnly() {
        SandwichBread sandwichBread = new SandwichBread();

        assertEquals("", sandwichBread.getSandwich("breadbread"));
    }
}