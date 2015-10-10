package logic1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShareDigitTest {

    @Test
    public void returnsTrueWhenFirstParamDigitAppearsInSecondParamDigit() {
        ShareDigit shareDigit = new ShareDigit();

        assertTrue(shareDigit.shareDigit(12, 92));
        assertTrue(shareDigit.shareDigit(39, 32));
    }
}