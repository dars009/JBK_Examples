package com.Testng_Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest1111 {
	WebDriver wd = null;

	@BeforeClass
	public void setEnv() {
		wd = new FirefoxDriver();
	}

	@AfterSuite
	public void closeeverything() {
		wd.close();
	}

	@Test
	public void blank() {
		wd.findElement(By.id("email"));
		System.out.println(12);
	}

	@Test
	public void specials() {
		WebDriver wd = new FirefoxDriver();
		System.out.println(78);
		wd.close();
	}
}
