package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class LoginPageGmail extends BasePage {

    public LoginPageGmail(WebDriver driver) {
        super(driver);
    }

    private final By clickreg = (By.xpath("//a[@data-action = 'sign in']"));

    public LoginPageGmail clickreg() {
        driver.findElement(clickreg).click();
        return this;
    }

    private final By enterEmail = (By.id("identifierId"));

    public LoginPageGmail clickEmail() {
        driver.findElement(enterEmail).sendKeys("nationdyoma24@gmail.com", Keys.ENTER);
        return this;
    }

    private final By enterPass = (By.name("password"));

    public LoginPageGmail clickPass() {
        driver.findElement(enterPass).sendKeys("QWASZXedc123456", Keys.ENTER);
        return this;
    }

    private final By enterPass1 = (By.name("password"));

    public LoginPageGmail clickPass1() {
        driver.findElement(enterPass1).sendKeys("QWASZXedc", Keys.ENTER);
        return this;
    }

    private final By enterEmail1 = (By.id("identifierId"));

    public LoginPageGmail clickEmail1() {
        driver.findElement(enterEmail1).sendKeys("Test1@gmail.com", Keys.ENTER);
        return this;
    }

}







