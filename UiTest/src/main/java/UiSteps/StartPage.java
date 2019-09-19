package UiSteps;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class StartPage {

    @Step("Переход на страницу авторизации")
    public static void authorization() {
        $(By.xpath("//a[@href='/login']")).click();
    }

}
