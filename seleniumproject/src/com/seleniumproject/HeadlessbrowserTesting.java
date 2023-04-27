package com.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessbrowserTesting {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrajendra\\eclipse-workspace\\automation-selenium-project\\seleniumproject\\driver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);
		options.addArguments("--headless");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		System.out.println("Title of the page:"+driver.getTitle());
	}

}
