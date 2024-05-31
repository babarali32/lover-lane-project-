package LoversLanePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LLCheckoutPage extends CommonMethods {

    @FindBy(xpath="//span[normalize-space()='Gift Card']")
    public WebElement giftCardBtn;

    @FindBy(xpath="//a[@class='btn btn-primary defaultLink']")
    public WebElement purchaseAGC;

    @FindBy(xpath="//a[@href='/giftcards-electronic']")
    public WebElement shopNowBtn;

    @FindBy(xpath="//select[@id='js-gift-card-price-select']")
    public WebElement priceDD;

    @FindBy(xpath="//li[1]//a[1]//img[1]")
    public WebElement giftCarDesign;


    @FindBy(xpath="//input[@id='NameToEGC']")
    public WebElement yourName;

    @FindBy(xpath="//input[@id='NameFromEGC']")
    public WebElement recipientName;

    @FindBy(xpath="//input[@id='RecipientEmailEGC']")
    public WebElement recipientEmail;

    @FindBy(xpath="//input[@id='RecipientEmailConfirmEGC']")
    public WebElement confirmRecipientEmail;

    @FindBy(xpath="//textarea[@id='MessageBodyEGC']")
    public WebElement msg;

    /*  @FindBy(xpath="//a[@title='S']")
      public WebElement selectSize;
      @FindBy(xpath="//a[@title='S']")
      public WebElement selectQuantity;*/
    @FindBy(xpath="//button[@id='btnAddToBag']")
    public WebElement addToBag;

    @FindBy(xpath="//a[@id='linkHeaderCartMobile']")
    public WebElement cartBtn;

    @FindBy(xpath="//a[@class='button-bag success-checkout']")
    public WebElement checkOutBtn;

    @FindBy(xpath="//input[@id='GuestEmail']")
    public WebElement guestEmail;


    @FindBy(xpath="//button[text()='Continue as guest']")
    public WebElement continueAsAGuestBtn;

    @FindBy(xpath="//input[@id='ShipFirstName']")
    public WebElement shippingFirstName;


    @FindBy(xpath="//input[@id='ShipLastName']")
    public WebElement shippingLastName;

    @FindBy(xpath="//input[@id='ShipAddress']")
    public WebElement shippingaddress;

    @FindBy(xpath="//input[@id='ShipCity']")
    public WebElement shippingCity;

    @FindBy(xpath="//select[@id='ShipStateOrProvince']")
    public WebElement shippingState;

    @FindBy(xpath="//input[@id='ShipPostalCode']")
    public WebElement shippingZipCode;

    @FindBy(xpath="//select[@id='ShipCountry']")
    public WebElement shippingCountry;

    @FindBy(xpath="//input[@id='ShipPhone']")
    public WebElement shippingPhone;

    @FindBy(xpath="//input[@id='ShipEmail']")
    public WebElement shippingEmail;


    /*   @FindBy(xpath="//div[@id='siteContainer']")
       public WebElement clickPayPal;*/
//
    @FindBy(xpath="//div[@aria-label='Debit or Credit Card']//div[@class='paypal-button-label-container']")
    public WebElement debitCard;
    ////div[@aria-label='Debit or Credit Card']//div[@class='paypal-button-label-container']
    @FindBy(xpath="//input[@id='email']")
    public WebElement emailDebit;

    @FindBy(xpath="//input[@name='CardNumber']")
    public WebElement cardNumber;

    @FindBy(xpath="//select[@id='CardMonth']")
    public WebElement cardMonth;

    @FindBy(xpath="//select[@id='CardYear']")
    public WebElement cardYear;

    @FindBy(xpath="//input[@id='CardCVV']")
    public WebElement cardCVV;


    @FindBy(xpath="//button[@id='btnPaymentContinue']")
    public WebElement continueCheckOut;

    @FindBy(xpath="//button[normalize-space()='Place Order']")
    public WebElement placeOrderBtn;

    @FindBy(xpath="//*[@class='page-title']")
    public WebElement orderComplete;




    @FindBy(xpath="//button[normalize-space()='Use selected address']")
    public WebElement useSelectedAddress;

    @FindBy(xpath="//a[@id='siteBrandTitle']//img[@alt=\"Lover's Lane\"]")
    public WebElement accessLLPage;
    @FindBy(xpath="//div[@class='minor-nav-hydra']")
    public WebElement verifyLLPage;
    @FindBy(xpath="//a[normalize-space()='Clearance']")
    public WebElement selectClearence;
    @FindBy(xpath="//a[@title='4PC ALICE IN WONDERLAND']//div[@class='category-badges']")
    public WebElement selectItem;

    public LLCheckoutPage() {

        PageFactory.initElements(driver, this);
    }
}
