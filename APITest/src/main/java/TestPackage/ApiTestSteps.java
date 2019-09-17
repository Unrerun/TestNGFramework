package TestPackage;

import TestPackage.DataPackage.Endpoints;
import TestPackage.DataPackage.TestData;
import TestPackage.Utils.Specification;
import TestPackage.Utils.Storage;
import TestPackage.Utils.Utils;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import io.qameta.allure.Step;
import org.testng.Assert;

import static com.jayway.restassured.RestAssured.given;


public class ApiTestSteps {

    @Step("Создание новой доски")
    public static void createNewBoard() {
        Response response = given()
                .queryParam("name", TestData.getRandomTemplate())
                .post(Endpoints.boards());
        Storage.put("BoardId", response.path("id").toString());
    }

    @Step("Переименование доски")
    public static void renameBoard() {
        given().put(Endpoints.currentBoard());
    }

    @Step("Переименование нового списка по умолчанию")
    public static void renameDefaultList() {
        //Получение ID листа
        Response response = given()
                //почему-то тут ругается на чарсет, пришлось кормить параметры напрямую
                .queryParam("key", TestData.getApiKey())
                .queryParam("token", TestData.getApiToken())
                .get(Endpoints.defaultList());
        Storage.put("defaultListId", Utils.fieldFixer(response.path("id").toString()).get(0));

        given()
                .queryParam("name", TestData.getTemplate())
                .put(Endpoints.createdList());
    }

    @Step("Создание нового списка")
    public static void createNewList() {
        Response response = given()
                .queryParam("name", TestData.getTemplate())
                .queryParam("idBoard", Storage.get("BoardId"))
                .post(Endpoints.lists());
        Storage.put("createdListID", response.path("id").toString());
    }

    @Step("Переименование списка")
    public static void renameList() {
        given()
                .queryParam("value", TestData.getRandomTemplate())
                .put(Endpoints.nameOfCreatedList());
    }

    @Step("Добавление новой карточки")
    public static void createNewCard() {
        Response response = given()
                .queryParam("idList", Storage.get("createdListID"))
                .post(Endpoints.cards());
        Storage.put("createdCardID", response.path("id").toString());
    }

    @Step("Переименование карточки")
    public static void renameCard() {
        given()
                .queryParam("name", TestData.getRandomTemplate())
                .put(Endpoints.createdCard());
    }

    @Step("Добавление описания карточки")
    public static void addCardDescription() {
        given()
                .queryParam("desc", TestData.getRandomTemplate())
                .put(Endpoints.createdCard());
    }

    @Step("Добавление чек-листа в карточке")
    public static void addCheckList() {
        Response response = given()
                .queryParam("name", TestData.getRandomTemplate())
                .post(Endpoints.checklist());
        Storage.put("checkListID", response.path("id").toString());
    }

    @Step("Добавление двух элементов в чек лист")
    public static void addSomeElementsToList() {
        for (int i = 0; i < 2; i++) {
            Response response = given()
                    .queryParam("name", TestData.getRandomTemplate())
                    .post(Endpoints.checklistItems());
            Storage.put("checkListItemID " + i, response.path("id").toString());
        }
    }

    @Step("Подтверждение одного из элементов чек-листа")
    public static void acceptingCheckListElement() {
        Response response = given()
                .queryParam("state", "complete")
                .put(Endpoints.firstChecklistItemCondition());
    }

    @Step("Перенос карточки в другой список")
    public static void replaceCardToAnotherList() {
        given()
                .queryParam("idList", Storage.get("defaultListId"))
                .put(Endpoints.createdCard());

    }

    @Step("Удаление карточки")
    public static void removeCard() {
        given()
                .delete(Endpoints.createdCard());
    }

}

