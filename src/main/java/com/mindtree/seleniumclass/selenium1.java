package com.mindtree.seleniumclass;

import java.sql.DriverManager;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https:tide.com/en-us");
driver.manage().window().maximize();
driver.findElement(By.linkText("Register")).click();

driver.findElement(By.linkText("Sign up now")).click();

Set<String> pg=driver.getWindowHandles();
Iterator<String> sow = pg.iterator();
String sow1 = sow.next();
String sow2 = sow.next();
driver.switchTo().window(sow2);
driver.findElement(By.xpath("//button[contains(@class,'underline text-primaryCta lg:text-base leading')]")).click();


	}

}
