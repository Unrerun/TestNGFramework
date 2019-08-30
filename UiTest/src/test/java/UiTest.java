import PageObjects.*;
import TestPackage.*;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Feature;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class UiTest {

    @BeforeTest
    public void beforeTest() {
        DriverFactory.initialDriver("CHROME");
        Selenide.open(TestData.getUrl());
    }

    @AfterTest
    public void afterTest() {
        DriverFactory.closeDriver();
    }

    @Feature("Тестирование UI \"Trello\"")
    public void testTrello() {
        //    Авторизация
        StartPage.authorisation();
        AuthPage.login(TestData.getUserLogin(), TestData.getUserPassword());
        //    Создание новой доски
        BoardPage.createNewBoard();
        //    Переименование доски
        BoardPage.renameBoard();
        //    Переименование нового списка по умолчанию
        BoardPage.renameDefaultList();
        //    Создание нового списка
        BoardPage.createNewList();
        //    Переименование списка
        BoardPage.renameList();
        //    Создание новой карточки
        BoardPage.createNewCard();
        //    Переименование карточки
        BoardPage.renameCard();
        //    Добавление описания к карточке
        BoardPage.addCardDescription();
        //    Добавление чек-листа в карточке
        BoardPage.addCheckList();
        //    Добавление двух элементов в чек лист
        BoardPage.addSomeElementsToList();
        //    Подтверждени одного из элементов чек-листа
        BoardPage.acceptingCheckListElement();
        //    Перенос карточки в другой список
        BoardPage.replaceCardToAnotherList();
        //    Удаление карточки
        BoardPage.removeCard();
        //    Выход из системы
        BoardPage.logoff();
    }

}
