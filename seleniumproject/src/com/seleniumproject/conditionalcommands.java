package com.seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class conditionalcommands {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrajendra\\eclipse-workspace\\automation-selenium-project\\seleniumproject\\driver\\chromedriver.exe");
		
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Register")).click();
		
		WebElement firstname=driver.findElement(By.xpath("//input[@id='input-firstname']"));
		WebElement lastname=driver.findElement(By.xpath("//input[@id='input-lastname']"));
		
		if(firstname.isEnabled()&&firstname.isDisplayed()) {
			firstname.sendKeys("raja");
		}
        if(lastname.isEnabled()&&lastname.isDisplayed()) {
        	lastname.sendKeys("M");
		}
        System.out.println(driver.findElement(By.xpath("//input[@name='agree']")).isSelected());
        
        if(driver.findElement(By.xpath("//input[@name='agree']")).isSelected()==false) {
        	driver.findElement(By.xpath("//input[@name='agree']")).click();
        }
        
        driver.close();
	}
	

}
