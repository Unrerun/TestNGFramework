import TestPackage.Utils.Specification;
import com.jayway.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class Hooks {

    @BeforeTest
    static void config() {
        RestAssured.requestSpecification = Specification.restAssuredRequestConfigs();
        RestAssured.responseSpecification = Specification.restAssuredResponseConfigs();
    }
}
