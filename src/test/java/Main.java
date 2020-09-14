import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Sabab on 9/14/2020.
 */

public class Main {
    public static void main(String[] args) {
        String baseUrl = "https://lp-portal.konapay.net:13000/portal/pp";
        SetUp setUp = new SetUp(baseUrl);

        FirefoxDriver driver = setUp.setUp();

        LogIn logIn = new LogIn(driver);

        logIn.checkPageTitle();

        setUp.closeDriver(driver);
    }
}
