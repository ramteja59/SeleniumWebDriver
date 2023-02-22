package Teja1122;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {
	public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
    WebDriver wb = new ChromeDriver();
    wb.navigate().to("https://www.amazon.in/");
}
}