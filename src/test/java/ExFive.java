import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by zed on 2/11/2018.
 */
public class ExFive {

    /**
     * Is ex5 same as ex6?
     */

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @Test(suiteName = "suite")
    public void testOne() {
        System.out.println("Test One");
    }

    @Test(suiteName = "suite")
    public void testTwo() {
        System.out.println("Test Two");
    }

    @Test(suiteName = "suite")
    public void testThree() {
        System.out.println("Test Three");
    }

    @Test(suiteName = "suite")
    public void testFour() {
        System.out.println("Test Four");
    }

    @Test(suiteName = "suite")
    public void testFive() { System.out.println("Test Five"); }

}
