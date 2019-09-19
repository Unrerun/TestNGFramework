package PageObjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BoardPage {
    //TODO не забыть поменять названия на корректные

    /**
     * boards-menu-button
     */
    public static SelenideElement boardsMenuButton() {
        return $(By.xpath("//*[@data-test-id='header-boards-menu-button']"));
    }

    /**
     * create-board
     */
    public static SelenideElement createBoardButton() {
        return $(By.xpath("//*[@data-test-id='header-boards-menu-create-board']"));
    }

    /**
     * title-input
     */
    public static SelenideElement boardTitleInput() {
        return $(By.xpath("//*[@data-test-id='header-create-board-title-input']"));
    }

    /**
     * submit-button
     */
    public static SelenideElement submitButton() {
        return $(By.xpath("//*[@data-test-id='header-create-board-submit-button']"));
    }

    /**
     * header-btn-text
     */
    public static SelenideElement headerButtonText() {
        return $(By.xpath("//*[@class='js-board-editing-target board-header-btn-text']"));
    }

    /**
     * board-name-input
     */
    public static SelenideElement boardNameInput() {
        return $(By.xpath("//input[@class='board-name-input js-board-name-input']"));
    }

    /**
     *
     */
    public static SelenideElement listNameInput() {
        return $(By.xpath("//*[@class='list-name-input']"));
    }

    /**
     * save-edit
     */
    public static SelenideElement saveListNameButton() {
        return $(By.xpath("//*[@class='primary mod-list-add-button js-save-edit']"));
    }

    /**
     * add-a-card
     */
    public static SelenideElement addCard() {
        return $(By.xpath("//*[@class='js-add-a-card']"));
    }

    /**
     * card-title
     */
    public static SelenideElement cardTitle() {
        return $(By.xpath("//*[@class='list-card-composer-textarea js-card-title']"));
    }

    /**
     * confirm Add Card
     */
    public static SelenideElement confirmModeAddCard() {
        return $(By.xpath("//*[@class='primary confirm mod-compact js-add-card']"));
    }

    /**
     * list Header Target
     */
    public static SelenideElement listHeaderTarget() {
        return $(By.xpath("//*[@class='list-header-target js-editing-target']"));
    }

    /**
     * input is-editing
     */
    public static SelenideElement listHeaderInputIsEditing() {
        return $(By.xpath("//*[@class='list-header-name mod-list-name js-list-name-input is-editing']"));
    }

    /**
     * card-name
     */
    public static SelenideElement cardName() {
        return $(By.xpath("//*[@class='list-card-title js-card-name']"));
    }

    /**
     * edit Card Name Icon
     */
    public static SelenideElement editCardNameIcon() {
        return $(By.xpath("//*[@class='icon-sm icon-edit list-card-operation dark-hover js-open-quick-card-editor js-card-menu']"));
    }

    /**
     * edit-card-title
     */
    public static SelenideElement editCardTitle() {
        return $(By.xpath("//*[@class='list-card-edit-title js-edit-card-title']"));
    }

    /**
     * save-edits
     */
    public static SelenideElement saveEdits() {
        return $(By.xpath("//*[@class='primary wide js-save-edits']"));
    }

    /**
     * add-checklist-menu
     */
    public static SelenideElement addChecklistMenu() {
        return $(By.xpath("//*[@class='button-link js-add-checklist-menu']"));
    }

    /**
     * add-checklist
     */
    public static SelenideElement addChecklistButton() {
        return $(By.xpath("//*[@class='primary wide confirm js-add-checklist']"));
    }

    /**
     * new-checklist-item
     */
    public static SelenideElement newChecklistItemInput() {
        return $(By.xpath("//*[@class='edit field checklist-new-item-text js-new-checklist-item-input']"));
    }

    /**
     * add-checklist-item
     */
    public static SelenideElement addChecklistItem() {
        return $(By.xpath("//*[@class='primary confirm mod-submit-edit js-add-checklist-item']"));
    }

    /**
     * getListHeadersCollection
     */
    public static ElementsCollection getListHeadersCollection() {
        return $$(By.xpath("//*[@class='list-header-target js-editing-target']"));
    }

    /**
     * toggle-checklist-item
     */
    public static SelenideElement toggleChecklistItem() {
        return $(By.xpath("//*[@class='checklist-item-checkbox enabled js-toggle-checklist-item']"));
    }

    /**
     * move-card
     */
    public static SelenideElement moveCard() {
        return $(By.xpath("//*[@class='button-link js-move-card']"));
    }

    /**
     * select-list
     */
    public static SelenideElement selectList() {
        return $(By.xpath("//*[@class='js-select-list']"));
    }

    /**
     * archive-card
     */
    public static SelenideElement archiveCard() {
        return $(By.xpath("//*[@class='button-link js-archive-card']"));
    }

    /**
     * delete-card negate
     */
    public static SelenideElement deleteCard() {
        return $(By.xpath("//*[@class='button-link js-delete-card negate']"));
    }

    /**
     * submit List
     */
    public static SelenideElement submitList() {
        return $(By.xpath("//*[@class='primary wide js-submit']"));
    }

    /**
     * confirm full negate
     */
    public static SelenideElement confirmDelete() {
        return $(By.xpath("//*[@class='js-confirm full negate']"));
    }

    /**
     * menu-button
     */
    public static SelenideElement menuButton() {
        return $(By.xpath("//*[@data-test-id='header-member-menu-button']"));
    }

    /**
     * logout
     */
    public static SelenideElement logoutButton() {
        return $(By.xpath("//*[@data-test-id='header-member-menu-logout']"));
    }

    /**
     * card-description
     */
    public static SelenideElement cardDescription() {
        return $(By.xpath("//*[@class='field field-autosave js-description-draft description card-description']"));
    }

    /**
     * save-edit
     */
    public static SelenideElement saveDescriptionEdit() {
        return $(By.xpath("//*[@class='primary confirm mod-submit-edit js-save-edit']"));
    }
}
