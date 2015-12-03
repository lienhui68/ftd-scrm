import com.eh.util.ValidUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by David Li on 2015/12/2.
 */
public class SomeTest {
    @Test
    public void test() {
        String str = "HelloWorld!";
        String encrypted = ValidUtil.encryptWithSha1(str);
        String password = "d735871a64133ee062400659cf91b8234d1c1930";
        Assert.assertEquals(encrypted, password);
    }
}
