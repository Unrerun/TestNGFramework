package TestPackage;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import io.qameta.allure.Step;
import org.testng.Assert;

import static com.jayway.restassured.RestAssured.given;


public class ApiTestSteps {

    @Step("Создание новой доски")
    public static void createNewBoard() {
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .port(443)
                .queryParam("key", TestData.getApiKey())
                .queryParam("token", TestData.getApiToken())
                .log().all()
                .queryParam("name", TestData.getRandomTemplate())
                .when()
                .post("/boards");
        Assert.assertEquals(response.getStatusCode(), 200, "Поле StatusCode не равно 200!");
        Storage.put("BoardId", response.path("id").toString());
    }

    @Step("Переименование доски")
    public static void renameBoard() {
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("name", TestData.getTemplate())
                .queryParam("key", TestData.getApiKey())
                .queryParam("token", TestData.getApiToken())
                .log().all()
                .when()
                .put("/boards/" + Storage.get("BoardId"))
                .then().
                assertThat().statusCode(200)
                .log().all();
    }

    @Step("Переименование нового списка по умолчанию")
    public static void renameDefaultList() {
        //Получение ID листа
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("key", TestData.getApiKey())
                .queryParam("token", TestData.getApiToken())
                .log().all()
                .when()
                .get(TestData.getUrlForList());
        Storage.put("defaultListId", Utils.fieldFixer(response.path("id").toString()).get(0));

        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("name", TestData.getTemplate())
                .queryParam("key", TestData.getApiKey())
                .queryParam("token", TestData.getApiToken())
                .log().all()
                .when()
                .put("/lists/" + Storage.get("defaultListId"))
                .then().
                assertThat().statusCode(200)
                .log().all();
    }

    @Step("Создание нового списка")
    public static void createNewList() {
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("name", TestData.getTemplate())
                .queryParam("idBoard", Storage.get("BoardId"))
                .queryParam("key", TestData.getApiKey())
                .queryParam("token", TestData.getApiToken())
                .log().all()
                .when()
                .post("/lists");
        Assert.assertEquals(response.getStatusCode(), 200, "Поле StatusCode не равно 200!");
        Storage.put("createdListID", response.path("id").toString());
    }

    @Step("Переименование списка")
    public static void renameList() {
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("value", TestData.getRandomTemplate())
                .queryParam("key", TestData.getApiKey())
                .queryParam("token", TestData.getApiToken())
                .log().all()
                .when()
                .put("/lists/" + Storage.get("createdListID") + "/name")
                .then().
                assertThat().statusCode(200)
                .log().all();
    }

    @Step("Добавление новой карточки")
    public static void createNewCard() {
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("idList", Storage.get("createdListID"))
                .queryParam("key", TestData.getApiKey())
                .queryParam("token", TestData.getApiToken())
                .log().all()
                .when()
                .post("/cards");
        Assert.assertEquals(response.getStatusCode(), 200, "Поле StatusCode не равно 200!");
        Storage.put("createdCardID", response.path("id").toString());
    }

    @Step("Переименование карточки")
    public static void renameCard() {
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("name", TestData.getRandomTemplate())
                .queryParam("key", TestData.getApiKey())
                .queryParam("token", TestData.getApiToken())
                .log().all()
                .when()
                .put("/cards/" + Storage.get("createdCardID"))
                .then().
                assertThat().statusCode(200)
                .log().all();
    }

    @Step("Добавление описания карточки")
    public static void addCardDescription() {
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("desc", TestData.getRandomTemplate())
                .queryParam("key", TestData.getApiKey())
                .queryParam("token", TestData.getApiToken())
                .log().all()
                .when()
                .put("/cards/" + Storage.get("createdCardID"))
                .then().
                assertThat().statusCode(200)
                .log().all();
    }

    @Step("Добавление чек-листа в карточке")
    public static void addCheckList() {
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("name", TestData.getRandomTemplate())
                .queryParam("key", TestData.getApiKey())
                .queryParam("token", TestData.getApiToken())
                .log().all()
                .when()
                .post("/cards/" + Storage.get("createdCardID") + "/checklists");
        Assert.assertEquals(response.getStatusCode(), 200, "Поле StatusCode не равно 200!");
        Storage.put("checkListID", response.path("id").toString());
    }

    @Step("Добавление двух элементов в чек лист")
    public static void addSomeElementsToList() {
        for (int i = 0; i < 2; i++) {
            Response response = given()
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .queryParam("name", TestData.getRandomTemplate())
                    .queryParam("key", TestData.getApiKey())
                    .queryParam("token", TestData.getApiToken())
                    .log().all()
                    .when()
                    .post("/checklists/" + Storage.get("checkListID") + "/checkItems");
            Assert.assertEquals(response.getStatusCode(), 200, "Поле StatusCode не равно 200!");
            Storage.put("checkListItemID " + i, response.path("id").toString());
            Storage.put("checkListItemName " + i, response.path("name").toString());

        }
    }

    @Step("Подтверждение одного из элементов чек-листа")
    public static void acceptingCheckListElement() {
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("state", "complete")
                .queryParam("key", TestData.getApiKey())
                .queryParam("token", TestData.getApiToken())
                .log().all()
                .when()
                .put("/cards/" + Storage.get("createdCardID") + "/checkItem/" + Storage.get("checkListItemID 1"));
        Assert.assertEquals(response.getStatusCode(), 200, "Поле StatusCode не равно 200!");
    }

    @Step("Перенос карточки в другой список")
    public static void replaceCardToAnotherList() {

    }

    @Step("Удаление карточки")
    public static void removeCard() {

    }

}

