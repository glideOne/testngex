import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by ozakarias on 2/12/2018.
 */
public class ExThirteen {

    @Parameters({"username", "password"})
    @Test
    public void exThirteen(@Optional("administrator") String username, @Optional("Passw0rd") String password) {
        System.out.println("Username is: " + username);
        System.out.println("Password is: " + password);
    }

}
