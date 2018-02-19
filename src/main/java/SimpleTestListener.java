import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.log4testng.Logger;

import java.util.Arrays;
import java.util.logging.LogManager;

/**
 * Created by ozakarias on 2/19/2018.
 */
//15
public class SimpleTestListener implements ITestListener {
    private final static Logger LOGGER = Logger.getLogger(SimpleTestListener.class);

    @Override
    public void onTestStart(ITestResult result) {
        LOGGER.debug("...STARTING TEST METHOD...");
        LOGGER.debug("CLASS TESTED: " + result.getTestClass().getName());
        LOGGER.info("TEST METHOD: " + result.getInstance().hashCode() + result.getMethod().getMethodName() + Arrays.toString(result.getParameters()));
        LOGGER.debug("TEST STEPS");

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        LOGGER.debug("TEST RESULT: passed\n");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        LOGGER.debug("TEST RESULT: failed\n");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        LOGGER.debug("TEST RESULT: skipped\n");

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        LOGGER.debug("Tests have failed but within success percentage");
    }

    @Override
    public void onStart(ITestContext context) {
        LOGGER.debug("STARTED RUNNING SUITE TEST: " + context.getCurrentXmlTest().getName() + ".");
    }

    @Override
    public void onFinish(ITestContext context) {
        LOGGER.debug("_____________________");
        LOGGER.debug("FINISHED TEST: " + context.getCurrentXmlTest().getName() + ".\n");
    }
}
