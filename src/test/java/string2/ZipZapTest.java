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
}