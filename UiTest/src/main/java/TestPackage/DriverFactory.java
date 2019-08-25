package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Это сильно упрощенный вариант реализации паттерна DriverFactory, поскольку задание тестовое,
 * не имеет смысла делать гибкую систему с поддержкой различного вида браузеров.
 */
public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver initialDriver() {
        WebDriverManager.chromedriver().version("76.0.3809.126").setup();
        return driver = new ChromeDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeDriver() {
        driver.close();
    }
}
