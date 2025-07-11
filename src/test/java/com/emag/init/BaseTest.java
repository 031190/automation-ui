package com.emag.init;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    //    public WebDriver driver;

//    @BeforeMethod
//    public  void setUp() {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }
//
//    @AfterMethod
//    public  void tearDown(){
//        driver.quit();
//    }

    public final ThreadLocal<WebDriver> webDriverPool = new ThreadLocal<>();

    public WebDriver getDriver() { return this.webDriverPool.get(); }

    public ThreadLocal<WebDriver> getWebDriverPool() { return this.webDriverPool;}

    @BeforeMethod
    public void setup() {
        this.webDriverPool.set(createWebDriver());
    }

    public WebDriver createWebDriver() {
        return new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        this.webDriverPool.get().quit();
        this.webDriverPool.remove();
    }
}
