package Calculations;

import base.BaseFile;
import base.EnvironmentsFile;
import constants.ItemShiftingConstants;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import page.LoginPage;

public class ItemShiftCalculations extends BaseFile {
    @BeforeTest
    public void openAndLogin() {
        try {
            test = report.createTest("Admin Login");
            boolean toasterDisplay = BaseFile.loginTest(EnvironmentsFile.AdminMail, EnvironmentsFile.AdminPassword, LoginPage.loginSuccessToaster);
            Assert.assertTrue(toasterDisplay);
            if (toasterDisplay) {
                test.pass("Test Passed");
            }
        } catch (Exception e) {
            test.fail("Test Failed");
        }
    }
}
