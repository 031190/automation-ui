package com.emag.tests;

import com.emag.init.BaseTest;
import com.emag.pages.CardEmagPage;
import com.emag.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CardEmagPageTests extends BaseTest {

    @Test
    public void testCardEmag() throws InterruptedException {
        WebDriver driver = getDriver();
        CardEmagPage cardEmagPage = new CardEmagPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage();
        //homePageSteps.clickOnResigilate();
        cardEmagPage.clickOnCardEmagBtn();
        cardEmagPage.checkCardEmagPage();
    }
}
