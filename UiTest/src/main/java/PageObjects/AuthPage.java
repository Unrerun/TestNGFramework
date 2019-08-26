package PageObjects;

import TestPackage.DriverFactory;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import com.codeborne.selenide.conditions.Text;

import static com.codeborne.selenide.Selenide.$;

public class AuthPage {
//    @FindBy
////    @Description("Поле пользователь")
//    By usernameField = By.id("user");
//
//    @FindBy
////    @Description("Поле пароль")
//    By passwordField = By.id("password");
//
//    @FindBy
////    @Description("Кнопка логин")
//    By loginBtn = By.id("login");


    public static void doLogin(String username, String password) {
        $(By.id("user")).waitUntil(Condition.visible,10).sendKeys(username);
        $(By.id("password")).waitUntil(Condition.visible,10).sendKeys(password);
        $(By.id("login")).waitUntil(Condition.visible,10).click();
    }

}
