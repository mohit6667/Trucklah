package itemShifting;

import base.BaseFile;
import base.EnvironmentsFile;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import constants.ItemShiftingConstants;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import page.LoginPage;

public class TruckLahLoginTest extends BaseFile {
    @Test(priority = 1, description = "Login with invalid email")
    public void login() {
        try {
            htmlReporter = new ExtentHtmlReporter("src/main/java/report/LoginTestReport.html");
            report = new ExtentReports();
            report.attachReporter(htmlReporter);
            BaseFile.openChrome();
            driver.get(EnvironmentsFile.trucklahUrl);
            test = report.createTest("Test with invalid email");
            LoginPage.loginMenuButton.click();
            boolean toasterDisplay = BaseFile.loginTest(ItemShiftingConstants.wrongEmail, EnvironmentsFile.loginPassword, LoginPage.invalidUserToaster);
            Assert.assertTrue(toasterDisplay);
            if (toasterDisplay) {
                test.pass("Test Passed");
            }
        } catch (Exception exception) {
            test.fail("Test Failed");
        }

    }

    @Test(priority = 2, description = "Login with invalid password")
    public void loginTwo() {
        try {
            test = report.createTest("Test with invalid password");
            boolean toasterDisplay = BaseFile.loginTest(EnvironmentsFile.loginEmail, ItemShiftingConstants.wrongPass, LoginPage.invalidPasswordToaster);
            Assert.assertTrue(toasterDisplay);
            if (toasterDisplay) {
                test.pass("Test Passed");
            }
        } catch (Exception e) {
            test.fail("Test Failed");
        }
    }

    @Test(priority = 3, description = "Login with invalid email & password")
    public void loginThree() {
        try {
            test = report.createTest("Test with invalid email and password");
            boolean toasterDisplay = BaseFile.loginTest(ItemShiftingConstants.wrongEmail, ItemShiftingConstants.wrongPass, LoginPage.invalidUserToaster);
            Assert.assertTrue(toasterDisplay);
            if (toasterDisplay) {
                test.pass("Test Passed");
            }
        } catch (Exception e) {
            test.fail("Test Failed");
        }
    }

    @Test(priority = 4, description = "Login with Valid email & password")
    public void loginFour() {
        try {
            test = report.createTest("Login with valid email and password");
            boolean toasterDisplay = BaseFile.loginTest(EnvironmentsFile.loginEmail, EnvironmentsFile.loginPassword, LoginPage.loginSuccessToaster);
            Assert.assertTrue(toasterDisplay);
            if (toasterDisplay) {
                test.pass("Test Passed");
            }
        } catch (Exception e) {
            test.fail("Test Failed");
        }
    }

    @AfterTest
    public void close() {
        report.flush();
        driver.close();
    }
}




