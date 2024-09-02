package itemShifting;

import base.BaseFile;
import commonMethods.ItemShiftingCommonMethods;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ItemShiftingTestTwo extends BaseFile {
    @BeforeTest
    public void openAndLogin() {
        try {
            BaseFile.openChrome();
            BaseFile.login("ItemShiftingTestTwoReport.html");
            test = report.createTest("Opening Chrome & Login");
            test.pass("Login Successful");
        } catch (Exception exception) {
            test.fail("Login Failed");
        }
    }

    @Test(priority = 1, description = "Test case one - To check cancel process of an order")
    public void cancelOrderCheck(){
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
        test = report.createTest("Cancel the booked order");
        try {
            boolean cancelStatus = ItemShiftingCommonMethods.cancelOrder();
            Assert.assertTrue(cancelStatus);
            if (cancelStatus) {
                test.pass("Order Cancelled successfully");
            }
        } catch (Exception exception) {
            test.fail("Cancel Failed");
            exception.printStackTrace();
        }
    }
    @Test(priority = 2,description = "Test Cae two - To check review function of cancelled order/booking")
    public void reviewCheck(){
        test = report.createTest("Review check for cancelled order");
        try {
            boolean reviewToasterDisplay = ItemShiftingCommonMethods.reviewOrder();
            Assert.assertTrue(reviewToasterDisplay);
            if (reviewToasterDisplay) {
                test.pass("Review added successfully");
            }
        }catch (Exception exception) {
            test.fail("Review add is Failed/Failure");
            exception.printStackTrace();
        }
    }

    @AfterTest
    public void close() {
        report.flush();
        //driver.close();
    }
}
