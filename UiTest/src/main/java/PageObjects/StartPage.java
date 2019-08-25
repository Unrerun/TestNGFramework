package PageObjects;

import TestPackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class StartPage {

    private String url = "https://trello.com/";
    private WebDriver driver = DriverFactory.getDriver();

    @FindBy
    By loginButton = By.xpath("/html/body/header/nav/div[2]/a[1]");

    public void openStartPage(String url, String title) {
        driver.get(url);
        if (!driver.getTitle().equals(title)) {
            throw new IllegalStateException("This is not the " + title + " start page");
        }
    }


    public void pressLoginButton() {
        driver.findElement(loginButton).click();
    }
}
