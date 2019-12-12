package BID.SWE;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BetterMapTests {
    @Test
    public void shouldReturnMapName() {
        BetterMap impl = new BetterMap();

        assertTrue("it should return the name", impl.GetMapName().equals("BID-Map"));
    }

    @Test
    public void shouldReturnMapSize() {
        BetterMap impl = new BetterMap();

        assertTrue("it should return the map size", impl.GetMapSize(2.0f) == 4.0f);
    }

    @Test
    public void shouldReturnCellCount() {
        BetterMap impl = new BetterMap();

        assertTrue("it should return the cell count", impl.AddNewCells(4) == 4);
    }
}
