package logic1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CigarPartyTest {

    @Test
    public void canHavePartyOnWeekendWhenCigarsAreOver40() {
        CigarParty cigarParty = new CigarParty();

        assertTrue(cigarParty.cigarParty(50, true));
    }

    @Test
    public void noPartyOnWeekendWhenCigarsAreLessThan39() {
        CigarParty cigarParty = new CigarParty();

        assertFalse(cigarParty.cigarParty(39, true));
    }

    @Test
    public void canHavePartyOnNonWeekendWhenCigarNumberIsBetween40And60() {
        CigarParty cigarParty = new CigarParty();

        assertTrue(cigarParty.cigarParty(40, false));
    }
}