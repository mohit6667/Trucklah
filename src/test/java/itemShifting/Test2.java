package itemShifting;

import base.BaseFile;
import constants.ItemShiftingConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.ItemShiftingPage;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Test2 extends BaseFile {
    @BeforeTest
    public void openAndLogin() throws InterruptedException {
        BaseFile.openChrome();
        BaseFile.login();
    }
    @Test
    public void itemShiftingBookingOne() throws InterruptedException, AWTException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("arguments[0].scrollIntoView(true);", ItemShiftingPage.itemShiftingButton);
        BaseFile.waitForOneSecond();
        ItemShiftingPage.itemShiftingButton.click();

        //Entering pickup location & further details
        scroll.executeScript("arguments[0].scrollIntoView(true);", ItemShiftingPage.pickupLocation);
        ItemShiftingPage.pickupLocation.sendKeys(ItemShiftingConstants.pickupLocation);
        BaseFile.waitForTwoSecond();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        BaseFile.waitForOneSecond();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
}
