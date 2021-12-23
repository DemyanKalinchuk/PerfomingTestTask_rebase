package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import sun.applet.Main;

import java.util.logging.Logger;

public class BasketPage extends BasePage {


    public BasketPage(WebDriver driver) {
        super(driver);
    }

    private final By enterBasket = (By.xpath("//rz-cart/button"));

    public BasketPage clickbasket() {
        driver.findElement(enterBasket).click();

        return this;
    }
    private final By closeBasket = (By.xpath("//button[@class='modal__close ng-star-inserted']"));

    public BasketPage clickclosebasket() {
        driver.findElement(closeBasket).click();
        return this;

    }

    private final By selectmenuitem = (By.xpath("//input[@name='search']"));

    public BasketPage clickmenuitem(){
        driver.findElement(selectmenuitem).sendKeys(" Ноутбуки ", Keys.ENTER);
        return this;
    }

    private final By selectproduct = (By.xpath("//input[@name='search']"));

    public BasketPage clickonproduct(){
        driver.findElement(selectproduct).sendKeys(" Ноутбуки ", Keys.ENTER);
        return this;
    }

    private final By selectnotebook = (By.xpath("//div[@data-goods-id='323906515']"));

    public BasketPage clickonnotebook() {
        driver.findElement(selectnotebook).click();

        return this;
    }

    private final By buynotebook = (By.xpath("//button[@class='buy-button button button_with_icon button_color_green button_size_large ng-star-inserted']"));

    public BasketPage clickonbuy() {
        driver.findElement(buynotebook).click();

        return this;
    }

    private final By deletebuy = (By.xpath("//button[@class='button button--white button--small context-menu__toggle']"));

    public BasketPage clickonbuydelete() {
        driver.findElement(deletebuy).click();

        return this;
    }

    private final By deletebuydone = (By.xpath("//button[@class='button button--medium button--with-icon button--link context-menu-actions__button']"));

    public BasketPage clickonbuydeletedone() {
        driver.findElement(deletebuydone).click();

        return this;
    }

}
