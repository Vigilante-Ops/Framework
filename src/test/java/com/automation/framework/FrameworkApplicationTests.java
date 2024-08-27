package com.automation.framework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FrameworkApplicationTests {

    @Autowired
    private WebDriver webDriver;
    @Autowired
    private WebDriver webDriver2;

    @Test
    void test1() {
        webDriver.get("https://google.com");
        webDriver.quit();


    }

}
