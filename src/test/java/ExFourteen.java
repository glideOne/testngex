import org.testng.annotations.Test;

/**
 * Created by ozakarias on 2/12/2018.
 */
public class ExFourteen {

    @Test(threadPoolSize = 5, invocationCount = 10)
    public void testOne() {
        System.out.println("Test 14");
    }

}
