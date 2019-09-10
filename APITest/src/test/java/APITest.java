import TestPackage.ApiTestSteps;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Test
public class APITest extends Hooks {

    @Feature("Тестирование API \"Trello\"")
    public void testTrelloAPI() {

        //    Создание новой доски+
        ApiTestSteps.createNewBoard();
        //    Переименование доски+
        ApiTestSteps.renameBoard();
        //    Переименование нового списка по умолчанию+
        ApiTestSteps.renameDefaultList();
        //    Создание нового списка+
        ApiTestSteps.createNewList();
        //    Переименование списка
        ApiTestSteps.renameList();
        //    Создание новой карточки
        ApiTestSteps.createNewCard();
        //    Переименование карточки
        ApiTestSteps.renameCard();
        //    Добавление описания к карточке
        ApiTestSteps.addCardDescription();
        //    Добавление чек-листа в карточке
        ApiTestSteps.addCheckList();
        //    Добавление двух элементов в чек лист
//        ApiTestSteps.addSomeElementsToList();
//        //    Подтверждени одного из элементов чек-листа
//        ApiTestSteps.acceptingCheckListElement();
//        //    Перенос карточки в другой список
//        ApiTestSteps.replaceCardToAnotherList();
//        //    Удаление карточки
//        ApiTestSteps.removeCard();
    }
}
