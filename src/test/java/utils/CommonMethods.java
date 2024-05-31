package utils;

import org.junit.Assert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public class CommonMethods extends pageInitializer  {
    public static WebDriver driver;

    public static void openBrowser() {
//        setup the chrome driver
//        using the webDriver manager dependency in the POM
//        we don't need to have a path or worry about the version of chromeDriver if we use this dependency

//        initiating the instance of chrome Driver
      /*  ChromeOptions ch = new ChromeOptions();
        if (ConfigReader.getProperty("Headless").equals("true")) {
            ch.addArguments("--headless=new");
        }
        ch.addArguments("--disable-notifications");*/
        //  driver = new ChromeDriver(ch);
        driver=new ChromeDriver();
        driver.manage().window().maximize();
//        implicit wait implemented at global level
//        will wait until the webElement is found
//        is global and only one declaration will be implemented throughout the project for each individual element
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT));
        InitializerPageObject();

    }


    public static void closeBrowser() {
        // driver.quit();
    }

    //we use this method instead of send keys method throughout the framework
    public static void sendText(WebElement element, String textToSend) {
        element.clear();
        element.sendKeys(textToSend);
    }

    //to get web-driver wait
    public static WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        return wait;
    }

    //this method will wait for the element to be clickable
    public static void waitForClickability(WebElement element) {
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }public static void pageLoadandClick(WebElement element)
    {
        if(getJSExecutor().executeScript("return document.readyState").equals("loaded")
                || getJSExecutor().executeScript("return document.readyState").equals("complete")==true){
            scrollIntoviewAndclick(element);
        }
    }


    //this method will perform click operation but before perform click, it will wait
    //for the element to be clickable
    public static void click(WebElement element) {
        waitForClickability(element);
        element.click();
    }

    //this method will return JavascriptExecutor Object

    public static JavascriptExecutor getJSExecutor() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;
    }

    //this function will perform click on element using javascript executor
    public static void jsClick(WebElement element) {
        getJSExecutor().executeScript("arguments[0].scrollIntoView;", element);
        getJSExecutor().executeScript("arguments[0].click();", element);
    }

    //selecting the dropdown using text
    public static void selectDropdown(WebElement element, String text) {
        Select s = new Select(element);
        s.selectByVisibleText(text);
    }

    public static void moveToElement(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }
    public static void scrollToelement(WebElement element){
        Actions actions=new Actions(driver);
        actions.scrollToElement(element).perform();

    }
    //to get current time
    public  static  String getCurrentdate(){
        Date currentDate=new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("MM/dd/yyyy");
        String getDate=dateFormat.format(currentDate);
        return getDate;

    }
    //to scroll Window
    public static void scrollWebsiteWindow(int x, int y) {
        getJSExecutor().executeScript("window.scrollBy(" + x + "," + y + ")");

    }
    //to scroll to an element
    public static void scrollintoview(WebElement element){
        getJSExecutor().executeScript("arguments[0].scrollIntoView();",element);
    }
    //to scroll and click  an element
    public static void scrollIntoviewAndclick(WebElement element) {
        getJSExecutor().executeScript("arguments[0].scrollIntoView();",element);
        getJSExecutor().executeScript("arguments[0].click();",element);

    }

    public static void subLinksVerification(List<WebElement> element1, WebElement element2,
                                            WebElement element3, String titleValue) {
        List<WebElement> list =  element1;
        for (int i = 0; i < list.size(); i++) {
            WebElement element = list.get(i);
            element.click();
            String expectedTitle = titleValue;
            String actualTitle = element2.getText();
            Assert.assertEquals(actualTitle, expectedTitle);
            driver.navigate().back();
            moveToElement(element3);
            list =  element1;


        }

    }

    public static void handleMultipleWindows(){
        String mainWindow=driver.getWindowHandle();
        Set<String> allWindowsHandle=driver.getWindowHandles();
        Iterator<String> it=allWindowsHandle.iterator();
        while(it.hasNext()){
            String handle=it.next();
            if(!mainWindow.equals(handle)){
                driver.switchTo().window(handle);
                driver.close();
            }

        }
    }
    //text assertion method
    public static void textAssertion(WebElement element, String data){
        String errorMessage=element.getText();
        boolean result=errorMessage.contains(data);
        Assert.assertTrue(result);
    }

    public static boolean isloadComplete(WebDriver driver)
    {
        return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("loaded")
                || ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
    }

}
