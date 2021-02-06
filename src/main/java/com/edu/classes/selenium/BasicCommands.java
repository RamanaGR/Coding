package com.edu.classes.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BasicCommands {
    WebDriver driver;

    public void launchChrome() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.get("http://www.whiteboxqa.com");
        driver.navigate().to("http://www.whiteboxqa.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[5]/a")).click();//Click on FAQ
        driver.navigate().refresh();
        driver.navigate().back();//BAck to H0me page
        driver.navigate().forward();//Go to FaQ Page
        //Thread.sleep(10000);
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[14]/div[1]/h4/a"))).click();
//Fluent wwait
//        Wait<WebDriver> fluentWait= new FluentWait<WebDriver>(driver)
//                .pollingEvery(5,TimeUnit.MILLISECONDS);
//        fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
//
        String currentURL = driver.getCurrentUrl();//
        System.out.println("Current URL:  "+currentURL);//http://www.whiteboxqa.com/faq.php
        String pageSource = driver.getPageSource();
        System.out.println("**************");
        System.out.println("Page Source:  "+pageSource);//Html code
        String title = driver.getTitle();
        System.out.println("Title of the Current Page:  "+title);//Tile of the page
        Set<String> window =driver.getWindowHandles();
        System.out.println("Window :  "+window);//window id


        //Thread.sleep(5000);
        //driver.
        driver.quit();//closes whole browser
    }


    public void launchOpera() {
        System.setProperty("webdriver.opera.driver", "C:\\WebDrivers\\operadriver.exe");
        driver = new OperaDriver();//
        driver.get("http://www.whiteboxqa.com");
        driver.quit();//closes whole browser
    }


    public static void main(String[] args) throws InterruptedException {
        BasicCommands bc = new BasicCommands();
        bc.launchChrome();
    }
}
