import TestPackage.Storage;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.given;

import TestPackage.TestData;

@Test
public class ApiTestSteps {

    public static void createNewBoard() {
       Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .baseUri(TestData.getBaseUrl())
                .port(443)
                .queryParam("key", TestData.getApiKey())
                .queryParam("token", TestData.getApiToken())
                .log().all()
                .queryParam("name", TestData.getTemplate())
        .when()
                .post("/boards");

        Storage.put("id",response.path("id").toString());
    }

    public static void renameBoard(){
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .baseUri(TestData.getBaseUrl())
                .pathParam("id",Storage.get("id"))
                .port(443)
                .queryParam("name", TestData.getRandomTemplate())
                .log().all()
                .queryParam("name", TestData.getTemplate())
                .when()
                .post("/")
                .then().
                assertThat().statusCode(200)
                .log().all();
    }

}
