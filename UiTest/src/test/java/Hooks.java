import TestPackage.DriverFactory;
import TestPackage.TestData;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Hooks {
    @BeforeTest
    public void beforeTest() {
        DriverFactory.initialDriver("CHROME");
        Selenide.open(TestData.getUrl());
        Configuration.timeout = 10000;
    }

    @AfterTest
    public void afterTest() {
        DriverFactory.closeDriver();
    }

    @AfterMethod
    @Attachment(value = "Page screenshot", type = "image/png")
    protected byte[] saveAllureScreenshot() {
        return ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
    }

}
