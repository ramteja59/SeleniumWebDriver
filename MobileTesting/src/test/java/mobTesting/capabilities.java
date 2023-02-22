package mobTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class capabilities {
	public static AndroidDriver<AndroidElement> khanapp() throws MalformedURLException{  // cap is method name it stores the values under method
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("uiautomator2ServerInstallTimeout", 30000);
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,  "e3054b0b");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.khanacademy.android");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.khanacademy.android.ui.library.MainActivity");
        AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
        return driver;
    }
}
