import TestPackage.DriverFactory;
import TestPackage.TestData;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
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

}
