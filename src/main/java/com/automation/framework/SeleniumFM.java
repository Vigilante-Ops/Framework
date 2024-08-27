package com.automation.framework;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SeleniumFM {

    @Value("${framework.browser}")
    private String browserName;

    public String getBrowserName() {
        return browserName;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    @ConditionalOnProperty(name = "framework.isMultithreaded", havingValue = "false")
    public WebDriver webdriverObjectInitializerSingleton() {

        System.out.println("webdriverObjectInitializerSingleton called");

        if (getBrowserName().toUpperCase().equals("CHROME"))
            return new ChromeDriver();
        else if (getBrowserName().toUpperCase().equals("FIREFOX")) {
            return new FirefoxDriver();

        } else if (getBrowserName().toUpperCase().equals("EDGE"))
            return new EdgeDriver();
        else
            return new ChromeDriver();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @ConditionalOnProperty(name = "framework.isMultithreaded", havingValue = "true")
    public WebDriver webdriverObjectInitializerPrototype() {
        System.out.println("webdriverObjectInitializerPrototype called");

        if (getBrowserName().toUpperCase().equals("CHROME"))
            return new ChromeDriver();
        else if (getBrowserName().toUpperCase().equals("FIREFOX")) {
            return new FirefoxDriver();

        } else if (getBrowserName().toUpperCase().equals("EDGE"))
            return new EdgeDriver();
        else
            return new ChromeDriver();
    }

}
