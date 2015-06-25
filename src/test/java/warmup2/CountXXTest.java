package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountXXTest {

    @Test
    public void returnsOneWhenStringHasTwoXX() {
        CountXX countXX = new CountXX();

        assertEquals(1, countXX.countXX("Axbxx"));
    }

    @Test
    public void returnsTwoWhenStringHasThreeXXX() {
        CountXX countXX = new CountXX();

        assertEquals(2, countXX.countXX("Hexxxlox"));
    }

    @Test
    public void returnsOneWhenStartStringHasTwoXX() {
        CountXX countXX = new CountXX();

        assertEquals(1, countXX.countXX("xxabc"));
    }

    @Test
    public void returnsZeroWhenStringDoesNotHaveXXPairs() {
        CountXX countXX = new CountXX();

        assertEquals(0, countXX.countXX("hxellox"));
    }

    @Test
    public void returnsThreeWhenStringContainsMultipleXX() {
        CountXX countXX = new CountXX();

        assertEquals(3, countXX.countXX("xxbatxxxex"));
    }

}