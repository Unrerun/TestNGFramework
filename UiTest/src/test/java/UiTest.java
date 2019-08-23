import PageObjects.StartPage;
import TestPackage.*;
import org.testng.annotations.Test;



public class UiTest {

    private String url = "https://trello.com/";

    @Test
    public void authorisationTest() {
        Utils.goToUrl(this.url);
        new StartPage().checkOpenedPage("Trello");
        new StartPage().pressLoginButton();
    }

}
