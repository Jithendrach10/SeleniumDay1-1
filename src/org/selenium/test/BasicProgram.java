package org.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicProgram {
  public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ch Dharma\\eclipse-workspace\\SeleniumDay1-1\\Drivers\\chromedriver.exe ");
      WebDriver driver = new ChromeDriver();
       driver.get("https://www.youtube.com/ ");
       
       //get title on console
         String title1 = driver.getTitle();
          System.out.println(title1);
          
       //get current url name in console    
          String currenturl = driver.getCurrentUrl();
          System.out.println(currenturl);
          
          //get chrome window max screen by the below command 
          driver.manage().window().maximize();
  }
}
