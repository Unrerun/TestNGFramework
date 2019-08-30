package TestPackage;

        import com.codeborne.selenide.WebDriverRunner;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Это сильно упрощенный вариант реализации DriverFactory. Драйвер подгружается при каждом запуске теста,
 * нет необходимости конфигурировать переменные среды.
 */
public class DriverFactory {

    private static WebDriver driver;

    /**
     * Метод спользуется для выбора инициализируемого браузера
     *
     * @param browser
     */
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
                initialDriver();
                break;
        }
        WebDriverRunner.setWebDriver(driver);
    }

    /**
     * Метод спользуется для инициализации WebDriver chrome
     */
    public static void initialDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    /**
     * Метод возвращает инициализированный драйвер
     */
    public static WebDriver getDriver() {
        return driver;
    }

    /**
     * Метод закрывает инициализированный драйвер
     */
    public static void closeDriver() {
        if (driver != null) {
            driver.close();
        }
    }
}
