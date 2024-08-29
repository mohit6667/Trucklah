package itemShifting;

import base.BaseFile;
import commonMethods.ItemShiftingCommonMethods;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;

public class ItemShiftingTestTwo extends BaseFile {
    @BeforeTest
    public void openAndLogin(){
        try {
            BaseFile.openChrome();
            BaseFile.login();
            test = report.createTest("Opening Chrome & Login");
            test.pass("Login Successful");
        }catch (Exception exception){
            test.fail("Login Failed");
        }
    }
    @Test
    public void cancelOrder() throws InterruptedException, AWTException {
        ItemShiftingCommonMethods.normalBooking();
        // code

    }
}
