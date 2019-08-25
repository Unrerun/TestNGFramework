import PageObjects.StartPage;
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
    public void authorisationTest() {
        new StartPage().openStartPage(url, "Trello");
        new StartPage().pressLoginButton();
    }

}
