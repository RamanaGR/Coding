package com.wbl.WebDriver.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebDriverExEdge {
    WebDriver driver;

    public void launchChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.navigate().to("https://www.walmart.com");
        //JavascriptExecutor
        driver.findElement(By.xpath("(//div[@class='TempoCategoryTile-tile valign-top'])[3]")).click();
        //driver.findElement(By.xpath(""));//get single element
        List<WebElement> list  = driver.findElements(By.cssSelector("ul.slider-list li"));//get list of elements 14
        for(WebElement ele : list){
            System.out.println(ele.getText());
        }
        //logo.click();
    }

    public static void main(String[] args) {
        WebDriverExEdge webDriverExEdge = new WebDriverExEdge();
        webDriverExEdge.launchChrome();
    }

}