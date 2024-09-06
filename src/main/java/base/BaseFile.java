package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.ItemShiftingPage;
import page.LoginPage;

import java.time.Duration;

public class BaseFile {
    public static WebDriver driver;
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports report;
    public static ExtentTest test;

    public static void openChrome() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        PageFactory.initElements(driver, LoginPage.class);
        PageFactory.initElements(driver, ItemShiftingPage.class);
    }

    public static void login(String fileNameForReport) throws InterruptedException {
        driver.get(EnvironmentsFile.trucklahUrl);
        LoginPage.loginMenuButton.click();
        LoginPage.emailInput.sendKeys(EnvironmentsFile.loginEmail);
        LoginPage.passwordInput.sendKeys(EnvironmentsFile.loginPassword);
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("arguments[0].scrollIntoView(true);", LoginPage.emailInput);
        BaseFile.waitForOneSecond();
        LoginPage.loginButton.click();
        String filePath = "src/main/java/report/" + fileNameForReport;
        htmlReporter = new ExtentHtmlReporter(filePath);
        report = new ExtentReports();
        report.attachReporter(htmlReporter);
    }

    public static void waitForOneSecond() throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void waitForTwoSecond() throws InterruptedException {
        Thread.sleep(2000);
    }

    public static void waitForFourSecond() throws InterruptedException {
        Thread.sleep(4000);
    }

    public static void waitForThreeSecond() throws InterruptedException {
        Thread.sleep(3000);
    }

    public static void waitForSixSecond() throws InterruptedException {
        Thread.sleep(6000);
    }

    public static void waitForTenSecond() throws InterruptedException {
        Thread.sleep(10000);
    }

    public static boolean loginTest(String email, String password, WebElement toaster) {
        driver.navigate().refresh();
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("arguments[0].scrollIntoView(true);", LoginPage.emailInput);
        LoginPage.emailInput.sendKeys(email);
        LoginPage.passwordInput.sendKeys(password);
        LoginPage.loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(toaster));
        return toaster.isDisplayed();
    }
}
