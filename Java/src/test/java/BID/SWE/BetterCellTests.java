package BID.SWE;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BetterCellTests {
    @Test
    public void shouldReturnDoubledSize() {
        BetterCell impl = new BetterCell();

        assertTrue("it should return 2", (impl.Grow() == 2));
        assertTrue("it should return 4", (impl.Grow() == 4));
    }

    @Test
    public void isAliveShouldReturnTrueOnEven() {
        BetterCell impl = new BetterCell();

        assertTrue("it should return true on even number", impl.IsAlive(2));
    }

    @Test
    public void isAliveShouldReturnFalseOnOdd() {
        BetterCell impl = new BetterCell();

        assertFalse("it should return false on odd number", impl.IsAlive(1));
    }
}
