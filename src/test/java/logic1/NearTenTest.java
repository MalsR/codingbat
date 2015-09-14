package logic1;

import org.junit.Test;
import warmup1.NearHundred;

import static org.junit.Assert.*;

public class NearTenTest {

    @Test
    public void returnsTrueWhenNumberIsWithinTwoLessThanMultipleOfTen() {
        NearTen nearTen = new NearTen();

        assertTrue(nearTen.nearTen(78));
    }

    @Test
    public void returnsTrueWheNumberIsWithinTwoMoreThanMultipleOfTen() {
        NearTen nearTen = new NearTen();

        assertTrue(nearTen.nearTen(12));
    }

    @Test
    public void returnsFalseWhenNumberIsTwoMoreThanMultipleOfTen() {
        NearTen nearTen = new NearTen();

        assertFalse(nearTen.nearTen(25));
    }
}