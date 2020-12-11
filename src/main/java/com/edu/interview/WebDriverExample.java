package com.edu.interview;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverExample {
    WebDriver driver;
    @Test
    public void setUp(){
       // AndroidDriver ad = new AndroidDriver();
        Actions action = new Actions(driver);
       WebElement element = driver.findElement(By.id("Get started free")).findElement(By.cssSelector(""));
        String element1 = driver.findElement(By.id("Get started free")).findElement(By.cssSelector("")).getAttribute("src");
        System.out.println(element1);
        action.click(element).build().perform();
    }
}
