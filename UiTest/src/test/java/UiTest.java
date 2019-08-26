import PageObjects.*;
import TestPackage.*;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class UiTest {
    @BeforeTest
    public void before() {
        DriverFactory.initialDriver();
    }

    @AfterTest
    public void after() {
        DriverFactory.closeDriver();
    }

    private String url = "https://trello.com/";

    @Test
    public void openStartPageAndPressLoginButton() {
        new StartPage().openStartPage(url, "Trello");
        new StartPage().pressLoginButton();
        AuthPage.doLogin("TrelloTestUser", "TrelloTestUser1");
    }

//    @Test
//    public void authPage(){

}
