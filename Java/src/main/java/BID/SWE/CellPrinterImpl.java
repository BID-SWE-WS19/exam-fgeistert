package BID.SWE;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CellPrinterImpl implements CellPrinter {
    @Override
    public String PrintState(boolean b, Date date, String s) {
        StringBuilder builder = new StringBuilder();
        builder.append("Cell ").append(s).append(" born on ");

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String strDate = dateFormat.format(date);

        builder.append(strDate);
        builder.append(" is ");

        if(b) {
            builder.append("alive");
        } else {
            builder.append("not alive");
        }

        return builder.toString();
    }

    @Override
    public String PrintPostion(int i, int i1) {
        StringBuilder builder = new StringBuilder();

        builder.append("Cell is on Position X:").append(i).append(" Y:").append(i1);

        return builder.toString();
    }
}
