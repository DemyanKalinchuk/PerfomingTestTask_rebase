package tests.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import pages.base.BasePage;
import pages.home.LoginPageGmail;
import java.util.concurrent.TimeUnit;


public class BaseTest {
    public static WebDriver createDriver(){
        WebDriver driver = null;

            System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    protected WebDriver driver = BaseTest.createDriver();
    protected BasePage basePage = new BasePage(driver);

    //Group of login page
    protected LoginPageGmail loginPageGmail = new LoginPageGmail(driver);
    protected LoginPageGmail enterEmail = new LoginPageGmail(driver);
    protected LoginPageGmail enterEmail1 = new LoginPageGmail(driver);
    protected LoginPageGmail enterPass = new LoginPageGmail(driver);
    protected LoginPageGmail enterPass1 = new LoginPageGmail(driver);


    @AfterSuite (alwaysRun = true)
    public void close(){

        driver.quit();
    }
}


