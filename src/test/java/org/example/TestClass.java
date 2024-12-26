package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestClass {

    @Test
   public void check(){
        WebDriverManager.firefoxdriver().setup();
     //  System.setProperty("webdriver.chrome.driver","/Users/nagarajs/Desktop/WebDrivers/chromedriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.close();
        driver.quit();
    }

}
