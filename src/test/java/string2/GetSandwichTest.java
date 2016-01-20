package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetSandwichTest {

    @Test
    public void returnsStringInMiddleIfStringHasBreadPrefixAndSuffix() {
        GetSandwich getSandwich = new GetSandwich();

        assertEquals("jam", getSandwich.getSandwich("breadjambread"));
    }
}