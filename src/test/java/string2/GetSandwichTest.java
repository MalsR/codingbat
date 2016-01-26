package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetSandwichTest {

    @Test
    public void returnsStringInMiddleIfStringHasBreadPrefixAndSuffix() {
        GetSandwich getSandwich = new GetSandwich();

        assertEquals("jam", getSandwich.getSandwich("breadjambread"));
    }

    @Test
    public void returnsEmptyStringIfWordBreadDoesNotSurroundAnyOtherWordInString() {
        GetSandwich getSandwich = new GetSandwich();

        assertEquals("", getSandwich.getSandwich("breadhello"));
    }

    @Test
    public void returnsEmptyStringIfWordBreadDoesNotExist() {
        GetSandwich getSandwich = new GetSandwich();

        assertEquals("", getSandwich.getSandwich("breedhello"));
    }
}