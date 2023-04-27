package com.seleniumproject;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessbrowserTestingjar {
	
	public static void main(String[] args) {
		HtmlUnitDriver driver=new HtmlUnitDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("Current Page url:"+driver.getCurrentUrl());
		
	}

}
