import UiSteps.*;
import TestPackage.*;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Feature;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class UiTest extends Hooks{

    @Feature("Тестирование UI \"Trello\"")
    public void testTrello() {
        //    Авторизация+
        StartPage.authorization();
        AuthPage.login(TestData.getUserLogin(), TestData.getUserPassword());
        //    Создание новой доски+
        BoardPageSteps.createNewBoard();
        //    Переименование доски+
        BoardPageSteps.renameBoard();
        //    Переименование нового списка по умолчанию+
        BoardPageSteps.renameDefaultList();
        //    Создание нового списка+
        BoardPageSteps.createNewList();
        //    Переименование списка
        BoardPageSteps.renameList();
        //    Создание новой карточки
        BoardPageSteps.createNewCard();
        //    Переименование карточки
        BoardPageSteps.renameCard();
        //    Добавление описания к карточке
        BoardPageSteps.addCardDescription();
        //    Добавление чек-листа в карточке
        BoardPageSteps.addCheckList();
        //    Добавление двух элементов в чек лист
        BoardPageSteps.addSomeElementsToList();
        //    Подтверждени одного из элементов чек-листа
        BoardPageSteps.acceptingCheckListElement();
        //    Перенос карточки в другой список
        BoardPageSteps.replaceCardToAnotherList();
        //    Удаление карточки
        BoardPageSteps.removeCard();
        //    Выход из системы
        BoardPageSteps.logoff();
    }

    @BeforeTest
    public void beforeTest() {
        DriverFactory.initialDriver("CHROME");
        Selenide.open(TestData.getUrl());
        Configuration.timeout = 10000;
    }

    @AfterTest
    public void afterTest() {
        DriverFactory.closeDriver();
    }


}
