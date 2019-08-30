package PageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AuthPage {

    @Step("Авторизация")
    public static void login(String username, String password) {
        $(By.id("user")).val(username);
        $(By.id("password")).val(password);
        $(By.id("login")).click();
    }

}
