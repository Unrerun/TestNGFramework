package PageObjects;

import TestPackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class StartPage {
    private String url = "https://trello.com/";

    @FindBy
    By loginButton = By.xpath("/html/body/header/nav/div[2]/a[1]");

    public StartPage checkOpenedPage(String title) {
        if (!DriverFactory.getDriver().getTitle().equals(title)) {
            throw new IllegalStateException("This is not the " + title + " start page");
        }
        return this;
    }

    public StartPage pressLoginButton() {
        DriverFactory.getDriver().findElement(loginButton).click();
        return this;
    }
}
