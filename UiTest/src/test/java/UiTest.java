//import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UiTest {
    private WebDriver driver;
    private String url = "https://trello.com/";


    @Test
    public void testExample() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\chrome wd\\chromedriver.exe");
//        ChromeDriverManager.getInstance().setup();
    driver = new ChromeDriver();
    driver.get(this.url);
    Assert.assertEquals(driver.getTitle(), "Trello");
        driver.findElement(By.xpath("/html/body/header/nav/div[2]/a[1]")).click();
        wait(10);
        Assert.assertEquals(driver.getTitle(), "Вход в Trello", "Тайтл отличается");
//        driver.wait(10);
    driver.close();
    }

//    @Test
//    public void login(){
//
//        driver.close();
//    }

}
