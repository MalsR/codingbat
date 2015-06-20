package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class BackAroundTest {

    @Test
    public void returnsUpdatedStringWhenGivenStringIsMoreThanOneInLength() {
        BackAround backAround = new BackAround();

        assertEquals("tbatt", backAround.backAround("bat"));
    }

    @Test
    public void returnsUpdatedStringWhenGivenStringIsEqualToOneInLength() {
        BackAround backAround = new BackAround();

        assertEquals("zzz", backAround.backAround("z"));
    }

}