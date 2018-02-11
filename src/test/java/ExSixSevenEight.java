import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

/**
 * Created by zed on 2/11/2018.
 */
public class ExSixSevenEight {

    @Test(timeOut = 500)
    public void testSix() throws InterruptedException {
        Thread.sleep(300);
        System.out.println("Test Six");
    }

    @Test(timeOut = 500, expectedExceptions = ThreadTimeoutException.class)
    public void testSeven() throws InterruptedException {
        Thread.sleep(600);
        System.out.println("Test Seven");
    }

    @Test(enabled = false)
    public void testEight() {
        System.out.println("Test Eight. This one should be disabled.");
    }

}
