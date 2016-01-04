package ipSeeker;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by David Li on 2016/1/4.
 */
public class IPSeekerTest {
    private IPSeeker ipSeeker;
    private String ip;
    
    @BeforeMethod
    public void setUp() throws Exception {
        ipSeeker = new IPSeeker("qqwry.Dat","d:/my/file/qqwry");
        ip = "58.247.2.58";
    }

    @Test
    public void testGetIPEntriesDebug() throws Exception {
    }

    @Test
    public void testGetIPLocation() throws Exception {

    }

    @Test
    public void testGetIPEntries() throws Exception {

    }

    @Test
    public void testGetCountry() throws Exception {

    }

    @Test
    public void testGetCountry1() throws Exception {

    }

    @Test
    public void testGetArea() throws Exception {

    }

    @Test
    public void testGetArea1() throws Exception {

    }

    @Test
    public void test() {
        System.out.println(ipSeeker.getIPLocation(ip).getCountry()+":"+ipSeeker.getIPLocation(ip).getArea());
    }
}