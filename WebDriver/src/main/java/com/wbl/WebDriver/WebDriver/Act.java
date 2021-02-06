package com.wbl.WebDriver.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Act {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.guru99.com/take-screenshot-selenium-webdriver.html");

        TakesScreenshot scrShot = ((TakesScreenshot) driver);

        //Call getScreenshotAs method to create image file

        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination

        String fileWithPath = "C:\\WebDrivers\\image.png";
        File DestFile = new File(fileWithPath);

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);
        //Creating the JavascriptExecutor interface object by Type casting


       /* //Launching the Site.
        driver.get("http://demo.guru99.com/V4/");

        WebElement button = driver.findElement(By.name("btnLogin"));

        //Login to Guru99
        driver.findElement(By.name("uid")).sendKeys("mngr34926");
        driver.findElement(By.name("password")).sendKeys("amUpenu");

        //Perform Click on LOGIN button using JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", button);

        //To generate Alert window using JavascriptExecutor. Display the alert message
        //js.executeScript("alert('Welcome to Guru99');");

*/
    }


    public void seriesOfActions() {
        driver.get("https://www.facebook.com");
        WebElement txtUsername = driver.findElement(By.id("email"));

        Actions builder = new Actions(driver);
        Action seriesOfActions = builder
                .moveToElement(txtUsername)
                .click()
                .keyDown(txtUsername, Keys.SHIFT)
                .sendKeys(txtUsername, "hello")//HELLO
                .keyUp(txtUsername, Keys.SHIFT)
                .doubleClick(txtUsername)//doble click
                .contextClick()//right click
                .build();

        seriesOfActions.perform();
    }

    public void dragAndDrop() {

        driver.get("http://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement SourceElement = driver.findElement(By.id("draggable"));
        WebElement TargetElement = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        action.dragAndDrop(SourceElement, TargetElement).build().perform();
        // action.clickAndHold(SourceElement).moveToElement(TargetElement).release().build().perform();
    }

}

