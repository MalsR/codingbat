package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SameStarCharTest {

    @Test
    public void returnsFalseWhenStringDoesNotContainAnyStars() {
        SameStarChar sameStarChar = new SameStarChar();

        assertFalse(sameStarChar.sameStarChar("HelloNoStars"));
    }

    @Test
    public void returnsFalseWhenStringHasStarAndCharsBeforeAndAfterItAreNotTheSame() {
        SameStarChar sameStarChar = new SameStarChar();

        assertFalse(sameStarChar.sameStarChar("hello*hasStar"));
    }

    @Test
    public void returnsFalseWhenStringStarsWithStar() {
        SameStarChar sameStarChar = new SameStarChar();

        assertFalse(sameStarChar.sameStarChar("*star"));
    }

    @Test
    public void returnsTrueWhenStringHasStarAndCharsBeforeAndAfterAreTheSame() {
        SameStarChar sameStarChar = new SameStarChar();

        assertTrue(sameStarChar.sameStarChar("hello*organ"));
    }

    @Test
    public void returnsTrueWhenStringHasMultipleStarsButOnlyOneStarHasSameCharBeforeAndAfter() {
        SameStarChar sameStarChar = new SameStarChar();

        assertTrue(sameStarChar.sameStarChar("hi*there*eagle"));
    }

    @Test
    public void returnsFalseWhenStringIsEmpty() {
        SameStarChar sameStarChar = new SameStarChar();

        assertFalse(sameStarChar.sameStarChar(""));
    }

    //TODO additional tests
}