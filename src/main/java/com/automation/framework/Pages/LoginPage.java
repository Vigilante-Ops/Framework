package com.automation.framework.Pages;

import com.automation.framework.BaseSeleniumConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseSeleniumConfig {
    public LoginPage(WebDriver webDriver, String startingUrl) {
        super(webDriver);
        this.webDriver.get(startingUrl);
        System.out.println("LoginPage constructor called");

    }

    public void pageTitle() {
        System.out.println(this.webDriver.getTitle());
    }

    public void enterUsername(String username) {
        this.webDriver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
    }

    public void enterPassword(String password) {
        this.webDriver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }
}
