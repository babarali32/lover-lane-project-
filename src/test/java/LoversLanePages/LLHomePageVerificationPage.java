package LoversLanePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class LLHomePageVerificationPage extends CommonMethods {

    @FindBy(id = "txtSiteSearchNav")
    public WebElement search;
    @FindBy(xpath = "//span[@class='nav-link-label'][normalize-space()='Stores']")
    public WebElement storeBtn;
    @FindBy(xpath = "(//strong[normalize-space()='Free Standard Shipping $69+'])[1]")
    public WebElement shippingLink;
    @FindBy(xpath = "//span[normalize-space()='Login']")
    public WebElement clickLoginButton;
    @FindBy(xpath = "//input[@id='LoginEmail']")
    public WebElement enterEmail;
    @FindBy(xpath = "//input[@id='LoginPassword']")
    public WebElement enterPassword;
    @FindBy(xpath = "//button[@id='btnSubmitLogin']")
    public WebElement loginButton;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[2]/header[1]/h1[1]")
    public WebElement loginVerification;
    @FindBy(xpath = "//ul[@id='accountNavMenu']/li")
    public List<WebElement> profileMenu;
    @FindBy(xpath = "//a[contains(text(),'Sex Toys')]")
    public WebElement clickSexToys;
    @FindBy(xpath = "//a[@href='/categories/Lingerie-and-Apparel']")
    public WebElement lingerie;
    @FindBy(xpath = "//a[contains(text(),'Everything')]")
    public WebElement curvyEverything;
    @FindBy(xpath = "//a[contains(text(),'Web')]")
    public WebElement webExclusives;
    @FindBy(xpath = "//a[@href='/categories/Sexy-Accessories']")
    public WebElement hosieryAccessories;
    @FindBy(xpath = "//a[@href='/categories/Essentials']")
    public WebElement bridalRomanticGifts;
    @FindBy(xpath = "//a[@href='/categories/role-play']")
    public WebElement costumesRolePlay;
    @FindBy(xpath = "//a[contains(text(),'Mens Wear')]")
    public WebElement mensWear;
    @FindBy(xpath = "//a[@href='/categories/Lingerie-and-Apparel']")
    public List <WebElement> clickLingerieSubCat;
    @FindBy(xpath = "//body[1]/div[1]/nav[1]/div[1]/ul[1]/li[7]/ul[1]/li")
    public List <WebElement> clickCurvySubCat;

    @FindBy(xpath = "//a[@role='menuitem'][normalize-space()='Lingerie']")
    public WebElement selectLingerie;
    @FindBy(xpath = "(//a[@role='menuitem'][normalize-space()='Bodystockings'])")
    public WebElement selectBodyStocking;

    @FindBy(xpath = "//a[@role='menuitem'][normalize-space()='Curvy']")
    public WebElement selectCurvy;
    @FindBy(xpath = "//a[@role='menuitem'][normalize-space()='Clubwear']")
    public WebElement selectClubwear;
    @FindBy(xpath = "//a[@role='menuitem'][normalize-space()='Entertainer']")
    public WebElement selectEntertainer;
    @FindBy(xpath = "//a[@role='menuitem'][normalize-space()='Fetish Wear']")
    public WebElement selectFetishWear;
    @FindBy(xpath = "//a[@role='menuitem'][normalize-space()='Pajamas & Loungewear']")
    public WebElement selectPajamas;
    @FindBy(xpath = "//li[8]//ul[1]//li[8]//a[1]")
    public WebElement selectPanties;
    @FindBy(xpath = "//a[@role='menuitem'][normalize-space()='Peek a Boo']")
    public WebElement selectPeakaBoo;
    @FindBy(xpath = "//a[normalize-space()='Costumes']")
    public WebElement selectCostumes;
    @FindBy(xpath = "//li[8]//ul[1]//li[11]//a[1]")
    public WebElement selectShapewear;
    @FindBy(xpath = "//a[@href='/category/shop-web-exclusives-swimwear']")
    public WebElement selectSwimwear;
    @FindBy(xpath = "//a[normalize-space()='All Online Exclusives']")
    public WebElement selectAllOnline;
    @FindBy(xpath = "//li[9]//ul[1]//li[1]")
    public List <WebElement> clickAccessoriesSubCat;
    @FindBy(xpath = "//a[normalize-space()='Adult Gifts & Bags']")
    public WebElement selectAdultGifts;
    @FindBy(xpath = "//a[normalize-space()='Bachelorette Party Supplies']")
    public WebElement selectBachelorette;
    @FindBy(xpath = "//a[normalize-space()='Bath & Body']")
    public WebElement selectBath;
    @FindBy(xpath = "//a[normalize-space()='Books']")
    public WebElement selectBook;
    @FindBy(xpath = "//a[normalize-space()='Branded Gifts']")
    public WebElement selectBrandedGifts;
    @FindBy(xpath = "//a[normalize-space()='Candles']")
    public WebElement selectCandles;
    @FindBy(xpath = "//a[normalize-space()='Cards']")
    public WebElement selectCards;
    @FindBy(xpath = "//a[normalize-space()='Games']")
    public WebElement selectGames;
    @FindBy(xpath = "//a[@role='menuitem'][normalize-space()='Gift Cards']")
    public WebElement selectGiftCards;
    @FindBy(xpath = "//a[normalize-space()='Love Kits']")
    public WebElement selectLoveKits;
    @FindBy(xpath = "//a[normalize-space()='Pheromones']")
    public WebElement selectPheromones;
    @FindBy(xpath = "//a[normalize-space()='Pride']")
    public WebElement selectPride;
    @FindBy(xpath = "//a[normalize-space()='Stimulants & Prolonging']")
    public WebElement selectStimulationProlonging;
    @FindBy(xpath = "//a[normalize-space()='Supplements & Aphrodisiacs']")
    public WebElement selectSupplementsAphrodisiac;
    @FindBy(xpath = "//a[normalize-space()='Tasty Treats']")
    public WebElement selectTasttyTreats;
    @FindBy(xpath = "//a[@href='/category/shop-bridal-romantic-gifts-all']")
    public WebElement selectAllBridal;
    @FindBy(xpath = "//a[normalize-space()='$5 Costumes']")
    public WebElement selectFiveCostumes;
    @FindBy(xpath = "//a[normalize-space()='Curvy Roleplay']")
    public WebElement selectCurvyRolePlay;
    @FindBy(xpath = "//a[@href='/category/shop-role-play-for-him']")
    public WebElement selectMensRolePlay;
    @FindBy(xpath = "//a[@href='/category/role-play-costumes']")
    public WebElement selectWomensRolePlay;
    @FindBy(xpath = "//a[normalize-space()='All Role Play']")
    public WebElement selectAllRolePlay;

    @FindBy(xpath = "//li[11]//ul[1]//li")
    public List <WebElement> selectMeansWearSub;
    @FindBy(xpath = "//body[1]/div[1]/nav[1]/div[1]/ul[1]/li[10]/ul[1]/li")
    public List <WebElement> selectBridalRomanticSub;
    @FindBy(xpath = "//body[1]/div[1]/nav[1]/div[1]/ul[1]/li[6]/ul[1]/li")
    public List <WebElement> selectCostumeSub;
    @FindBy(xpath = "//img[@alt='Romance and Relationships']")
    public WebElement clickRomanceRelationshipLink;
    @FindBy(xpath = "//img[@class='attachment-full size-full wp-image-715']")
    public WebElement verifykRomanceRelationshipLink;
    @FindBy(xpath = "//img[@alt='Fetish and Fantasy']")
    public WebElement fetishFunLink;
    @FindBy(xpath = "//h1[@class='elementor-heading-title elementor-size-default']//a[@href='https://intimacyadvisor.com/category/fetish-and-fantasy/']")
    public WebElement verifyFetishFunLink;
    @FindBy(xpath = "//img[@alt='Tips & Tricks']")
    public WebElement tipsTrickLink;
    @FindBy(xpath = "//h1[@class='elementor-heading-title elementor-size-default']//a[@href='https://intimacyadvisor.com/category/tips-and-tricks/']")
    public WebElement verifyTipsTrickLink;
    @FindBy(xpath = "//img[@alt='Fashion & Fun']")
    public WebElement fashionFunLink;
    @FindBy(xpath = "(//a[@href='https://intimacyadvisor.com/category/fashion-and-fun/'])[1]")
    public WebElement verifyFashionFunLink;
    @FindBy(xpath = "//img[@alt='Tantalizing Toys']")
    public WebElement tantalizingToysLink;
    @FindBy(xpath = "(//a[@href='https://intimacyadvisor.com/category/tantalizing-toys/'])[1]")
    public WebElement verifyTantalizingToysLink;
    @FindBy(xpath = "//img[@alt='Sexual Wellness']")
    public WebElement sexualWellnessLink;
    @FindBy(xpath = "(//a[@href='https://intimacyadvisor.com/category/sexual-health/'])[1]")
    public WebElement verifySexualWellnessLink;
    @FindBy(xpath = "//ul[@id='281']//li")
    public List <WebElement> clickShoping;
    @FindBy(xpath = "//ul[@id='9']//li")
    public List <WebElement> clickCustomerService;
    @FindBy(xpath = "//ul[@id='10']//li//a")
    public List <WebElement> clickAboutUs;
    @FindBy(xpath = "//input[@id='mailingListEmail']")
    public  WebElement joiningEmail;
    @FindBy(xpath = "//button[normalize-space()='Join']")
    public  WebElement clickJoinButton;
    @FindBy(xpath = "//input[@value='7b33f25bdb-de841f1375']")
    public  WebElement clickRadioButton;
    @FindBy(xpath = "//input[@id='FirstName']")
    public  WebElement  enterFirstName;
    @FindBy(xpath = "//input[@id='LastName']")
    public  WebElement  enterSecondName;
    /*   @FindBy(xpath = "//input[@id='EmailAddress']")
       public  WebElement  enterEmailAddress;*/
    @FindBy(xpath = "//option[@value='Female']")
    public  WebElement  enterGender;

    @FindBy(xpath = "//input[@id='AgeVerification']")
    public  WebElement  ageVerification;
    @FindBy(xpath = "//button[normalize-space()='Sign up']")
    public  WebElement  signUpButton;
    @FindBy(xpath = "//h4[@class='panel-title']")
    public  WebElement  userSubscribed;
    @FindBy(xpath = "//span[normalize-space()='Stores']")
    public  WebElement  clickStores;
    @FindBy(xpath = "/(//span[@class='nav-link-label'][normalize-space()='Stores'])[1]")
    public  WebElement  verifyStores;
    @FindBy(id="siteBrandTitle")
    public WebElement logo;
    @FindBy(xpath = "//ul[@role='menu']")
    public WebElement dashBoardTabs;
    public LLHomePageVerificationPage() {
        PageFactory.initElements(driver, this);
    }

}

