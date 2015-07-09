package string1;

import org.junit.Test;

import static org.junit.Assert.*;

public class WithoutEndTest {

    @Test
    public void returnsStringWithoutStartAndEndChars() {
        WithoutEnd withoutEnd = new WithoutEnd();

        assertEquals("reamline", withoutEnd.withoutEnd("dreamliner"));
    }

    @Test
    public void returnsEmptyStringWhenLengthIsTwo() {
        WithoutEnd withoutEnd = new WithoutEnd();

        assertEquals("", withoutEnd.withoutEnd("at"));
    }
}