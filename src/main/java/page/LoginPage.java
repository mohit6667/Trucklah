package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(xpath = "//a[text()='LOGIN']")
    public static WebElement loginMenuButton;
    @FindBy(xpath = "//input[@name='username']")
    public static WebElement emailInput;
    @FindBy(xpath = "//input[@name='password']")
    public static WebElement passwordInput;
    @FindBy(xpath = "//button[text()='Login']")
    public static WebElement loginButton;
    @FindBy(xpath = "//div[text()='Invalid Username']")
    public static WebElement invalidUserToaster;
    @FindBy(xpath = "//div[text()='Invalid Username or wrong Password entered']")
    public static WebElement invalidPasswordToaster;
    @FindBy(xpath = "//div[text()='Login Successful!']")
    public static WebElement loginSuccessToaster;
}
