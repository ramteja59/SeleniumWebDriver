package Learning;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RahulShetty {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver RS = new ChromeDriver();
		RS.manage().window().maximize();
		RS.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(2000);
		//RadioButton
WebElement a=RS.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[1]/input"));
Actions act =new Actions(RS);
act.click(a).build().perform();
Thread.sleep(2000);
WebElement b=RS.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input"));
act.click(b).build().perform();
Thread.sleep(2000);
WebElement c=RS.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[3]/input"));
act.click(c).build().perform();
Thread.sleep(2000);
//suggestion
Robot rc = new Robot();
	RS.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ind"); 
	Thread.sleep(2000);
	rc.keyPress(MenuKeyEvent.VK_DOWN); rc.keyPress(MenuKeyEvent.VK_DOWN);
	rc.keyPress(MenuKeyEvent.VK_ENTER);
//Drop down
RS.findElement(By.id("dropdown-class-example")).click();
rc.keyPress(MenuKeyEvent.VK_DOWN); rc.keyPress(MenuKeyEvent.VK_DOWN); 
rc.keyPress(MenuKeyEvent.VK_DOWN);
rc.keyPress(MenuKeyEvent.VK_ENTER);
Thread.sleep(2000);
//check box
RS.findElement(By.id("checkBoxOption1")).click();
RS.findElement(By.id("checkBoxOption2")).click();
RS.findElement(By.id("checkBoxOption1")).click();
Thread.sleep(2000);
//open Tab
RS.findElement(By.id("opentab")).click();
Thread.sleep(2000);
//open window
RS.findElement(By.id("openwindow")).click();
Thread.sleep(2000);
//Switch Tab to Alert
RS.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("RAM"); 
RS.findElement(By.xpath("//*[@id=\"alertbtn\"]")).click();
Thread.sleep(1000);
Alert alert = RS.switchTo().alert();
	Thread.sleep(2000);
	alert.accept(); Thread.sleep(1000);
RS.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("TEJA"); 
RS.findElement(By.xpath("//*[@id=\"alertbtn\"]")).click();
Thread.sleep(2000);
alert.accept(); Thread.sleep(2000);
rc.keyPress(KeyEvent.VK_PAGE_DOWN);
//hide show
RS.findElement(By.id("hide-textbox")).click(); 
Thread.sleep(3000);
RS.findElement(By.id("show-textbox")).click();
Thread.sleep(3000);
//scroll
JavascriptExecutor js =(JavascriptExecutor)RS;
js.executeScript("window.scroll(0,1200)");
RS.switchTo().frame(0);       
	js.executeScript("window.scrollBy(0,800)"); Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-800)"); Thread.sleep(2000);
	}
}
