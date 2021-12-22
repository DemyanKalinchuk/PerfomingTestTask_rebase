package tests.basket;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import sun.applet.Main;
import tests.base.BaseTest;

import java.util.Dictionary;
import java.util.logging.Level;

import static Constants.Constant.Urls.REALT_HOME_PAGE;

public class BasketPages extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger(BasketPages.class);

    @Test
    public void checkBasketPage (){

        basePage.show(REALT_HOME_PAGE);

        enterBasket
                .clickbasket();
        logger.info("Click on the cart ");

        closeBasket
                .clickclosebasket();

        logger.info("Close cart ");

    }
}
