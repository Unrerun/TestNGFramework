package UiSteps;

import PageObjects.BoardPage;
import TestPackage.TestData;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;


public class BoardPageSteps {

    @Attachment
    @AfterMethod
    public void screenShoot() {
        Listener.ScreenShooter.saveAllureScreenshotAfterStep();
    }

    @Step("Создание новой доски")
    public static void createNewBoard() {
        BoardPage.boardsMenuButton().click();
        BoardPage.createBoardButton().click();
        BoardPage.boardTitleInput().val(TestData.getRandomTemplate());
        BoardPage.submitButton().click();

    }

    @Step("Перименование доски")
    public static void renameBoard() {
        BoardPage.headerButtonText().click();
        BoardPage.boardNameInput().sendKeys(TestData.getTemplate());
        BoardPage.boardNameInput().pressEnter();
    }

    @Step("Создание нового листа")
    public static void createNewList() {
        BoardPage.listNameInput().val(TestData.getRandomTemplate());
        BoardPage.saveListNameButton().click();
    }

    @Step("Добавление новой карточки")
    public static void createNewCard() {
        BoardPage.addCard().click();
        BoardPage.cardTitle().val(TestData.getRandomTemplate());
        BoardPage.confirmModeAddCard().click();
    }

    @Step("Переименование нового списка по умолчанию")
    public static void renameDefaultList() {
        BoardPage.listNameInput().val(TestData.getRandomTemplate());
        BoardPage.saveListNameButton().click();
        BoardPage.listHeaderTarget().click();
        BoardPage.listHeaderInputIsEditing().sendKeys(TestData.getTemplate());
        BoardPage.listHeaderInputIsEditing().sendKeys(Keys.ENTER);
    }

    @Step("Переименование карточки")
    public static void renameCard() {
        BoardPage.cardName().hover();
        BoardPage.editCardNameIcon().click();
        BoardPage.editCardTitle().sendKeys(TestData.getRandomTemplate());
        BoardPage.saveEdits().click();
    }

    @Step("Добавление чек-листа в карточке")
    public static void addCheckList() {
        BoardPage.addChecklistMenu().click();
        BoardPage.addChecklistButton().click();
    }

    @Step("Добавление двух элементов в чек лист")
    public static void addSomeElementsToList() {
        BoardPage.newChecklistItemInput().val(TestData.getRandomTemplate());
        BoardPage.addChecklistItem().click();
        BoardPage.newChecklistItemInput().val(TestData.getRandomTemplate());
        BoardPage.addChecklistItem().click();
    }

    @Step("Переименование списка")
    public static void renameList() {
        BoardPage.getListHeadersCollection().get(1).click();
        BoardPage.listHeaderInputIsEditing().sendKeys(TestData.getRandomTemplate());
        BoardPage.listHeaderInputIsEditing().sendKeys(Keys.ENTER);
    }

    @Step("Подтверждение одного из элементов чек-листа")
    public static void acceptingCheckListElement() {
        BoardPage.toggleChecklistItem().doubleClick();
    }

    @Step("Перенос карточки в другой список")
    public static void replaceCardToAnotherList() {
        BoardPage.moveCard().click();
        BoardPage.selectList().selectOption(1);
        BoardPage.submitList().click();
    }

    @Step("Удаление карточки")
    public static void removeCard() {
        BoardPage.archiveCard().click();
        BoardPage.deleteCard().click();
        BoardPage.confirmDelete().click();

    }

    @Step("Выход из системы")
    public static void logoff() {
        BoardPage.menuButton().click();
        BoardPage.logoutButton().click();
    }

    @Step("Добавление описания карточки")
    public static void addCardDescription() {
        BoardPage.cardName().click();
        BoardPage.cardDescription().sendKeys(TestData.getRandomTemplate());
        BoardPage.saveDescriptionEdit().click();
    }


}
