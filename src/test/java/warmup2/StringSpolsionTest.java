package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringSpolsionTest {

    @Test
    public void returnsUpdatedString() {
        StringSpolsion stringSpolsion = new StringSpolsion();

        assertEquals("aab", stringSpolsion.stringSplosion("ab"));
        assertEquals("CCoCodCode", stringSpolsion.stringSplosion("Code"));
        assertEquals("aababc", stringSpolsion.stringSplosion("abc"));
    }
}