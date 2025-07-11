package com.emag.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.testng.Assert.*;

import java.util.Set;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final String homePageUrl = "https://emag.ro";

    @FindBy(xpath = "//*[@id=\"searchboxTrigger\"]")
    private WebElement searchBox;

    @FindBy (xpath = "//*[@id=\"masthead\"]/div/div/div[1]/a/img")
    public WebElement header;

    @FindBy (id = "my_account")
    public WebElement myAccount;

    @FindBy (id = "searchboxAutocomplete")
    public WebElement searchBoxTextInput;

    @FindBy ( xpath = "//button[@class='btn btn-default searchbox-submit-button']")
    public WebElement searchBtn;

    @FindBy ( xpath =  "//li/a[contains(text(),'Resigilate')]")
    public WebElement resigilateBtn;

    public void clickOnHeader() {
        clickElement(header);
    }

    public void goToHomePage() {
        driver.get(homePageUrl);
    }

    public void checkMyAccountIsDisplayed() {

        waitForElementToBeVisible(myAccount);
        assertTrue(myAccount.isDisplayed());
    }

    public void clickOnSearchButton() {
        waitForElementToBeVisible(searchBox);
        searchBox.click();
    }

    public void enterTextInTextField(String text) throws InterruptedException {
        searchBox.sendKeys(text);
        waitForElementToBeVisible(searchBtn);
        searchBtn.click();
        Thread.sleep(4000);
    }

    public void clickOnResigilate() throws InterruptedException {
        String parent = driver.getWindowHandle();
        clickElement(resigilateBtn);
        Thread.sleep(1000);
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("Mihail1: " + parent);
        System.out.println("Mihail2: " + allWindows);
        for (String child:allWindows) {
            if (!parent.equalsIgnoreCase(child)) {
                driver.switchTo().window(child);
            }
        }
        Thread.sleep(10000);
        System.out.println(driver.getCurrentUrl());
        assertTrue(driver.getCurrentUrl().contains("resigilate"));
        driver.close();
        Thread.sleep(10000);
    }
}
