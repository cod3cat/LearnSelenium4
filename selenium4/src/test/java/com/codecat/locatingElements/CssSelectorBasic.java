package com.codecat.locatingElements;

import static org.assertj.core.api.Assertions.assertThat;

import com.codecat.BaseClass;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelectorBasic extends BaseClass{

    @Test
    void testByCssSelectorBasic() {
        driver.get(
                "https://bonigarcia.dev/selenium-webdriver-java/web-form.html");

        WebElement hidden = driver
                .findElement(By.cssSelector("input[type=hidden]")); 
        assertThat(hidden.isDisplayed()).isFalse(); 
    }
}
