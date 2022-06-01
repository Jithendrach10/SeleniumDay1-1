package org.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicProject2 {
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ch Dharma\\eclipse-workspace\\SeleniumDay1-1\\Drivers\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/ ");
   
        String cur = driver.getCurrentUrl();
        System.out.println(cur);
        
        String til = driver.getTitle();
        System.out.println(til);
        driver.manage().window().maximize();
   }

}
