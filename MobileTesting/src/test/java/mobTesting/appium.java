package mobTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class appium {
	AndroidDriver<WebElement> wd;
	@BeforeTest
	public void bt() throws MalformedURLException
	{
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Users\\tejaram\\eclipse-workspace\\MobileTesting\\chromedriver.exe");
	wd=new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	//wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void t1()
	{
		wd.get("https://www.google.com/");
	}
}
