import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Sabab on 9/14/2020.
 */
public class LogIn {
    private FirefoxDriver firefoxDriver;
    public LogIn(FirefoxDriver firefoxDriver) {
        this.firefoxDriver = firefoxDriver;
    }

    public void checkPageTitle() {
        String expectedTitle = "Log in";
        String actualTitle = "";

        actualTitle = firefoxDriver.getTitle();
        System.out.println("actualTitle : " + actualTitle);

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public void loginAndCheckTitle() {
        String username = "qa_operator";
        String password = "Konasl@123";

        firefoxDriver.findElementById("username").sendKeys(username);
        firefoxDriver.findElementById("password").sendKeys(password);

        firefoxDriver.findElementById("login_btn").click();

        String expectedTitle = "LAOTOTO";
        String actualTitle = "";

        actualTitle = firefoxDriver.getTitle();
        System.out.println("actualTitle : " + actualTitle);

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
