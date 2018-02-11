import org.testng.annotations.*;

/**
 * Created by zed on 2/11/2018.
 */
public class ExTwoThreeFour {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @Test(groups = { "smoke", "regression" })
    public void testOne() {
        System.out.println("Test One");
    }

    @Test(groups = { "smoke", "regression" })
    public void testTwo() {
        System.out.println("Test Two");
    }

    @Test(groups = "regression")
    public void testThree() {
        System.out.println("Test Three");
    }

    @Test(groups = "regression")
    public void testFour() {
        System.out.println("Test Four");
    }

    @Test(groups = "smoke")
    public void testFive() { System.out.println("Test Five"); }

}
