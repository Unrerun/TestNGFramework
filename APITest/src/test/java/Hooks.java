import TestPackage.TestData;
import com.jayway.restassured.RestAssured;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class Hooks {

    @BeforeTest
    public void beforeTest() {
        RestAssured.baseURI= TestData.getBaseUrl();
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        System.out.println("method name:" + result.getMethod().getMethodName());
    }
}
