package org.sample;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fb {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/home/ravin/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String url=driver.getTitle();
	System.out.println(url);
	WebElement usname=driver.findElement(By.xpath("//input[@id='email']"));
	usname.sendKeys("sshwanth");
	Actions acc=new Actions(driver);
	acc.doubleClick(usname).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_X);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_X);
	Thread.sleep(2000);
	WebElement psword=driver.findElement(By.xpath("//input[@id='pass']"));
	psword.click();
	Actions pswd=new Actions(driver);
	pswd.doubleClick(psword).perform();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	//driver.quit();
	
		
}
}
