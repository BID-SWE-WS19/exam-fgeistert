package BID.SWE;

import java.io.*;

public class Exercise4Impl implements Exercise4 {
    @Override
    public ByteArrayInputStream Method1() {
        ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
        DataOutputStream output = new DataOutputStream(byteOutput);

        try{
            output.writeBytes("Frohe Weihnachten");
            output.writeInt(42);
            output.writeBoolean(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ByteArrayInputStream(byteOutput.toByteArray());
    }

    @Override
    public String Method2(Object o) {
        InputStream inputStream = (InputStream) o;

        byte[] buffer = new byte[0];
        try {
            inputStream.read(buffer, 0, 4);
            inputStream.read(buffer, 0, 4);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
