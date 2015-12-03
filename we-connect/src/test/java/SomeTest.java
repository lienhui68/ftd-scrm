import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Locale;

/**
 * Created by David Li on 2015/12/2.
 */
public class SomeTest {
    @Test
    public void test() {
        String[] strs = new String[] {"world", "hello"};
        Arrays.sort(strs);
        String sorted = null;
        StringBuffer bf = new StringBuffer();
        for (String str : strs) {
            bf.append(str);
        }
        sorted = bf.toString();

        System.out.println(sorted);

//        String encrypted = ValidUtil.encryptWithSha1(sorted);
//
//        return encrypted;
    }
}
