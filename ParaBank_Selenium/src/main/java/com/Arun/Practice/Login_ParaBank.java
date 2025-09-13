package com.Arun.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_ParaBank {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		WebElement enter_Username = driver.findElement(By.xpath("//input[@name='username']"));
		
		enter_Username.sendKeys("john");
		
		WebElement enter_Password = driver.findElement(By.xpath("//input[@name='password']"));
		
		enter_Password.sendKeys("demo");
		
		WebElement click_Login_Button = driver.findElement(By.xpath("//input[@value='Log In']"));
		
		click_Login_Button.click();
		
		Thread.sleep(3000);
		
		
		

	}

}
