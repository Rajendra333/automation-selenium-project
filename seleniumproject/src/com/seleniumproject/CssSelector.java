package com.seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class CssSelector {
	
		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrajendra\\eclipse-workspace\\automation-selenium-project\\seleniumproject\\driver\\chromedriver.exe");
			
			RemoteWebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//span[text()='My Account']")).click();
			Thread.sleep(1000);
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Rajendra");
			driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("M");
			driver.findElement(By.cssSelector("input[placeholder='E-Mail']")).sendKeys("123@gmail.com");
			driver.findElement(By.cssSelector("input[name='telephone']")).sendKeys("939393");
			driver.findElement(By.xpath("//label[text()='Subscribe']//following::label[text()='No']")).click();
			driver.findElement(By.xpath("//input[@name='agree']")).click();
	     
			String exptitle="Register Account";
			
			String actualtitle= driver.getTitle();
			if(actualtitle.equals(exptitle)) {
				System.out.println("test passed");
			}else {
				System.out.println(actualtitle);
			}

			
		}


}
