package logic1;

import org.junit.Test;

import static org.junit.Assert.*;

public class RedTicketTest {

    @Test
    public void returnsTenWhenAllNumbersAreEqualToTwo() {
        RedTicket redTicket = new RedTicket();

        assertEquals(10, redTicket.redTicket(2, 2, 2));
    }

    @Test
    public void returnsFiveWhenAllNumbersAreEqual() {
        RedTicket redTicket = new RedTicket();

        assertEquals(5, redTicket.redTicket(3, 3, 3));
    }

    @Test
    public void returnsOneWhenFirstParamIsNotEqualToSecondAndThirdParams() {
        RedTicket redTicket = new RedTicket();

        assertEquals(1, redTicket.redTicket(1, 2, 3));
    }

    @Test
    public void returnsZeroForAllOtherConditions() {
        RedTicket redTicket = new RedTicket();

        assertEquals(0, redTicket.redTicket(2, 3, 2));
    }
}