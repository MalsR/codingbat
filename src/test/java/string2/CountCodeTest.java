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
    public void returnsThreeWhenWordCodeAppearsThrice() {
        CountCode countCode = new CountCode();

        assertEquals("Expected the word code to be included thrice", 3, countCode.countCode("codeaaacodebbcodebc"));
    }

    @Test
    public void returnsTwoWhenWordCoXeAppearsTwiceWithXAsWildcardCharacter() {
        CountCode countCode = new CountCode();

        assertEquals("Expected to return two as the words coze & cope exists", 2, countCode.countCode("cozexxcope"));
    }

    @Test
    public void returnsZeroWhenNoWordWithCoXeAppearsWithXAsWildcardCharacter() {
        CountCode countCode = new CountCode();

        assertEquals("Expected to return zero", 0, countCode.countCode("hellchowarec"));
    }

    @Test
    public void returnsZeroWhenStringIsEmpty() {
        CountCode countCode = new CountCode();

        assertEquals("Expected to return zero", 0, countCode.countCode(""));
    }
}