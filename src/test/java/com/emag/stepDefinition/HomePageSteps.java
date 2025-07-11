package com.emag.stepDefinition;

import com.emag.pages.HomePage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class HomePageSteps extends HomePage {
    public HomePageSteps(WebDriver driver) {
        super(driver);
    }

    public void user_landed_homepage() {
        //HomePage home_page = new HomePage();
        //home_page.getHomePage();
        //System.setProperty("webdriver.chrome.driver", "D:\\JavaProjects\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        //WebDriver driver2 = new ChromeDriver();
        goToHomePage();
    }

    public void userClicksOnHeader() {
        //HomePage homePage = new HomePage(driver);
//        PageFactory.initElements(driver, homePage);
//        Thread.sleep(3000);
//        Assert.assertTrue(homePage.header.isDisplayed());
//        homePage.header.click();
        clickOnHeader();
    }
}
