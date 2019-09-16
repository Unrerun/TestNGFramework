import TestPackage.TestData;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.EncoderConfig;
import org.testng.annotations.BeforeTest;

public class Hooks {

    @BeforeTest
    public void beforeTest() {
        RestAssured.baseURI = TestData.getBaseUrl();
        RestAssured.config().encoderConfig(EncoderConfig.encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false));
    }
}
