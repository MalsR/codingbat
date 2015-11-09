package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountCodeTest {

    @Test
    public void returnsOneWhenWordCodeAppearsOnce() {
        CountCode countCode = new CountCode();

        assertEquals("Expected the word code to be included once", 1, countCode.countCode("aaacodebbb"));
    }

    @Test
    public void returnsOneWhenWordCodeAppearsThrice() {
        CountCode countCode = new CountCode();

        assertEquals("Expected the word code to be included thrice", 3, countCode.countCode("codeaaacodebbcodebc"));
    }
}