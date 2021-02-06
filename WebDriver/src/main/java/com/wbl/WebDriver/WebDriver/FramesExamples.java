package com.wbl.WebDriver.WebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
        /*switchTo().frame(int) – Switch to a frame with its index
        switchTo().frame(“name of the frame”) – Switch to a frame with its name
        switchTo().frame(WebElement) – Switch to a frame with its web element location
        switchTo().defaultContent() – Switch back to default page*/

public class FramesExamples {

    static WebDriver driver;
    private String url = "http://www.londonfreelance.org/courses/frames/index.html";

    //Setup Driver
    @BeforeClass
    public static void setupTest() {
        driver = new ChromeDriver();
    }

    @Test
    public void FrameExampleTest() {
        //Navigate to URL
        driver.manage().window().maximize();
        driver.navigate().to(url);

        //Switch to main frame with its index (top.html)
        //top.html is in 3rd frame so its index is 2
        //driver.switchTo().frame(2);

        //Switch to main frame with its name (top.html)
        //This frame's name is main
        driver.switchTo().frame("main");

        //Switch to main frame with its webelement (top.html)
        //Find/locate the main frame
//        WebElement mainFrame = driver.findElement(By.cssSelector("html>frameset>frameset>frameset>frame:nth-child(1)"));
//
//        driver.switchTo().frame(mainFrame);

        //Check the H2 tag's text is "Title bar (top.html)
        WebElement h2Tag = driver.findElement(By.cssSelector("html>body>h2"));
        System.out.println(h2Tag.getText());
    }

    //Close Driver
    @AfterClass
    public static void quitDriver() {
        driver.quit();
    }
}

