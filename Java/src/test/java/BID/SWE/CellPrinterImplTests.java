package BID.SWE;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CellPrinterImplTests {
    @Test
    public void shouldReturnPrintState() {
        CellPrinterImpl impl = new CellPrinterImpl();
        String dateString = "12.12.2019";
        Date date = null;
        try {
            date = new SimpleDateFormat("dd.MM.yyyy").parse(dateString);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        String str = impl.PrintState(true, date, "rot");

        boolean condition = str.equals("Cell rot born on 12.12.2019 is alive");
        assertTrue("it should return a correct message", condition);
    }

    @Test
    public void shouldReturnPrintPosition() {
        CellPrinterImpl impl = new CellPrinterImpl();
        String str = impl.PrintPostion(1, 2);

        boolean condition = str.equals("Cell is on Position X:1 Y:2");
        assertTrue("it should return a correct message", condition);
    }
}
