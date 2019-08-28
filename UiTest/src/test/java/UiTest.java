import PageObjects.*;
import TestPackage.*;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Feature;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class UiTest {

//    Авторизация+
//    Создание новой доски+
//    Переименование доски+
//    Переименование нового списка по умолчанию+
//    Создание нового списка+
//    Переименование списка+
//    Создание новой карточки+
//    Переименование карточки+
//    Добавление описания к карточке
//    Добавление чек-листа в карточке
//    Добавление двух элементов в чек лист
//    Подтверждени одного из элементов чек-листа
//    Перенос карточки в другой список
//    Удаление карточки
//    Выход из системы
    @BeforeTest
    public void beforeTest() {
        DriverFactory.initialDriver("CHROME");
        Selenide.open(TestData.getUrl());
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }

    @AfterTest
    public void afterTest() {
        DriverFactory.closeDriver();
    }


    @Feature("Тестирование UI \"Trello\"")
    public void testTrello() {
        StartPage.authorisation();
        AuthPage.login(TestData.getUserLogin(), TestData.getUserPassword());
        BoardPage.createNewBoard();
        BoardPage.createNewList();
        BoardPage.addNewCard();
    }

}
