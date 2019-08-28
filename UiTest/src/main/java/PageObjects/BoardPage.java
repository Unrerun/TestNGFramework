package PageObjects;

import TestPackage.TestData;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BoardPage {

    @Step("Создание новой доски")
    public static void createNewBoard() {
        $(By.xpath("//*[@data-test-id='header-boards-menu-button']")).click();
        $(By.xpath("//*[@data-test-id='header-boards-menu-create-board']")).click();
        $(By.xpath("//*[@data-test-id='header-create-board-title-input']")).val(TestData.getRandomTemplate());
        $(By.xpath("//*[@data-test-id='header-create-board-submit-button']")).click();

    }

    @Step("Создание нового листа")
    public static void createNewList() {

        $(By.xpath("//*[@class='list-name-input']")).val(TestData.getRandomTemplate());
        $(By.xpath("//*[@class='primary mod-list-add-button js-save-edit']")).click();
    }

    @Step("Добавление новой карточки")
    public static void addNewCard() {
        $(By.xpath("//*[@class='js-add-a-card']")).click();
        $(By.xpath("//*[@class='list-card-composer-textarea js-card-title']")).val(TestData.getRandomTemplate());
        $(By.xpath("//*[@class='primary confirm mod-compact js-add-card']")).click();
//        $(By.xpath("//*[@class='list-header-target js-editing-target']")).
    }

    //    $(By.xpath("//*[@class='list-header-target js-editing-target']"))
//    $(By.xpath("//*[@class='field field-autosave js-description-draft description card-description']"))
//    $(By.xpath("//*[@class='primary confirm mod-submit-edit js-save-edit']"))
//    $(By.xpath("//*[@class='button-link js-add-checklist-menu']"))
//    $(By.xpath("//*[@class='primary wide confirm js-add-checklist']"))
//    $(By.xpath("//*[@class='edit field checklist-new-item-text js-new-checklist-item-input']"))
//    $(By.xpath("//*[@class='primary confirm mod-submit-edit js-add-checklist-item']"))
//    $(By.xpath("//*[@class='checklist-item-checkbox enabled js-toggle-checklist-item']"))
//    $(By.xpath("//*[@class='button-link js-move-card']"))
//    $(By.xpath("//*[@class='js-select-list']"))

}
