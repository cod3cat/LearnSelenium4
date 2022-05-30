package com.codecat.locatingElements;

import com.codecat.BaseClass;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LinkText extends BaseClass{

    @Test
    void testByLinkText() {
        WebElement linkByText = driver
                .findElement(By.linkText("Return to index"));
        assertThat(linkByText.getTagName()).isEqualTo("a");
        assertThat(linkByText.getCssValue("cursor")).isEqualTo("pointer");

        WebElement linkByPartialText = driver
                .findElement(By.partialLinkText("index"));
        assertThat(linkByPartialText.getLocation())
                .isEqualTo(linkByText.getLocation());
        assertThat(linkByPartialText.getRect()).isEqualTo(linkByText.getRect());
    }

}
