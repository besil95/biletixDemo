package org.example.green.page;

import org.example.green.base.BasePage;
import org.openqa.selenium.WebDriver;

import static org.example.green.constants.Constants.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void cookieClick() {
        click(COOKIES_ACCEPT);
    }

    public void categories() {
        selectOptionClick(ALL_CATEGORIES, "MÜZİK");
    }

    public void date(){
        selectOptionClick(DATE, "Önümüzdeki 30 Gün");
    }
    public void city(){
        selectOptionClick(CITY, "Tüm Türkiye");
    }
    public void discover(){
        click(DISCOVER_BUTTON);
    }

    public void hoverElement() {
        hoverElement();
    }

    public void enterEmail(String email) {
        sendKeys(COOKIES_ACCEPT, email);
    }

    public void closePolicie() {
        click(COOKIES_ACCEPT);
    }

    public void closePop() {
        click(COOKIES_ACCEPT);
    }

    public void closePolicies() {
        click(COOKIES_ACCEPT);
    }

    public void enterPassword(String password) {
        sendKeys(COOKIES_ACCEPT, password);
    }

    public void clickLoginEnter() {
        click(COOKIES_ACCEPT);
    }
}
