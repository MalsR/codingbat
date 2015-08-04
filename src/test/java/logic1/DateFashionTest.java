package logic1;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateFashionTest {

    @Test
    public void canGetTableWhenEitherPersonHasEightOrMoreRating() {
        DateFashion dateFashion = new DateFashion();

        assertEquals(2, dateFashion.dateFashion(8, 5));
        assertEquals(2, dateFashion.dateFashion(3, 10));
    }

    @Test
    public void cannotGetTableWhenEitherPersonHasTwoOrLessRating() {
        DateFashion dateFashion = new DateFashion();

        assertEquals(0, dateFashion.dateFashion(2, 5));
        assertEquals(0, dateFashion.dateFashion(5, 2));
    }

    @Test
    public void cannotGetTableWhenOneHasTwoOrLowerRatingAndOtherHasEightOrMoreRating() {
        DateFashion dateFashion = new DateFashion();

        assertEquals(0, dateFashion.dateFashion(2, 8));
        assertEquals(0, dateFashion.dateFashion(1, 9));
    }

    @Test
    public void maybeGetTableWhenEitherPersonHasMidRating() {
        DateFashion dateFashion = new DateFashion();

        assertEquals(1, dateFashion.dateFashion(5, 5));
        assertEquals(1, dateFashion.dateFashion(3, 7));
    }
}