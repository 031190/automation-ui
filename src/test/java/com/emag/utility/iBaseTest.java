package com.emag.utility;

import org.openqa.selenium.WebDriver;

public interface iBaseTest {
    ThreadLocal<WebDriver> getWebDriverPool();

    WebDriver getDriver();
}
