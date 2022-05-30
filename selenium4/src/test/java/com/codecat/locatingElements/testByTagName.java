package com.codecat.locatingElements;

import static org.assertj.core.api.Assertions.assertThat;

import com.codecat.BaseClass;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class testByTagName extends BaseClass{

    @Test
    void byTagName() {
        WebElement textarea = driver.findElement(By.tagName("textarea"));
        assertThat(textarea.getDomAttribute("rows")).isEqualTo("3");
    }
}
