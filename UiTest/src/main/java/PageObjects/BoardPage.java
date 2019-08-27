package PageObjects;

import TestPackage.TestData;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class BoardPage {

    public static void openBoards() {
//        sleep(10000);
        $(By.xpath("//*[@data-test-id='header-boards-menu-button']")).click();

    }

    public static void createNewBoard() {

        $(By.xpath("//*[@data-test-id='header-boards-menu-create-board']")).click();
        $(By.xpath("//*[@data-test-id='header-create-board-title-input']")).sendKeys(TestData.getTemplate().concat(String.valueOf(Math.random())));
        $(By.xpath("//*[@data-test-id='header-create-board-submit-button']")).click();

    }

    public static void createNewList() {

        $(By.xpath("//*[@class='list-name-input']")).sendKeys(TestData.getTemplate().concat(String.valueOf(Math.random())));
        $(By.xpath("//*[@class='primary mod-list-add-button js-save-edit']")).click();
    }

    public static void addNewCard() {
        $(By.xpath("//*[@class='js-add-a-card']")).click();
        $(By.xpath("//*[@class='list-card-composer-textarea js-card-title']")).sendKeys(TestData.getTemplate().concat(String.valueOf(Math.random())));
        $(By.xpath("//*[@class='primary confirm mod-compact js-add-card']")).click();
    }


//    list-header-target js-editing-target
//    field field-autosave js-description-draft description card-description
//    primary confirm mod-submit-edit js-save-edit
//    button-link js-add-checklist-menu
//    primary wide confirm js-add-checklist
//    edit field checklist-new-item-text js-new-checklist-item-input
//    primary confirm mod-submit-edit js-add-checklist-item
//    checklist-item-checkbox enabled js-toggle-checklist-item
//    button-link js-move-card
//    js-select-list

}
