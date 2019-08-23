import PageObjects.StartPage;
import TestPackage.DriverFactory;
import org.testng.annotations.Test;


public class UiTest {

    private String url = "https://trello.com/";

    @Test
    public void authorisationTest(){
        DriverFactory.initialDriver();
        System.out.println("Ожидание выполнено");
        DriverFactory.goToUrl(this.url);
        new StartPage().checkOpenedPage("Trello");
        DriverFactory.delay(5);
        new StartPage().pressLoginButton();
    }

}
