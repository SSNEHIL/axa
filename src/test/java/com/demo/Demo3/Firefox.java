package com.demo.Demo3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class Firefox {

	public static void main(String[] args) {

//		FirefoxDriverManager.getInstance().setup();
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.google.com");
		ChromeDriverManager.getInstance().setup();
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.google.com");
	}

}
