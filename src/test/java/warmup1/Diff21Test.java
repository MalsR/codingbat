package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Diff21Test {

    @Test
    public void returnsAbsoluteDiffWhenNumberIsLessThan21() {
        Diff21 diff21 = new Diff21();

        assertEquals(11, diff21.diff21(10));
    }

    @Test
    public void returnsZeroDiffWhenNumberIsEqualTo21() {
        Diff21 diff21 = new Diff21();

        assertEquals(0, diff21.diff21(21));
    }

    @Test
    public void returnsDoubleOfAbsoluteDiffWhenNumberIsGreaterThan21() {
        Diff21 diff21 = new Diff21();

        assertEquals(2, diff21.diff21(22));
    }

    @Test
    public void returnsAbsoluteDiffWhenNumberIsNegative() {
        Diff21 diff21 = new Diff21();

        assertEquals(23, diff21.diff21(-2));
    }
}