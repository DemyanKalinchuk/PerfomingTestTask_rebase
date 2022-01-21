package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;

    }

    public void show(String url){

        driver.get(url);
    }
    public WebElement weitElementIsVisible(WebElement element){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return (WebElement) driver;
    }


}
