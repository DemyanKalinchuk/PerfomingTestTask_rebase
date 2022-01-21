package tests.login;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class LoginPageGmail_Test extends BaseTest {

    @Test
    public void checkLoginPage1 (){

        basePage.show("https://www.google.com/intl/ru/gmail/about/");
        loginPageGmail.clickreg();
        enterEmail.clickEmail();
        enterPass.clickPass();
    }
    @Test
    public void checkLoginPage2 (){

        basePage.show("https://www.google.com/intl/ru/gmail/about/");
        loginPageGmail.clickreg();
        enterEmail.clickEmail();
        enterPass1.clickPass1();
    }

    @Test
    public void checkLoginPage3 (){

        basePage.show("https://www.google.com/intl/ru/gmail/about/");
        loginPageGmail.clickreg();
        enterEmail1.clickEmail1();

    }

}

