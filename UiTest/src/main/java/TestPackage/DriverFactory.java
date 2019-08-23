package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Это сильно упрощенный вариант реализации паттерна DriverFactory, поскольку задание тестовое
 * не имеет смысла делать гибкую систему с поддержкой различного вида браузеров.
 */
public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver initialDriver() {
//        TODO реализовать подгрузку драйвера из помника
        System.setProperty("webdriver.chrome.driver", "C:\\chrome wd\\chromedriver.exe");
        return driver = new ChromeDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeDriver() {
        driver.close();
    }
}
