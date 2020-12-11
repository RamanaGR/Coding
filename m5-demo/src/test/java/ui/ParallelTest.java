package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {
    WebDriver driver;

    @Test
    @Parameters({"browser"})
    public void startUpBrowser(String browser) {
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://github.com/login");
        } else if (browser.equals("opera")) {
            System.setProperty("webdriver.opera.driver", "C:\\WebDrivers\\operadriver.exe");
            driver = new OperaDriver();
            driver.get("https://github.com/login");
        } else {
            System.out.println("No Supported browser");
        }
    }
}
