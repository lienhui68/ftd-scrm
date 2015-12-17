package decorator.io;

import java.io.*;

/**
 * Created by David Li on 2015/12/16.
 */
public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream("ftd-scrm.iml")));
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
    }
}
