import TestPackage.DriverFactory;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Hooks {

    @BeforeTest
    public void before() {
        DriverFactory.initialDriver();
    }

    @AfterTest
    public void after() {
        DriverFactory.closeDriver();
    }
}
