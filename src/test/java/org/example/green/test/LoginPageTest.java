package org.example.green.test;

import org.example.green.base.BaseTest;
import org.example.green.page.LoginPage;
import step.repositories.parser.annotated.Step;

import static org.example.green.constants.Constants.*;


public class LoginPageTest extends BaseTest {

    LoginPage loginPage;

    @Step("Biletix sayfasina gidlir.")
    public void before() {
        loginPage = new LoginPage(getWebDriver());
        loginPage.closePolicie();
    }


    @Step("Anasayfada cerezleri kabul et butonuna tıklanir.")
    public void cookieClick() {
        loginPage.cookieClick();
    }

    @Step("Kategoriler listesinden MUZIK secilir.")
    public void categories() {
        loginPage.selectOptionClick(ALL_CATEGORIES, "MÜZİK");
    }

    @Step("Tarih listesinden ONUMUZDEKI 30 GUN secilir.")
    public void date() {
        loginPage.selectOptionClick(DATE, "Önümüzdeki 30 Gün");
    }

    @Step("Yer listesinden TUM TURKIYE secilir.")
    public void city() {
        loginPage.selectOptionClick(CITY, "Tüm Türkiye");
    }


    @Step("Anasayfada git butonuna tıklanır.")
    public void discover() {
        loginPage.click(DISCOVER_BUTTON);
    }


}
