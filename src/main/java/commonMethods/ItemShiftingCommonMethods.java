package commonMethods;

import base.BaseFile;
import constants.ItemShiftingConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.ItemShiftingPage;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ItemShiftingCommonMethods extends BaseFile {
    public static boolean normalBooking() throws InterruptedException, AWTException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        //scroll.executeScript("arguments[0].scrollIntoView(true);", ItemShiftingPage.itemShiftingButton);
        // BaseFile.waitForOneSecond();
        ItemShiftingPage.itemShiftingButton.click();

        //Entering pickup location & further details
        scroll.executeScript("arguments[0].scrollIntoView(true);", ItemShiftingPage.pickupLocation);
        ItemShiftingPage.pickupLocation.sendKeys(ItemShiftingConstants.pickupLocation);
        BaseFile.waitForTwoSecond();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        BaseFile.waitForTwoSecond();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        ItemShiftingPage.pickupAddress.sendKeys(ItemShiftingConstants.pickupAddress);
        ItemShiftingPage.pickupContactName.sendKeys(ItemShiftingConstants.pickupContactName);
        ItemShiftingPage.pickupMobileNo.sendKeys(ItemShiftingConstants.pickupMobileNo);
        BaseFile.waitForTwoSecond();
        ItemShiftingPage.nextButton.click();
        BaseFile.waitForThreeSecond();

        //fill dropOff location
        ItemShiftingPage.dropLocation.sendKeys(ItemShiftingConstants.dropOffLocation);
        BaseFile.waitForTwoSecond();
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        BaseFile.waitForOneSecond();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        ItemShiftingPage.dropAddress.sendKeys(ItemShiftingConstants.dropAddress);
        ItemShiftingPage.dropContactName.sendKeys(ItemShiftingConstants.dropContactName);
        ItemShiftingPage.dropMobileNo.sendKeys(ItemShiftingConstants.dropMobileNumber);
        BaseFile.waitForTwoSecond();
        ItemShiftingPage.nextDropButton.click();
        BaseFile.waitForTwoSecond();
        ItemShiftingPage.nextScreen.click();
        // 2nd page
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(ItemShiftingPage.vehicleTypeRadio));
        scroll.executeScript("arguments[0].scrollIntoView(true);", ItemShiftingPage.manPowerOption);
        BaseFile.waitForOneSecond();
        ItemShiftingPage.manPowerOption.click();
        ItemShiftingPage.trollyRequired.click();
        ItemShiftingPage.msgToDriver.sendKeys(ItemShiftingConstants.driverMessage);
        scroll.executeScript("arguments[0].scrollIntoView(true);", ItemShiftingPage.vehicleTypeRadio);
        BaseFile.waitForOneSecond();
        ItemShiftingPage.vehicleTypeRadio.click();
        LocalTime currentTime = LocalTime.now();
        LocalTime newTime = currentTime.plusMinutes(3);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedCurrentTime = currentTime.format(formatter);
        String formattedNewTime = newTime.format(formatter);
        ItemShiftingPage.bookingTimeInput.sendKeys(formattedNewTime);
        BaseFile.waitForOneSecond();
        scroll.executeScript("arguments[0].scrollIntoView(true);", ItemShiftingPage.nextSubmitButton);
        BaseFile.waitForOneSecond();
        ItemShiftingPage.nextSubmitButton.click();

        //3rd page
        scroll.executeScript("arguments[0].scrollIntoView(true);", ItemShiftingPage.confirmButton);
        BaseFile.waitForOneSecond();
        ItemShiftingPage.confirmButton.click();
        BaseFile.waitForOneSecond();
        String getBookingId = driver.findElement(By.xpath("//span[@class='fw-bolder']")).getText();
        String[] bookingDetails = getBookingId.split(": ");
        String bookingId = bookingDetails[1];
        ItemShiftingPage.checkStatusButton.click();
        BaseFile.waitForOneSecond();
        ItemShiftingPage.itemShiftButton.click();
        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait4.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(@href, 'ridedetailsview')]/div/div"))));
        driver.findElement(By.xpath("//a[@href= '/ridedetailsview/" + bookingId + "']")).click();



      /*  List<WebElement> booking = driver.findElements(By.xpath("//a[contains(@href, 'ridedetailsview')]/div/div/div"));
        Thread.sleep(7000);
        for (WebElement book : booking) {
            System.out.println(book.getText());
            if (book.getText().equals("385.02")) {
                book.click();
                break;
            }
        }*/
        return ItemShiftingPage.bookedConfirmationText.isDisplayed();
    }

    public static boolean bookingWithStop(int stopCount) throws InterruptedException, AWTException {
        ItemShiftingPage.bookRideButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Thread.sleep(3000);
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        ItemShiftingPage.itemShiftingButton.click();
        //Entering pickup location & further details
        Thread.sleep(3000);
        scroll.executeScript("arguments[0].scrollIntoView(true);", ItemShiftingPage.pickupLocation);
        ItemShiftingPage.pickupLocation.sendKeys(ItemShiftingConstants.pickupLocation);
        BaseFile.waitForThreeSecond();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        BaseFile.waitForThreeSecond();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        ItemShiftingPage.pickupAddress.sendKeys(ItemShiftingConstants.pickupAddress);
        ItemShiftingPage.pickupContactName.sendKeys(ItemShiftingConstants.pickupContactName);
        ItemShiftingPage.pickupMobileNo.sendKeys(ItemShiftingConstants.pickupMobileNo);
        BaseFile.waitForTwoSecond();
        ItemShiftingPage.nextButton.click();
        int i = 0;
        int j = stopCount;
        String[] addresses = {"Viralimalai, Tamil Nadu 621316, India", "Tiruchirappalli, Tamil Nadu, India", "Chengalpattu, Tamil Nadu, India", "Tambaram, Chennai, Tamil Nadu, India", "Pallavaram, Chennai, Tamil Nadu, India"};
        String[] contacts = {"65897425", "75897425", "85897425", "95897425", "55897425"};


        for (i = 0; i < j; i++) {
            BaseFile.waitForThreeSecond();
            String address = addresses[i];
            String contact = contacts[i];
            ItemShiftingPage.addStopOne.click();
            ItemShiftingPage.stopAddressBar.sendKeys(address);
            BaseFile.waitForThreeSecond();
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.keyRelease(KeyEvent.VK_BACK_SPACE);
            BaseFile.waitForTwoSecond();
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            ItemShiftingPage.addStopOneAddress.sendKeys(ItemShiftingConstants.addStopOneAddress);
            ItemShiftingPage.addStopOneContactName.sendKeys(ItemShiftingConstants.addStopOneContactName);
            ItemShiftingPage.addStopOneMobileNo.sendKeys(contact);
            BaseFile.waitForTwoSecond();
            ItemShiftingPage.addStopOneDropButton.click();
            BaseFile.waitForThreeSecond();
        }
        BaseFile.waitForOneSecond();
        ItemShiftingPage.dropLocation.sendKeys(ItemShiftingConstants.dropOffLocation);
        BaseFile.waitForTwoSecond();
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        BaseFile.waitForOneSecond();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        ItemShiftingPage.dropAddress.sendKeys(ItemShiftingConstants.dropAddress);
        ItemShiftingPage.dropContactName.sendKeys(ItemShiftingConstants.dropContactName);
        ItemShiftingPage.dropMobileNo.sendKeys(ItemShiftingConstants.dropMobileNumber);
        BaseFile.waitForTwoSecond();
        ItemShiftingPage.nextDropButton.click();
        BaseFile.waitForTwoSecond();
        scroll.executeScript("arguments[0].scrollIntoView(true);", ItemShiftingPage.nextScreen);
        BaseFile.waitForOneSecond();
        ItemShiftingPage.nextScreen.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(ItemShiftingPage.vehicleTypeRadio));
        scroll.executeScript("arguments[0].scrollIntoView(true);", ItemShiftingPage.manPowerOption);
        BaseFile.waitForOneSecond();
        ItemShiftingPage.manPowerOption.click();
        ItemShiftingPage.trollyRequired.click();
        ItemShiftingPage.msgToDriver.sendKeys(ItemShiftingConstants.driverMessage);
        scroll.executeScript("arguments[0].scrollIntoView(true);", ItemShiftingPage.vehicleTypeRadio);
        BaseFile.waitForOneSecond();
        ItemShiftingPage.vehicleTypeRadio.click();
        LocalTime currentTime = LocalTime.now();
        LocalTime newTime = currentTime.plusMinutes(3);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedCurrentTime = currentTime.format(formatter);
        String formattedNewTime = newTime.format(formatter);
        ItemShiftingPage.bookingTimeInput.sendKeys(formattedNewTime);
        BaseFile.waitForOneSecond();
        scroll.executeScript("arguments[0].scrollIntoView(true);", ItemShiftingPage.nextSubmitButton);
        BaseFile.waitForOneSecond();
        ItemShiftingPage.nextSubmitButton.click();

        //3rd page
        scroll.executeScript("arguments[0].scrollIntoView(true);", ItemShiftingPage.confirmButton);
        BaseFile.waitForOneSecond();
        ItemShiftingPage.confirmButton.click();
        BaseFile.waitForOneSecond();
        String getBookingId = driver.findElement(By.xpath("//span[@class='fw-bolder']")).getText();
        String[] bookingDetails = getBookingId.split(": ");
        String bookingId = bookingDetails[1];
        ItemShiftingPage.checkStatusButton.click();
        BaseFile.waitForOneSecond();
        ItemShiftingPage.itemShiftButton.click();
        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait4.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(@href, 'ridedetailsview')]/div/div"))));
        driver.findElement(By.xpath("//a[@href= '/ridedetailsview/" + bookingId + "']")).click();

        return ItemShiftingPage.bookedConfirmationText.isDisplayed();

    }
}
