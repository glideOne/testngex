import org.testng.annotations.Test;

/**
 * Created by ozakarias on 2/12/2018.
 */
public class ExTwelve {

    //12
    @Test(dataProvider = "Credentials", dataProviderClass = DataProviders.class)
    public void testElevenLoginFunctionality(String username, String password) {
        System.out.println("Username is: " + username);
        System.out.println("Password is: " + password);
    }

}
