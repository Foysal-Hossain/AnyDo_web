package com.anydoweb.pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TagAndAssertion {
	public static WebDriver driver;

	@BeforeMethod
	public void before() {
		System.out.println("before start Test On Chrome Browser");
	}

	@Test
	public void tagAssertion() {
		try {
			String expectedbtnTxt = "No thanks";

			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get("https://desktop.any.do/");

			driver.findElement(By.className("AppLoginButton--email")).click();
			System.out.println("We are currently on the following URL" + driver.getCurrentUrl());

			driver.findElement(By.xpath("//*[@type=\"text\"]")).clear();
			driver.findElement(By.xpath("//*[@type=\"text\"]")).click();
			driver.findElement(By.xpath("//*[@type=\"text\"]")).sendKeys("emonafzal35@gmail.com");
			driver.findElement(By.className("AppLoginEmailLoginTab__emailIconButton")).click();
			driver.findElement(By.xpath("//*[@type=\"password\"]")).clear();
			driver.findElement(By.xpath("//*[@type=\"password\"]")).click();
			driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("emonafzal35");
			driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();

			driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div/div/div[1]/div/button")).click();
//	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[2]/div/button/span[2]")).click();
			driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("My daily Task");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/footer/button")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div/div/div[3]/div/div/button[1]/span[3]"))
					.click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/footer/button")).click();
			WebElement noThanks = driver
					.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div/div/div[4]/div/div[4]/button[2]"));
			Assert.assertEquals(true, noThanks.isDisplayed());
			System.out.println("No Thanks is displayed passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Finished Test On Chrome Browser");
	}

}