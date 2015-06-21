package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StartOzTest {

    @Test
    public void returnsOZIfFirstTwoCharsStartsWithOAndZ() {
        StartOz startOz = new StartOz();

        assertEquals("oz", startOz.startOz("ozymandias"));
    }

    @Test
    public void returnsOIfFirstCharStartsWithO() {
        StartOz startOz = new StartOz();

        assertEquals("o", startOz.startOz("op"));
    }

    @Test
    public void returnsZIfSecondCharStartsWithZ() {
        StartOz startOz = new StartOz();

        assertEquals("z", startOz.startOz("zz"));
    }

    @Test
    public void returnsEmptyWhenGivenStringIsEmpty() {
        StartOz startOz = new StartOz();

        assertEquals("", startOz.startOz(""));
    }

    @Test
    public void returnsEmptyWhenGivenStringDoesNotStartWithOZ() {
        StartOz startOz = new StartOz();

        assertEquals("", startOz.startOz("hello"));
    }

    @Test
    public void returnsOWhenGivenStringIsO() {
        StartOz startOz = new StartOz();

        assertEquals("o", startOz.startOz("o"));
    }

}