package tests.seach_function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import tests.basket.BasketPages;

import static Constants.Constant.Urls.REALT_HOME_PAGE;

public class SearchSomeProductTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger(SearchSomeProductTest.class);
    @Test
    public void checkRedirectToListing (){

        basePage.show(REALT_HOME_PAGE);
        homePage
                .clickSearch();
        logger.info("search function is work ");

        realtListingPage.checkCountCards();
    }



}
