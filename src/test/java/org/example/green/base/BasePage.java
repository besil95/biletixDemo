package org.example.green.base;


import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

    WebDriver driver = null;
    WebDriverWait wait = null;
    static Actions actions = null;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        this.wait = new WebDriverWait(driver, 60);
    }

    public WebElement findElement(By by) {
        //wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }

    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
    }

    public void click(By by) {
        //wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();

    }


    public String getText(By by) {
        //wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return findElement(by).getText();
    }

    public void hoverElement(By by) {
        /*wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));*/
        actions.moveToElement(findElement(by)).build().perform();
    }

    public void mouseOver(By by) {
        //wait.until(ExpectedConditions.elementToBeClickable(by));
        WebElement menuOption = driver.findElement(by);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public Select selectOption(By by) {
        this.untilElementAppear(by);
        return new Select(this.findElement(by));
    }

    private void untilElementAppear(By by) {
        this.wait.ignoring(StaleElementReferenceException.class, ElementNotInteractableException.class);
    }

    public void selectOptionClick(By by, String value) {
        this.selectOption(by).selectByVisibleText(value);
    }


}