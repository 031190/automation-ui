package com.emag.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class CardEmagPage extends HomePage{
    public CardEmagPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "card-emag-banner")
    public WebElement cardEmagImage;

    @FindBy (xpath = "//li/a[contains(text(),'Card eMAG')]")
    public WebElement cardEmagBtn;

    @FindBy(xpath = "//form/h4[contains(text(), 'Aplica acum')]")
    public WebElement cardEmagForm;

    @FindBy (xpath = "//*[@class = 'fw-semibold mt-0 text-primary']")
    public WebElement cardEmagFormTitle;

    @FindBy(name = "name")
    public WebElement cardEmagFormNameInput;

    @FindBy(className = "form-group")
    public List<WebElement> test;

    @FindBy (xpath = "//*[contains(text(),'Nume și prenume:')]")
    public WebElement cardEmagFormNameLabel;

    @FindBy (xpath = "//*[contains(text(),'Numar de telefon:')]")
    public WebElement cardEmagFormTelLabel;

    @FindBy(name = "phone")
    public WebElement cardEmagFormPhoneInput;

    @FindBy (className = "help-block")
    public WebElement errorInputField;

    @FindBy (xpath = "//div[contains(@class, 'checkbox checkbox-custom mb-5')]/label[1]")
    public WebElement cardEmagFormTermsCheckbox;

    public void clickOnCardEmagBtn(){
        waitForElementToBeVisible(cardEmagBtn);
        Assert.assertTrue(cardEmagBtn.isDisplayed());
        clickElement(cardEmagBtn);

    }
    public void checkCardEmagPage(){
        Assert.assertTrue(cardEmagImage.isDisplayed());
        Assert.assertTrue(cardEmagForm.isDisplayed());
        Assert.assertTrue(cardEmagFormTitle.getText().equals("Aplica acum"));
        Assert.assertTrue(cardEmagFormNameLabel.isDisplayed());
        Assert.assertTrue(cardEmagFormTelLabel.isDisplayed());
        clickElement(cardEmagFormNameInput);
        clickElement(cardEmagFormPhoneInput);
        //driver.manage().window().maximize();
        Assert.assertTrue(errorInputField.isDisplayed());
        cardEmagFormNameInput.sendKeys("Mihail Moldovanu");
        cardEmagFormPhoneInput.sendKeys("0746373839");
        //Assert.assertFalse(cardEmagFormTermsCheckbox.isSelected());
        //scrollToElementJs(cardEmagFormTermsCheckbox);
        scrollToElement(cardEmagFormTermsCheckbox);
        clickElementJs(cardEmagFormTermsCheckbox);
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){}
        //Assert.assertTrue(cardEmagFormTermsCheckbox.isSelected());
        try{
            Thread.sleep(6000);
        } catch (InterruptedException e){}
    }
}
