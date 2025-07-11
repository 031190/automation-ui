package com.emag.tests;

import com.emag.init.BaseTest;
import com.emag.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class HomePageTests extends BaseTest {


    @Test
    public void testHomePage() throws InterruptedException {
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage();
        homePage.checkMyAccountIsDisplayed();
        homePage.clickOnHeader();
        homePage.checkMyAccountIsDisplayed();
        homePage.clickOnSearchButton();
        homePage.enterTextInTextField("Mishu");
    }

    @Test
    public void testHomePage2() {
        //HomePageSteps page = new HomePageSteps();
        //
        //page.user_landed_homepage();
        //WebDriver driver = getDriver();
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage();
        homePage.clickOnHeader();
    }

    @Test
    public void testResigilate() throws InterruptedException {
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage();
        homePage.clickOnResigilate();

    }
    @Test
    public void test() {
        HomePage page = new HomePage(getDriver());
    }
}
