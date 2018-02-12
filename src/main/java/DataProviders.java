import org.testng.annotations.DataProvider;

/**
 * Created by ozakarias on 2/12/2018.
 */
public class DataProviders {

    @DataProvider(name = "Credentials")
    public static Object[][] dataProviderString() {
        return new Object[][] {
                {"Username1", "Password1"},
                {"Username2", "Password2"}
        };
    }

}
