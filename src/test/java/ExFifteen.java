import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by ozakarias on 2/19/2018.
 */
@Listeners(SimpleTestListener.class)
public class ExFifteen {

//    @Listeners(SimpleTestListener.class)
    @Test(priority = 0)
    public void testFifteen() {
        System.out.println("Test fifteen.");
    }

    @Test(priority = 1)
    public void divideByZero() {
        System.out.println("This method divided by zero.");
        int n = 1/0;
    }

    @Test(dependsOnMethods = "divideByZero")
    public void skippedMethod() {
        System.out.println("This method is skipped.");
    }

}
