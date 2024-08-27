package com.automation.framework;

import org.openqa.selenium.WebDriver;

public class BaseSeleniumConfig {
    protected WebDriver webDriver;

    public BaseSeleniumConfig(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
