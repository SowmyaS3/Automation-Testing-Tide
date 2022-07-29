package com.mindtree.seleniumclass;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

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

		driver.findElement(By.xpath("//*[@id=\"login-email\"]")).sendKeys("sowmya18b017@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"login-password\"]")).sendKeys("Sowmya@123");
		
		Set<String> page=driver.getWindowHandles();
		Iterator<String> sp = page.iterator();
		String sp1 = sp.next();
		String sp2 = sp.next();
		driver.switchTo().window(sp2);
		driver.findElement(By.xpath("//input[@class= 'active  submitBtn btn btn-primaryReceipt']")).click();
	}

}
