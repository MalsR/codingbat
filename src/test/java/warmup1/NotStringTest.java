package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class NotStringTest {

    @Test
    public void returnsStringWithPrefixIfNotIsIncluded() {
        NotString notString = new NotString();

        assertEquals("not sample message", notString.notString("sample message"));
    }

}