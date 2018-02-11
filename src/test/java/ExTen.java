import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by zed on 2/11/2018.
 */
public class ExTen {

    @Test
    public void exTenPointOne() {
        System.out.println("Test 10.1");
        Assert.assertEquals(3+5, 8);
    }

    @Test(dependsOnMethods = "exTenPointOne")
    public void exTenPointTwo() {
        System.out.println("Test 10.2 -> It is certain that 10.1 passed.");

    }

}
