package PageObjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StartPage {

    public static void openStartPage(String url) {
        open(url);
    }

    public static void pressLoginButton() {
        $(By.xpath("//a[@href='/login']")).waitUntil(Condition.visible, 5).click();
    }

}
