import PageObjects.*;
import TestPackage.*;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


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
    public void before() {
        DriverFactory.initialDriver("CHROME");
    }

    @AfterTest
    public void after() {
        DriverFactory.closeDriver();
    }


    @Test
    public void testTrello() {
        StartPage.openStartPage(TestData.getUrl());
        StartPage.pressLoginButton();
        AuthPage.doLogin(TestData.getUserLogin(), TestData.getUserPassword());
        BoardPage.openBoards();
        BoardPage.createNewBoard();
        BoardPage.createNewList();
        BoardPage.addNewCard();
    }

}
