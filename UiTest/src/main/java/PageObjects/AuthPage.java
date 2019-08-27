package PageObjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AuthPage {


    public static void doLogin(String username, String password) {
        $(By.id("user")).waitUntil(Condition.visible,10).sendKeys(username);
        $(By.id("password")).waitUntil(Condition.visible,10).sendKeys(password);
        $(By.id("login")).waitUntil(Condition.visible,10).click();
    }

}
