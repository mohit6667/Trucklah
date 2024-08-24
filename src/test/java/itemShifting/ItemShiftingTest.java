package itemShifting;

import base.BaseFile;
import commonMethods.ItemShiftingCommonMethods;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.awt.*;

public class ItemShiftingTest extends BaseFile {
    @BeforeTest
    public void openAndLogin() throws InterruptedException {
        BaseFile.openChrome();
        BaseFile.login();
        test = report.createTest("Opening Chrome & Login");
    }

    /*@Test(priority = 1, description = "Test Case 1 - Normal Item Shifting with 0 stops")
    public void itemShiftingBookingOne() throws InterruptedException, AWTException {
        test = report.createTest("Item Shifting with 0 stops");
        try {
            boolean bookingOutput = ItemShiftingCommonMethods.normalBooking();
            Assert.assertTrue(bookingOutput);
            if (bookingOutput) {
                test.pass("Booking Created");
                //System.out.println("Booking Successful");
            }
        } catch (Exception exception) {
            test.fail("Booking Failed");
            exception.printStackTrace();
        }
    }*/

    @Test(priority = 2, description = "Test case 2 - Item Shiftings with 1 stop",enabled = true)
    public void itemShiftingBookingTwo() throws InterruptedException, AWTException {
        // amudha
        ItemShiftingCommonMethods.bookingWithStop(1);
    }

    @Test(priority = 3, description = "Test case 3 - Item Shiftings with 2 stops",enabled = false)
    public void itemShiftingBookingThree() throws InterruptedException, AWTException {
        //anitha
        ItemShiftingCommonMethods.bookingWithStop(2);
    }

   /* @Test(priority = 4, description = "Test case 4 - Item Shiftings with 3 stops")
    public void itemShiftingBookingFour() {
        //nithya
        ItemShiftingCommonMethods.bookingWithStop(3);
    }

    @Test(priority = 5, description = "Test case 5 - Item Shiftings with 4 stops")
    public void itemShiftingBookingFive() {
        //dhana
        ItemShiftingCommonMethods.bookingWithStop(4);
    }

    @Test(priority = 6, description = "Test case 6 - Item Shiftings with 5 stops")
    public void itemShiftingBookingSix() {
        //varija
        ItemShiftingCommonMethods.bookingWithStop(5);
    }*/

    @AfterTest
    public void logout(){
        //driver.close();
        report.flush();
    }
}
