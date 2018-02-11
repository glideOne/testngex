import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

/**
 * Created by zed on 2/11/2018.
 */
public class ExNine {

    @Test(timeOut = 500, expectedExceptions = { CustomException.class, ThreadTimeoutException.class })
    public void exNine() {
        try {
            Thread.sleep(600);
        } catch (Exception e) {
        }
        System.out.println("Test Nine");

    }

}
