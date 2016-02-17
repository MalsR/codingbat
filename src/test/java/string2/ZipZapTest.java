package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZipZapTest {

    @Test
    public void returnsSameStringWhenZipAndZapDoesNotExist() {
        ZipZap zipZap = new ZipZap();

        assertEquals("HelloThere", zipZap.zipZap("HelloThere"));
    }

    @Test
    public void returnsUpdatedStringWhenZipExists() {
        ZipZap zipZap = new ZipZap();

        assertEquals("HellozpBye", zipZap.zipZap("HellozipBye"));
    }

    @Test
    public void returnsSameStringWhenStringContainsWordThatStartsWithZButDoesNotEndWithCharP() {
        ZipZap zipZap = new ZipZap();

        assertEquals("HelloTherezaz", zipZap.zipZap("HelloTherezaz"));
    }

    @Test
    public void returnsUpdatedStringWhenLengthIsThreeAndStartsAndEndsWithZP() {
        ZipZap zipZap = new ZipZap();

        assertEquals("zp", zipZap.zipZap("zip"));
    }

    @Test
    public void returnsSameStringWhenStringOnlyContainsCharacterZ() {
        ZipZap zipZap = new ZipZap();

        assertEquals("z", zipZap.zipZap("z"));
    }

    @Test
    public void returnsSameStringWhenStringIsEmpty() {
        ZipZap zipZap = new ZipZap();

        assertEquals("", zipZap.zipZap(""));
    }
}