import com.eh.model.Account;
import com.eh.util.ValidUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Created by David Li on 2015/12/2.
 */
public class SomeTest {
    @Test
    public void test() {
        String str = "888888";
        String encrypted = ValidUtil.encryptWithSha1(str);
        System.out.println(encrypted);
        java.util.List<Account> accounts = new ArrayList<Account>();

    }
}
