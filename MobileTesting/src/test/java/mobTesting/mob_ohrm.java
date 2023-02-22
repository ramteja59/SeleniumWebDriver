package mobTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class mob_ohrm {
	AndroidDriver<AndroidElement> driver;
	@BeforeTest 
	public void BT() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	  dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	  dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Users\\tejaram\\eclipse-workspace\\MobileTesting\\chromedriver.exe");
	  driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	}
@Test
public void tc()
{
 driver.get("https://www.google.com");
 driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("demo orange hrm");
	Actions ac = new Actions(driver);
	ac.sendKeys(Keys.ENTER).build().perform();
	driver.findElement(By.partialLinkText("OrangeHRM Demo.")).click();
	
}
}
