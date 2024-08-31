package itemShifting;

import base.BaseFile;
import commonMethods.ItemShiftingCommonMethods;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.ItemShiftingPage;


import java.awt.*;

public class ItemShiftingTest extends BaseFile {
    @BeforeTest
    public void openAndLogin() throws InterruptedException {
        BaseFile.openChrome();
        BaseFile.login("ItemShiftingTestReport.html");
        test = report.createTest("Opening Chrome & Login");
        test.pass("Login Successful");
    }

    @Test(priority = 1, description = "Test Case 1 - Normal Item Shifting with 0 stops")
    public void itemShiftingBookingOne() {
        test = report.createTest("Item Shifting with 0 stops");
        try {
            boolean bookingOutput = ItemShiftingCommonMethods.normalBooking();
            Assert.assertTrue(bookingOutput);
            if (bookingOutput) {
                test.pass("Booking Created with 0 stop");
            }
        } catch (Exception exception) {
            test.fail("Booking Failed");
            exception.printStackTrace();
        }
    }

    @Test(priority = 2, description = "Test case 2 - Item Shiftings with 1 stop")
    public void itemShiftingBookingTwo() {
        // amudha
        test = report.createTest("Item Shifting with 1 stop");
        try {
            boolean bookingOutput = ItemShiftingCommonMethods.bookingWithStop(1);
            Assert.assertTrue(bookingOutput);
            if (bookingOutput) {
                test.pass("Booking Created with 1 stop");
            }
        } catch (Exception exception) {
            test.fail("Booking Failed");
            exception.printStackTrace();
        }
    }

    @Test(priority = 3, description = "Test case 3 - Item Shiftings with 2 stops")
    public void itemShiftingBookingThree() {
        //anitha
        test = report.createTest("Item Shifting with 2 stops");
        try {
            boolean bookingOutput = ItemShiftingCommonMethods.bookingWithStop(2);
            Assert.assertTrue(bookingOutput);
            if (bookingOutput) {
                test.pass("Booking Created with 2 stops");
            }
        } catch (Exception exception) {
            test.fail("Booking Failed");
            exception.printStackTrace();
        }
    }

    @Test(priority = 4, description = "Test case 4 - Item Shiftings with 3 stops")
    public void itemShiftingBookingFour() {
        //nithya
        test = report.createTest("Item Shifting with 3 stops");
        try {
            boolean bookingOutput = ItemShiftingCommonMethods.bookingWithStop(3);
            Assert.assertTrue(bookingOutput);
            if (bookingOutput) {
                test.pass("Booking Created with 3 stops");
            }
        } catch (Exception exception) {
            test.fail("Booking Failed");
            exception.printStackTrace();
        }

    }

    @Test(priority = 5, description = "Test case 5 - Item Shiftings with 4 stops")
    public void itemShiftingBookingFive() {
        //dhana
        test = report.createTest("Item Shifting with 4 stops");
        try {
            boolean bookingOutput = ItemShiftingCommonMethods.bookingWithStop(4);
            Assert.assertTrue(bookingOutput);
            if (bookingOutput) {
                test.pass("Booking Created with 4 stops");
            }

        } catch (Exception exception) {
            test.fail("Booking Failed");
            exception.printStackTrace();
        }

    }

    @Test(priority = 6, description = "Test case 6 - Item Shiftings with 5 stops")
    public void itemShiftingBookingSix() throws InterruptedException, AWTException {
        //varija
        test = report.createTest("Item Shifting with 5 stops");
        try {
            boolean bookingOutput = ItemShiftingCommonMethods.bookingWithStop(5);
            Assert.assertTrue(bookingOutput);
            if (bookingOutput) {
                test.pass("Booking Created with 5 stops");
            }
        } catch (Exception exception) {
            test.fail("Booking Failed");
            exception.printStackTrace();
        }

    }

    @AfterTest
    public void logout() throws InterruptedException {
        BaseFile.waitForOneSecond();
        ItemShiftingPage.profileButton.click();
        ItemShiftingPage.logoutButton.click();
        driver.close();
        report.flush();
    }
}