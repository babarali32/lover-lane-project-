package LoversLaneStep;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

import static utils.pageInitializer.llLoginPage;

public class LLLogin extends CommonMethods {

    @Given("login page is loaded")
    public void login_page_is_loaded() {
        driver.get(ConfigReader.getProperty("loversLaneURL"));
    }

    @Given("user enters credentials and clicks login button")
    public void user_enters_credentials_and_clicks_login_button() {

        login(ConfigReader.getProperty("loversLaneUserName"), ConfigReader.getProperty("loverslanePassword"));
    }


    @Given("user is logged in")
    public void user_is_logged_in() {
        Assert.assertTrue(llLoginPage.homePageLogo.isDisplayed());
    }

    @Given("user enters Invalid password and clicks login button")
    public void user_enters_invalid_password_and_clicks_login_button() {
        login(ConfigReader.getProperty("loversLaneUserName"), "123");
    }

    @Given("user enters invalid userName and clicks login button")
    public void user_enters_invalid_user_name_and_clicks_login_button() {
        login("123", ConfigReader.getProperty("loverslanePassword"));
    }


    @Given("user enters invalid userName and invalid password and clicks login button")
    public void user_enters_invalid_user_name_and_invalid_password_and_clicks_login_button() {
        login("", "");
    }

    @Given("user gets error msg")
    public void user_gets_error_msg() {
        String actual = llLoginPage.loginErrorMsg.getText();
        String expected = "Login failed. Please check your user name and password and try again.";
        Assert.assertEquals("Didn't get the expected error msg", actual, expected);
    }

    private static void login(String userName, String password) {
        llLoginPage.userName.sendKeys(userName);
        llLoginPage.password.sendKeys(password);
        llLoginPage.loginBtn.click();
    }
}
