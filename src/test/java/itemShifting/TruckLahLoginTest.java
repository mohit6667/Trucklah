package itemShifting;

import base.BaseFile;
import base.EnvironmentsFile;
import constants.ItemShiftingConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import page.LoginPage;

import java.time.Duration;


public class TruckLahLoginTest extends BaseFile {
    @Test(priority = 1,description = "Login with Wrong email")
    public void login() throws InterruptedException {
        BaseFile.openChrome();
        driver.get(EnvironmentsFile.trucklahUrl);
        LoginPage.loginMenuButton.click();
        LoginPage.emailInput.sendKeys(ItemShiftingConstants.wrongEmail);
        LoginPage.passwordInput.sendKeys(EnvironmentsFile.loginPassword);
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("arguments[0].scrollIntoView(true);", LoginPage.emailInput);
        BaseFile.waitForOneSecond();
        LoginPage.loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(LoginPage.invalidUserToaster));
    }

    @Test(priority = 2,description = "Login with Wrong password")
    public void loginTwo() throws InterruptedException {
        driver.navigate().refresh();
        LoginPage.emailInput.sendKeys(EnvironmentsFile.loginEmail);
        LoginPage.passwordInput.sendKeys(ItemShiftingConstants.wrongPass);
        LoginPage.loginButton.click();
        BaseFile.waitForOneSecond();
    }

    @Test(priority = 3,description = "Login with Wrong email & password")
    public void loginThree() throws InterruptedException {

    }

    @Test(priority = 4,description = "Login with Valid email& password")
    public void loginFour() throws InterruptedException {

    }
}
