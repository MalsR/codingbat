package logic1;

import org.junit.Test;

import static org.junit.Assert.*;

public class WithoutDoublesTest {

    @Test
    public void returnsSumOfDiceWhenNoDoublesIsFalse() {
        WithoutDoubles withoutDoubles = new WithoutDoubles();

        assertEquals(9, withoutDoubles.withoutDoubles(4, 5, false));
    }

    @Test
    public void returnsSumOfDiceWhenNoDoubleIsTrue() {
        WithoutDoubles withoutDoubles = new WithoutDoubles();

        assertEquals(7, withoutDoubles.withoutDoubles(2, 5, true));
    }

    @Test
    public void returnsSumOfDiceWithDiceOneValueIncrementedWhenBothDice1And2AreEqualOnNoDoubleIsTrue() {
        //Crazy long name...
        WithoutDoubles withoutDoubles = new WithoutDoubles();

        assertEquals(7, withoutDoubles.withoutDoubles(3, 3, true));
    }

    @Test
    public void wrapsDiceOneValueToOneWhenNoDoubleIsTrueAndBothDiceValuesAreSix() {
        WithoutDoubles withoutDoubles = new WithoutDoubles();

        assertEquals(7, withoutDoubles.withoutDoubles(6, 6, true));
    }
}