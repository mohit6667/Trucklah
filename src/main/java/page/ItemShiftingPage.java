package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class ItemShiftingPage {
    @FindBy(xpath = "//h3[text()='ITEM SHIFTING']")
    public static WebElement itemShiftingButton;
    @FindBy(name = "pickupLocation")
    public static WebElement pickupLocation;
    @FindBy(xpath = "//button[text()='Next']")
    public static WebElement locationNextButton;
    @FindBy(name = "address")
    public static WebElement addressInDialog;
    @FindBy(name = "contactName")
    public static WebElement contactNameInDialog;
    @FindBy(name = "mobile")
    public static WebElement mobileInDialog;
    @FindBy(name = "address")
    public static WebElement pickupAddress;
    @FindBy(name = "contactName")
    public static WebElement pickupContactName;
    @FindBy(name = "mobile")
    public static WebElement pickupMobileNo;
    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement nextButton;
    @FindBy(xpath = "//input[@name='dropLocation']")
    public static WebElement dropLocation;
    @FindBy(name = "address")
    public static WebElement dropAddress;
    @FindBy(name = "contactName")
    public static WebElement dropContactName;
    @FindBy(name = "mobile")
    public static WebElement dropMobileNo;
    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement nextDropButton;
    @FindBy(xpath = "//button[text()='Next']")
    public static WebElement nextScreen;
    @FindBy(xpath = "//input[@id='date']")
    public static WebElement serviceDate;
    @FindBy(xpath = "//input[@id='time']")
    public static WebElement serviceTime;
    @FindBy(xpath = "//input[@name='vechicleTypeId' and @id='flexRadioDefault1']/following::li[@data-index='6']")
    public static WebElement vehicleTypeRadio;
    @FindBy(name = "driverAsManpower")
    public static WebElement manPowerOption;
    @FindBy(xpath = "extraManpower")
    public static WebElement extraManPower;
    @FindBy(xpath = "//input[@name='trollyRequired']")
    public static WebElement trollyRequired;
    @FindBy(xpath = "//input[@name='roundTripRequired']")
    public static WebElement roundTrip;
    @FindBy(xpath = "//textarea[@id='exampleTextarea']")
    public static WebElement msgToDriver;
    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement nextSubmitButton;
    @FindBy(xpath = "//button[text()='Confirm and proceed with cash payment']")
    public static WebElement confirmButton;
    @FindBy(xpath = "//button[text()='Check Status']")
    public static WebElement checkStatusButton;
    @FindBy(xpath = "//button[text()='ITEM SHIFT']")
    public static WebElement itemShiftButton;
    @FindBy(xpath = "//div[@class='container-fluid']/following::a[contains(@href, 'ridedetailsview')]")
    public static List<WebElement> rowDataInOrders;
    @FindBy(xpath = "//a[contains(@href, 'ridedetailsview')]/div/div")
    public static List<WebElement> exactRowDataInOrders;
    @FindBy(xpath = "//span[text()='Booked']")
    public static WebElement bookedConfirmationText;
    @FindBy(xpath = "//button[@class='btn btn-primary mb-3']")
    public static WebElement addStopOne;
    @FindBy(xpath = "//input[@placeholder='Add more stops' and @value = '']")
    public static WebElement stopAddressBar;
    @FindBy(name = "stops")
    public static WebElement addStopOneText;
    @FindBy(name = "address")
    public static WebElement addStopOneAddress;
    @FindBy(name = "contactName")
    public static WebElement addStopOneContactName;
    @FindBy(name = "mobile")
    public static WebElement addStopOneMobileNo;
    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement addStopOneDropButton;
    @FindBy(xpath = "//input[@name='time']")
    public static WebElement bookingTimeInput;
    @FindBy(xpath = "//Button[text()='Book Rides']")
    public static WebElement bookRideButton;
    @FindBy(xpath = "//button[@class='btn']")
    public static WebElement profileButton;
    @FindBy(xpath = "//button[@class='btn logoutButton']")
    public static WebElement logoutButton;
    @FindBy(xpath = "//button[text()='Cancel']")
    public static WebElement cancelOrderButton;
    @FindBy(xpath = "//input[@type = 'radio' and @value='Driver is not allocated']")
    public static WebElement cancelRadioReasonOne;
    @FindBy(xpath = "//button[text()='Confirm']")
    public static WebElement cancelConfirmButton;
    @FindBy(xpath = "//h5[text()='Order Cancelled']")
    public static WebElement orderCancelledMessage;
    @FindBy(xpath = "//span[text()='MY ORDERS']")
    public static WebElement myOrdersTab;
    @FindBy(xpath = "//button[text()='CANCELLED']")
    public static WebElement cancelledTab;
    @FindBy(xpath = "//span[text()='Cancelled']")
    public static WebElement CancelConfirmationText;
    @FindBy(xpath = "//button[text()='Review']")
    public static WebElement reviewButton;
    @FindBy(xpath = "//*[@id=\"General\"]/div[2]/label[2]")
    public static WebElement starRatingButton;
    @FindBy(xpath = "//textarea[@name='reviewComments']")
    public static WebElement reviewCommentsBox;
    @FindBy(xpath = "//button[text()='Submit']")
    public static WebElement reviewSubmitButton;
    @FindBy(xpath = "//div[text()='Review updated']")
    public static WebElement reviewToaster;
    @FindBy(xpath = "//b[text()='Review By User:']")
    public static WebElement reviewByUserTab;
    @FindBy(xpath = "//button[text()='INPROGRESS']/span")
    public static WebElement inprogressCount;
    @FindBy(xpath = "//button[text()='COMPLETED']/span")
    public static WebElement completedCount;
    @FindBy(xpath = "//button[text()='CANCELLED']/span")
    public static WebElement cancelledCount;

}
