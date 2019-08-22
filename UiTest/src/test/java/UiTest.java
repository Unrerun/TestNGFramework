import okio.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UiTest {
    public WebDriver driver;
    public String url = "https://trello.com/";


    @Test
    public void testExample(){
    System.setProperty("webdriver.chrome.driver","C:\\chrome wd\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get(url);
    Assert.assertEquals(driver.getTitle(), "Trello");
    driver.close();
    }

}
