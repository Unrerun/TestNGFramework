import PageObjects.*;
import TestPackage.*;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class UiTest {

    @BeforeTest
    public void before() {
        DriverFactory.initialDriver("CHROME");
    }

    @AfterTest
    public void after() {
        DriverFactory.closeDriver();
    }


    @Test
    public void openStartPageAndPressLoginButton() {
        StartPage.openStartPage(TestData.getUrl());
        StartPage.pressLoginButton();
        AuthPage.doLogin(TestData.getUserLogin(), TestData.getUserPassword());
    }

}
