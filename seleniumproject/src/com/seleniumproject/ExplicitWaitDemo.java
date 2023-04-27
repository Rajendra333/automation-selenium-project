package com.seleniumproject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrajendra\\eclipse-workspace\\automation-selenium-project\\seleniumproject\\driver\\chromedriver.exe");
   
	WebDriver driver=new ChromeDriver();
	
    WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));

	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	driver.manage().window().maximize();
	WebElement Account=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='My Account']")));
			
	Account.click();
	
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.xpath("//label[text()='First Name']//following::input[@id='input-firstname']")).sendKeys("Rajendra");
	WebElement lastname=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-lastname']")));
	lastname.sendKeys("M");
	WebElement Email=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
	Email.sendKeys("123@gmail.com");
	driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("939393");
	driver.findElement(By.xpath("//label[text()='Subscribe']//following::label[text()='No']")).click();
	driver.findElement(By.xpath("//input[@name='agree']")).click();
	
}
}
