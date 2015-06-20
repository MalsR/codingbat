package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class NotStringTest {

    @Test
    public void returnsStringWithPrefixIfNotIsIncluded() {
        NotString notString = new NotString();

        assertEquals("not sample message", notString.notString("sample message"));
    }

    @Test
    public void returnsStringWithPrefixIfNotIsIncludedButNotPrefixed() {
        NotString notString = new NotString();

        assertEquals("not message not", notString.notString("message not"));
    }

    @Test
    public void returnsUnchangedStringWhenNotIsIncludedInPrefix() {
        NotString notString = new NotString();

        assertEquals("not same String", notString.notString("not same String"));
    }
}