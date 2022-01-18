package com.anydoweb.pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.anydoweb.common.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskCreateWIthNotes extends BaseClass {

	@BeforeMethod
	public void before() {
		System.out.println("before start Test On Chrome Browser");
	}

	@Test(priority = 1)
	public void taskCreatedWithNotes() {
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

		// create task

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div/div/div[1]/div/button")).click();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(" My Friday Task");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/footer/button")).click();
		System.out.println("My friday Task created successfully....");

	}

	@Test(priority = 2)
	public void taskdWithNotes() {
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

		// task create with notes

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div/div/div[1]/div/button")).click();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(" My Friday Task" + " ");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div/div/div[2]/div/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/footer/button")).click();
		System.out.println("Task created with notes successfully....");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Finished Test On Chrome Browser");

	}
}
