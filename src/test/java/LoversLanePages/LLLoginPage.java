package LoversLanePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LLLoginPage extends CommonMethods {

        @FindBy(xpath="//input[@id='username']")
        public WebElement userName;
        @FindBy(xpath ="//input[@id='password']")
        public WebElement password;
        @FindBy(xpath ="//input[@id='login']")
        public WebElement loginBtn;

        @FindBy(xpath ="//a[@id='siteBrandTitle']//img[@alt=\"Lover's Lane\"]")
        public WebElement homePageLogo;

        @FindBy(xpath ="//span[@id='message']")
        public WebElement loginErrorMsg;


        public LLLoginPage() {

                PageFactory.initElements(driver, this);
        }
}
