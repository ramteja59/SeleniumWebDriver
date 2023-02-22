package Learning;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoQA {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver DQ = new ChromeDriver();
		DQ.manage().window().maximize();
		DQ.navigate().to("http://demoQA.com");
	Thread.sleep(5000);
		Robot rc=new Robot();
		 rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		 WebElement a=DQ.findElement(By.xpath("(//*[@class=\'card mt-4 top-card\'])[1]"));
		 Actions act =new Actions(DQ);
		 act.click(a).build().perform();
		 Thread.sleep(5000);
		 WebElement b=DQ.findElement(By.xpath("//*[@class=\'element-list collapse show\']/ul/li[1]"));
		 act.click(b).build().perform();
		 Thread.sleep(5000);
		 DQ.findElement(By.id("userName")).sendKeys("RamTeja");
		 DQ.findElement(By.id("userEmail")).sendKeys("ramteja@gmail.com");
		 DQ.findElement(By.id("currentAddress")).sendKeys("Hyderabad");
		 DQ.findElement(By.id("permanentAddress")).sendKeys("Hyderabad");
		 Thread.sleep(2000);
		 rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		 DQ.findElement(By.id("submit")).click();
		 Thread.sleep(5000);
		 rc.keyPress(KeyEvent.VK_PAGE_UP);
		 DQ.findElement(By.id("item-1")).click();
		 DQ.findElement(By.xpath("//*[@class=\'rct-checkbox\']")).click();	
		 Thread.sleep(5000);
		 rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		 DQ.findElement(By.id("item-2")).click();
		DQ.findElement(By.xpath("//*[@class=\'custom-control-label']")).click();
		Thread.sleep(5000);
		DQ.findElement(By.xpath("//*[@id=\"item-3\"]/span")).click();
		DQ.findElement(By.id("addNewRecordButton")).click();
		DQ.findElement(By.id("searchBox")).sendKeys("Alden");
		
	}

}
