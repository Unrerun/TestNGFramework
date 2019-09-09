import TestPackage.Storage;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

import TestPackage.TestData;

@Test
public class ApiTestSteps {

    @Step("Создание новой доски")
    public static void createNewBoard() {
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .baseUri(TestData.getBaseUrl())//вынести в хуки
                .port(443)
                .queryParam("key", TestData.getApiKey())
                .queryParam("token", TestData.getApiToken())
                .log().all()
                .queryParam("name", TestData.getTemplate())
                .when()
                .post("/boards");
        Assert.assertEquals(response.getStatusCode(), 200, "Поле StatusCode не равно 200!");
        Storage.put("id", response.path("id").toString());
    }

    @Step("Переименование доски")
    public static void renameBoard() {
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .baseUri(TestData.getBaseUrl())//вынести в хуки
                .queryParam("name", TestData.getRandomTemplate())
                .queryParam("key", TestData.getApiKey())
                .queryParam("token", TestData.getApiToken())
                .log().all()
                .when()
                .put("/boards/" + Storage.get("id"))
                .then().
                assertThat().statusCode(200)
                .log().all();

    }

    @Step("Переименование нового списка по умолчанию")
    public static void renameDefaultList() {
        String url = "/boards/" + Storage.get("id") + "/lists/open";
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .baseUri(TestData.getBaseUrl())//вынести в хуки
                .queryParam("key", TestData.getApiKey())
                .queryParam("token", TestData.getApiToken())
                .log().all()
                .when()
                .get(url);
        Storage.put("listId", response.path("id").toString().substring(1,25));


    }

}
