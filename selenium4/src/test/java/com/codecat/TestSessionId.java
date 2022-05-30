package com.codecat;

import static java.lang.invoke.MethodHandles.lookup;
import static org.assertj.core.api.Assertions.assertThat;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.slf4j.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSessionId {

    WebDriver driver;
    final Logger logger = getLogger(lookup().lookupClass());
    String sutUrl = "https://bonigarcia.dev/selenium-webdriver-java/";

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void getSessionId() {
        driver.get(sutUrl);
        SessionId sessionID = ((RemoteWebDriver) driver).getSessionId();
        assertThat(sessionID).isNotNull();
        logger.debug("The session id is {}", sessionID.toString());
        System.out.println(sessionID);
        
    }



}