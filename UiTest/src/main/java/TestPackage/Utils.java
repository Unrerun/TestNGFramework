package TestPackage;

import org.openqa.selenium.WebElement;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

/**
 * Небольшая библиотека кастомных методов, поскольку задание взято для обучения, специально не использовал
 * Selenoid и пр., с целью обучения себя в создании своих методов, поскольку не всегда дефолтные методы реализуют
 * необходимый функционал.
 */
public class Utils {

    public static void goToUrl(String url) {
        DriverFactory.getDriver().get(url);
    }

    public static void delay(int delayInSeconds) {
        DriverFactory.getDriver().manage().timeouts().implicitlyWait(delayInSeconds, TimeUnit.SECONDS);
    }

    public static void waitUnteilPresent(WebElement element){
        Timer timer = new Timer();
        element.isDisplayed()

        }
    }
}
