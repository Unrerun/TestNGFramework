package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    static WebDriver driver;

    public static WebDriver initialDriver() {
        System.setProperty("webdriver.chrome.driver","C:\\chrome wd\\chromedriver.exe");
         return driver =  new ChromeDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void goToUrl(String url){
         driver.get(url);
    }
    public static void delay(int delayInSeconds){
        driver.manage().timeouts().implicitlyWait(delayInSeconds, TimeUnit.SECONDS);
    }
}
