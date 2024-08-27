package com.automation.framework;

import com.automation.framework.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest(classes = FrameworkApplication.class)
public class LoginPageTest extends AbstractTestNGSpringContextTests
{
    @Autowired
    private WebDriver webDriver;
    private LoginPage loginPage;


    @Test(priority = -1)
    void getTitle() {
        loginPage = new LoginPage(webDriver, "https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        loginPage.pageTitle();
    }

    @Test
    void enterUsername() throws InterruptedException {
        loginPage.enterUsername("bobatea@gmail.com");
        Thread.sleep(6000);
    }

    @Test
    void enterPassword() {
        loginPage.enterPassword("12345");
    }

}
