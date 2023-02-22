package mobTesting;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Hybrid extends capabilities {
	AndroidDriver<AndroidElement> driver;
	@Test(enabled = true)
	public void test3() throws MalformedURLException, InterruptedException {
		driver = khanapp(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(MobileBy.className("android.widget.TextView")).click();
		driver.findElement(MobileBy.AccessibilityId("Continue with Google")).click();      Thread.sleep(1000);
		driver.findElement(MobileBy.id("com.google.android.gms:id/account_name")).click();    Thread.sleep(1000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Join class\")")).click();   Thread.sleep(1000);
		driver.findElement(MobileBy.AccessibilityId("e.g. ABC123 or teacher@example.com")).sendKeys("ramteja599@gmail.com");    Thread.sleep(1000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"ADD\")"));   Thread.sleep(1000);

	}
}
