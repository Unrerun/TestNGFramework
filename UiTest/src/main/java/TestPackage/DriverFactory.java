package TestPackage;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Это сильно упрощенный вариант реализации паттерна DriverFactory
 */
public class DriverFactory {

    private static WebDriver driver;

    public static void initialDriver(String browser) {
        switch (browser) {
            case "CHROME":
                WebDriverManager.chromedriver().version("76.0.3809.126").setup();
                driver = new ChromeDriver();
                break;
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "IE":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }
        WebDriverRunner.setWebDriver(driver);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeDriver() {
        driver.close();
    }
}
