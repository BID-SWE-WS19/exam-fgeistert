package BID.SWE;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BewegungTests {
    @Test
    public void shouldReturnPosition() {
        Springen impl1 = new Springen();
        Laufen impl2 = new Laufen();

        assertTrue("it should return x", impl1.Position().equals("x"));
        assertTrue("it should return y", impl2.Position().equals("y"));
    }

    @Test
    public void shouldReturnMove() {
        Springen impl1 = new Springen();
        Laufen impl2 = new Laufen();

        assertTrue("it should return x", impl1.Move(1).equals("x"));
        assertTrue("it should return y", impl2.Move(2).equals("y"));
    }
}
