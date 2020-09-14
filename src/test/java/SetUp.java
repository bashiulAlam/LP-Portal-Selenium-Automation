import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

//import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Sabab on 9/14/2020.
 */


public class SetUp {
    private String baseUrl;

    public SetUp(String baseUrl) {
        this.baseUrl = baseUrl;
    }

//    @BeforeClass
    public FirefoxDriver setUp() {
        System.setProperty("webdriver.gecko.driver","D:\\Software\\Selenium\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        //comment the above 2 lines and uncomment below 2 lines to use Chrome
        //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("marionette", false);
        FirefoxOptions opt = new FirefoxOptions();
        opt.merge(dc);
        FirefoxDriver driver =  new FirefoxDriver(opt);

        driver.get(baseUrl);

        return driver;
    }

//    @AfterClass
    public void closeDriver(FirefoxDriver driver) {
        driver.close();
    }
}
