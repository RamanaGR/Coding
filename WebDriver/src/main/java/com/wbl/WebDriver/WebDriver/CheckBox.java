package com.wbl.WebDriver.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.demoqa.com/automation-practice-form");
        List<WebElement> rdBt = driver.findElements(By.xpath("//div[@class=\"custom-control custom-radio custom-control-inline\"]"));
        rdBt.get(1).click();
        rdBt.get(0).click();
        //rdBt.get(2).is;

			/*
			WebElement rdBtn = driver.findElement(By.id("exp-2"));
			rdBtn.click();
			List<WebElement> chkBxProfession = driver.findElements(By.name("profession"));
			int iSize = chkBxProfession.size();
			for(int i=0; i < iSize ; i++ ){
				String sValue = chkBxProfession.get(i).getAttribute("value");
				if (sValue.equalsIgnoreCase("Automation Tester")){
					chkBxProfession.get(i).click();
				break;
				}
			}
			// Step 6: Check the Check Box 'Selenium IDE' for category 'Automation Tool' (Use cssSelector)
			WebElement oCheckBox = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
			oCheckBox.click();
			
			//driver.quit();
*/
    }

}

