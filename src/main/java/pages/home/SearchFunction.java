package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import javax.swing.*;

public class SearchFunction extends BasePage {

    public SearchFunction(WebDriver driver) {
        super(driver);
    }

    private final By clickserch = (By.xpath("//input[@name='search']"));

    public SearchFunction clickSearch(){
        driver.findElement(clickserch).sendKeys("Ноутбуки", Keys.ENTER);
        return this;

    }


}
