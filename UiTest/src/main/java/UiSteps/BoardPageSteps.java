package UiSteps;

import TestPackage.TestData;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BoardPageSteps {


    @Step("Создание новой доски")
    public static void createNewBoard() {
        $(By.xpath("//*[@data-test-id='header-boards-menu-button']")).click();
        $(By.xpath("//*[@data-test-id='header-boards-menu-create-board']")).click();
        $(By.xpath("//*[@data-test-id='header-create-board-title-input']")).val(TestData.getRandomTemplate());
        $(By.xpath("//*[@data-test-id='header-create-board-submit-button']")).click();

    }

    @Step("Перименование доски")
    public static void renameBoard() {
        $(By.xpath("//*[@class='js-board-editing-target board-header-btn-text']")).click();
        $(By.xpath("//input[@class='board-name-input js-board-name-input']")).sendKeys(TestData.getTemplate());
        $(By.xpath("//input[@class='board-name-input js-board-name-input']")).pressEnter();
    }

    @Step("Создание нового листа")
    public static void createNewList() {
        $(By.xpath("//*[@class='list-name-input']")).val(TestData.getRandomTemplate());
        $(By.xpath("//*[@class='primary mod-list-add-button js-save-edit']")).click();
    }

    @Step("Добавление новой карточки")
    public static void createNewCard() {
        $(By.xpath("//*[@class='js-add-a-card']")).click();
        $(By.xpath("//*[@class='list-card-composer-textarea js-card-title']")).val(TestData.getRandomTemplate());
        $(By.xpath("//*[@class='primary confirm mod-compact js-add-card']")).click();
    }

    @Step("Переименование нового списка по умолчанию")
    public static void renameDefaultList() {
        $(By.xpath("//*[@class='list-name-input']")).val(TestData.getRandomTemplate());
        $(By.xpath("//*[@class='primary mod-list-add-button js-save-edit']")).click();
        $(By.xpath("//*[@class='list-header-target js-editing-target']")).click();
        $(By.xpath("//*[@class='list-header-name mod-list-name js-list-name-input is-editing']")).sendKeys(TestData.getTemplate());
        $(By.xpath("//*[@class='list-header-name mod-list-name js-list-name-input is-editing']")).sendKeys(Keys.ENTER);
    }

    @Step("Переименование карточки")
    public static void renameCard() {
        $(By.xpath("//*[@class='list-card-title js-card-name']")).hover();
        $(By.xpath("//*[@class='icon-sm icon-edit list-card-operation dark-hover js-open-quick-card-editor js-card-menu']")).click();
        $(By.xpath("//*[@class='list-card-edit-title js-edit-card-title']")).sendKeys(TestData.getRandomTemplate());
        $(By.xpath("//*[@class='primary wide js-save-edits']")).click();
    }

    @Step("Добавление чек-листа в карточке")
    public static void addCheckList() {
        $(By.xpath("//*[@class='button-link js-add-checklist-menu']")).click();
        $(By.xpath("//*[@class='primary wide confirm js-add-checklist']")).click();
    }

    @Step("Добавление двух элементов в чек лист")
    public static void addSomeElementsToList() {
        $(By.xpath("//*[@class='edit field checklist-new-item-text js-new-checklist-item-input']")).val(TestData.getRandomTemplate());
        $(By.xpath("//*[@class='primary confirm mod-submit-edit js-add-checklist-item']")).click();
        $(By.xpath("//*[@class='edit field checklist-new-item-text js-new-checklist-item-input']")).val(TestData.getRandomTemplate());
        $(By.xpath("//*[@class='primary confirm mod-submit-edit js-add-checklist-item']")).click();
    }

    @Step("Переименование списка")
    public static void renameList() {
        $$(By.xpath("//*[@class='list-header-target js-editing-target']")).get(1).click();
        $(By.xpath("//*[@class='list-header-name mod-list-name js-list-name-input is-editing']")).sendKeys(TestData.getRandomTemplate());
        $(By.xpath("//*[@class='list-header-name mod-list-name js-list-name-input is-editing']")).sendKeys(Keys.ENTER);
    }

    @Step("Подтверждение одного из элементов чек-листа")
    public static void acceptingCheckListElement() {
        $(By.xpath("//*[@class='checklist-item-checkbox enabled js-toggle-checklist-item']")).doubleClick();
    }

    @Step("Перенос карточки в другой список")
    public static void replaceCardToAnotherList() {
        $(By.xpath("//*[@class='button-link js-move-card']")).click();
        $(By.xpath("//*[@class='js-select-list']")).selectOption(1);
        $(By.xpath("//*[@class='primary wide js-submit']")).click();
    }

    @Step("Удаление карточки")
    public static void removeCard() {
        $(By.xpath("//*[@class='button-link js-archive-card']")).click();
        $(By.xpath("//*[@class='button-link js-delete-card negate']")).click();
        $(By.xpath("//*[@class='js-confirm full negate']")).click();

    }

    @Step("Выход из системы")
    public static void logoff() {
        $(By.xpath("//*[@data-test-id='header-member-menu-button']")).click();
        $(By.xpath("//*[@data-test-id='header-member-menu-logout']")).click();
    }

    @Step("Добавление описания карточки")
    public static void addCardDescription() {
        $(By.xpath("//*[@class='list-card-title js-card-name']")).click();
        $(By.xpath("//*[@class='field field-autosave js-description-draft description card-description']")).sendKeys(TestData.getRandomTemplate());
        $(By.xpath("//*[@class='primary confirm mod-submit-edit js-save-edit']")).click();


    }


}
