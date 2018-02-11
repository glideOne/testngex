import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by zed on 2/11/2018.
 */
public class ExEleven {

    //Q: Can groups be cross-class?
    @Test(groups = "sanity")
    public void exElevenPointOne() {
        System.out.println("Test 10.1 -> part of Sanity group");
    }

    @Test(groups = "sanity")
    public void exElevenPointTwo() {
        System.out.println("Test 10.2 -> part of Sanity group");
        Assert.assertEquals(3, 3);
    }

    @Test(groups = "smoke")
    public void exElevenPointThree() {
        System.out.println("Test 10.3 -> part of Smoke group");
    }

    @Test(groups = "nonsmoke")
    public void exElevenPointFour() {
        System.out.println("Test 10.4 -> part of NonSmoke group");
        Assert.assertEquals(3, 3);
    }

    @Test(dependsOnGroups = {"sanity", "smoke"})
    public void exElevenPointFive() {
        System.out.println("Test 10.5 -> This depends on Sanity and Smoke groups");
    }

}
