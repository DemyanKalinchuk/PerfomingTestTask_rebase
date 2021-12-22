package tests.registration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import tests.basket.BasketPages;

import static Constants.Constant.Urls.REALT_HOME_PAGE;

public class RegisterPages extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger(RegisterPages.class);

    @Test
    public void checkRegisterPage (){

        basePage.show(REALT_HOME_PAGE);

        registerPage
                .clickreg();
        logger.info("Click on the authorization ");

        enterEmail
                .clickEmail();
        logger.info("input mail/number ");

        enterPass
                .clickPass();
        logger.info("input pass ");

        enterReg
                .clickAutor();
        logger.info("click 'to come in' button ");

        enterRegBtn
                .clickregbtn();
        logger.info("click on registration button ");

        inputName
                .clickname();
        logger.info("input firstname ");

        inputLastName
                .clicklastname();
        logger.info("input lastname ");

        inputPhone
                .clickphone();
        logger.info("input phone number ");

        inputMail
                .clickmail();
        logger.info("input mail ");

        inputPass
                .clickpass();
        logger.info("input pass ");

        enterRegBtn2
                .clickregbtn2();
        logger.info("click on registration button ");

    }




}

