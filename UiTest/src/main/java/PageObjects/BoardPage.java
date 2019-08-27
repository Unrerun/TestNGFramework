package PageObjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class BoardPage {

    public static void openBoards() {
//        sleep(10000);
        $(By.xpath("//*[@data-test-id='header-boards-menu-button']")).click();

    }

    public static void createNewBoard(String boardName) {

        $(By.xpath("//*[@data-test-id='header-boards-menu-create-board']")).click();
        $(By.xpath("//*[@data-test-id='header-create-board-title-input']")).sendKeys(boardName.concat(String.valueOf(Math.random())));
        $(By.xpath("//*[@data-test-id='header-create-board-submit-button']")).click();

    }

}
