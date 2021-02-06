package com.wbl.WebDriver.WebDriver;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.opera.OperaDriver;


public class WebDriverEx {
	      /*  String baseUrl = "http://www.facebook.com";
	       
	        String tagName = "";
	        
	        driver.get(baseUrl);
	        tagName=driver.getTitle();
	        driver.navigate().to("http://www.twitter.com");*/
        //  tagName = driver.findElement(By.id("email")).getTagName();
        //  System.out.println(tagName);
        //  driver.navigate().back();

        // System.exit(0);
        //  String a=  driver.getPageSource();
        //  System.out.println(a);
        //  driver.navigate().to("http://demo.guru99.com/selenium/deprecated.html");
        //  driver.switchTo().frame("classframe");
        // driver.findElement(By.xpath("/html/body/div[3]/ul/li[5]/a")).click();
	        

	       
	       /* System.out.println(alertMessage);
	        driver.get("http://demo.guru99.com/test/ajax.html");
	        List<WebElement> elements = driver.findElements(By.name("name"));
	        System.out.println("Number of elements:" + elements.size());

	        for (int i=0; i<elements.size();i++){
	          System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
	        }*/


      /*  driver.get("http://jsbin.com/osebed/2");
        Select fruits = new Select(driver.findElement(By.id("fruits")));
        fruits.selectByVisibleText("Banana");
        fruits.selectByIndex(1);
        driver.close();*/


        public static void main (String[] args){
            System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

            driver.get("http://jsbin.com/usidix/1");

            driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();

            String alertMessage = driver.switchTo().alert().getText();
			System.out.println(alertMessage);
            driver.switchTo().alert().accept();
        }

    }
	


