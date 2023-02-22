package Winodw;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
public static void main (String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe"); 
	WebDriver wb = new ChromeDriver();
	wb.navigate().to("https://demoqa.com/browser-windows");
	Thread.sleep(2000);
	String Parent=wb.getWindowHandle();
	System.out.println(Parent);
	Robot rc=new Robot();
		wb.findElement(By.id("tabButton")).click();
	Thread.sleep(2000);
	rc.keyPress(KeyEvent.VK_CONTROL);
	rc.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	for (int i=0; i<3; i++);
	{
		wb.findElement(By.id("windowsButton")).click();
		Thread.sleep(2000);
	}
	}
	
	
}
