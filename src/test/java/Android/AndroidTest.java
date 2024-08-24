//package Android;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.Test;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class AndroidTest {
//    public static AndroidDriver driver;
//    @Test
//    public void initialize() throws MalformedURLException {
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi 11 Prime 5G");
//        caps.setCapability(MobileCapabilityType.UDID, "deugvkvwdydynvb6");
//        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//        caps.setCapability("appPackage", "com.trucklah.trucklah");
//        caps.setCapability("appActivity", "com.trucklah.trucklah.MainActivity");
//
//        try {
//            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
//            driver.quit();
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
