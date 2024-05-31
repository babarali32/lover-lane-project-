package LoversLaneStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;
import utils.ConfigReader;

import java.util.ArrayList;
import java.util.List;

import static utils.pageInitializer.llInfoVerificationPage;

public class LLHomePageVerifications extends CommonMethods {

    @Given("I search for {string} in Lovers Lane")
    public void i_search_for_in_lovers_lane(String string) {
        click(llInfoVerificationPage.search);
    }

    @And("I click Store Hours link")
    public void iClickStoreHoursLink() {
        click(llInfoVerificationPage.storeBtn);
    }

    @Then("I verify user can see Store locations and hours")
    public void iVerifyUserCanSeeStoreLocationsAndHours() {
        List<WebElement> storeTimings= llStorePage.storeTimings;
        Assert.assertEquals("Timings for some stores are changed",271,storeTimings.size());

    }

    @And("I click FREE Standard Shipping link")
    public void iClickFREEStandardShippingLink() {
        System.out.println(llInfoVerificationPage.shippingLink.getText());
        Assert.assertEquals("FREE STANDARD SHIPPING $69+",llInfoVerificationPage.shippingLink.getText());

    }

    @And("I click Login button for LL")
    public void iClickLoginButtonForLL() {
        llInfoVerificationPage.clickLoginButton.click();
    }

    @And("I enter login information for LL")
    public void iEnterLoginInformationForLL() {
        login(ConfigReader.getProperty("loversLaneLoginEmail"), ConfigReader.getProperty("loverslaneLoginPassword"));
    }

    @Then("I verify I am logged into LL")
    public void iVerifyIAmLoggedIntoLL() {
        System.out.println(llInfoVerificationPage.loginVerification.getText());
        Assert.assertEquals("Profile",llInfoVerificationPage.loginVerification.getText());
    }

    @Then("I click {string} for LL")
    public void i_click_for_ll(String llAccount, io.cucumber.datatable.DataTable dataTable) {
        List<String> profileItems=dataTable.asList();
        List<WebElement> profile=llInfoVerificationPage.profileMenu;
        for(int i=0;i<profileItems.size();i++){
            Assert.assertEquals("Tab didn't match",profileItems.get(i),profile.get(i).getText());
        }
    }

    @And("I hover over Sex Toys")
    public void iHoverOverSexToys() {
        Actions actions=new Actions(driver);
        actions.moveToElement(llInfoVerificationPage.clickSexToys).perform();
    }

    @And("I hover over Lingerie")
    public void iHoverOverLingerie() {
        Actions actions=new Actions(driver);
        actions.moveToElement(llInfoVerificationPage.lingerie).perform();
    }

    @And("I hover over Curvy")
    public void iHoverOverCurvy() {
        Actions actions=new Actions(driver);
        actions.moveToElement(llInfoVerificationPage.curvyEverything).perform();
    }

    @And("I hover over Web Exclusives")
    public void iHoverOverWebExclusives() {
        Actions actions=new Actions(driver);
        actions.moveToElement(llInfoVerificationPage.webExclusives).perform();
    }

    @And("I hover over Hosiery Accessories")
    public void iHoverOverAccessories() {
        Actions actions=new Actions(driver);
        actions.moveToElement(llInfoVerificationPage.hosieryAccessories).perform();
    }


    @And("I hover over Bridal Romantic Gifts")
    public void iHoverOverBridal() {
        Actions actions=new Actions(driver);
        actions.moveToElement(llInfoVerificationPage.bridalRomanticGifts).perform();
    }

    @And("I hover over Costumes Role Play")
    public void iHoverOverRolePlay() {
        Actions actions=new Actions(driver);
        actions.moveToElement(llInfoVerificationPage.costumesRolePlay).perform();
    }

    @And("I hover over Mens Wear")
    public void iHoverOverMensWear() {
        Actions actions=new Actions(driver);
        actions.moveToElement(llInfoVerificationPage.mensWear).perform();
    }



    @And("I select SubCatLingerie for Lingeries")
    public void iSelectSubCatLingerieForLingeries(io.cucumber.datatable.DataTable dataTable) {
        List<String> lingerieItems=dataTable.asList();
        List<WebElement> lingeries =llInfoVerificationPage.clickLingerieSubCat;
        for (int i = 0; i < lingeries.size(); i++) {
            WebElement lingery = lingeries.get(i);
            Actions actions = new Actions(driver);
            actions.moveToElement(lingery).perform();
            Assert.assertEquals("Tab didn't match",lingerieItems.get(i),lingeries.get(i).getText());
        }
    }

    @And("I select SubCatCurvy for Curvy")
    public void iSelectSubCatCurvyForCurvy(io.cucumber.datatable.DataTable dataTable) {
        List<String> curvyieItems=dataTable.asList();
        System.out.println(curvyieItems);
        List<WebElement> curvy =llInfoVerificationPage.clickCurvySubCat;
        for (int i = 0; i < curvy.size(); i++) {
            WebElement curvySub =curvy.get(i);
            Actions actions = new Actions(driver);
            actions.moveToElement(curvySub).perform();
            System.out.println(curvySub.getText());
            Assert.assertEquals("Tab didn't match",curvyieItems.get(i),curvy.get(i).getText());
        }
    }

    @And("I select Lingerie for Web Exclusive for LL")
    public void iSelectLingerieForWebExclusiveForLL() {
        llInfoVerificationPage.selectLingerie.click();
    }


    @And("I select Bodystockings for Web Exclusive for LL")
    public void iSelectBodystockingsForWebExclusiveForLL() {
        llInfoVerificationPage.selectBodyStocking.click();
    }

    @And("I select Curvy for Web Exclusive for LL")
    public void iSelectCurvyForWebExclusiveForLL() {
        llInfoVerificationPage.selectCurvy.click();
    }
    @And("I select Clubwear for Web Exclusive for LL")
    public void iSelectClubwearForWebExclusiveForLL() {
        llInfoVerificationPage.selectClubwear.click();
    }
    @And("I select Entertainer for Web Exclusive for LL")
    public void iSelectEntertainerForWebExclusiveForLL() {
        llInfoVerificationPage.selectEntertainer.click();
    }
    @And("I select Fetish Wear for Web Exclusive for LL")
    public void iSelectFetishWearForWebExclusiveForLL() {
        llInfoVerificationPage.selectFetishWear.click();
    }
    @And("I select Pajamas & Loungewear for Web Exclusive for LL")
    public void iSelectPajamasAndLoungewearForWebExclusiveForLL() {
        llInfoVerificationPage.selectPajamas.click();
    }
    @And("I select Panties for Web Exclusive for LL")
    public void iSelectPantiesrForWebExclusiveForLL() {
        llInfoVerificationPage.selectPanties.click();
    }
    @And("I select Peek a Boo for Web Exclusive for LL")
    public void iSelectPeekaBooForWebExclusiveForLL() {
        llInfoVerificationPage.selectPeakaBoo.click();
    }
    @And("I select Costumes for Web Exclusive for LL")
    public void iSelectCostumesForWebExclusiveForLL() {
        llInfoVerificationPage.selectCostumes.click();
    }
    @And("I select Shapewear for Web Exclusive for LL")
    public void iSelectShapewearForWebExclusiveForLL() {
        llInfoVerificationPage.selectShapewear.click();
    }
    @And("I select Swimwear for Web Exclusive for LL")
    public void iSelectSwimwearForWebExclusiveForLL() {
        llInfoVerificationPage.selectSwimwear.click();
    }
    @And("I select All Online Exclusives for Web Exclusive for LL")
    public void iSelectAllOnlineExclusivesForWebExclusiveForLL() {
        llInfoVerificationPage.selectAllOnline.click();
    }


    @And("I select SubCatAccessories for Accessories")
    public void iSelectSubCatAccessoriesForAccessories(io.cucumber.datatable.DataTable dataTable) {
        List<String> hoiseryItems=dataTable.asList();
        List<WebElement> accesseries =llInfoVerificationPage.clickAccessoriesSubCat;
        for (int i = 0; i < accesseries.size(); i++) {
            WebElement accesseriesSub =accesseries.get(i);
            Actions actions = new Actions(driver);
            actions.moveToElement(accesseriesSub).perform();
            Assert.assertEquals("Tab didn't match",hoiseryItems.get(i),accesseries.get(i).getText());
        }
    }



    @And("I select Adult Gifts & Bags for Bridal")
    public void iSelectAdultGiftsagsForBridal() {
        llInfoVerificationPage.selectAdultGifts.click();
    }
    @And("I select Bachelorette Party Supplies for Bridal")
    public void iSelectBachelorettePartySuppliesForBridal() {
        llInfoVerificationPage.selectBachelorette.click();
    }
    @And("I select Bath & Body for Bridal")
    public void iSelectBathBodyForBridal() {
        llInfoVerificationPage.selectBath.click();
    }
    @And("I select Books for Bridal")
    public void iSelectBooksForBridal() {
        llInfoVerificationPage.selectBook.click();
    }
    @And("I select Branded Gifts for Bridal")
    public void iSelectBrandedGiftsForBridal() {
        llInfoVerificationPage.selectBrandedGifts.click();
    }
    @And("I select Candles for Bridal")
    public void iSelectCandlesForBridal() {
        llInfoVerificationPage.selectCandles.click();
    }
    @And("I select Cards for Bridal")
    public void iSelectCardsForBridal() {
        llInfoVerificationPage.selectCards.click();
    }
    @And("I select Games for Bridal")
    public void iSelectGamesForBridal() {
        llInfoVerificationPage.selectGames.click();
    }
    @And("I select Gifts Card for Bridal")
    public void iSelectGiftsCardForBridal() {
        llInfoVerificationPage.selectGiftCards.click();
    }
    @And("I select Love Kits for Bridal")
    public void iSelectLoveKitsForBridal() {
        llInfoVerificationPage.selectLoveKits.click();
    }
    @And("I select Pheromones for Bridal")
    public void iSelectPheromonesForBridal() {
        llInfoVerificationPage.selectPheromones.click();
    }
    @And("I select Pride for Bridal")
    public void iSelectPridesForBridal() {
        llInfoVerificationPage.selectPride.click();
    }
    @And("I select Stimulation and Prolonging for Bridal")
    public void iSelectStimulationProlongingForBridal() {
        llInfoVerificationPage.selectStimulationProlonging.click();
    }
    @And("I select Supplements and Aphrodisiacs for Bridal")
    public void iSelectSupplementsAphrodisiacsForBridal() {
        llInfoVerificationPage.selectSupplementsAphrodisiac.click();
    }
    @And("I select TasttyTreats for Bridal")
    public void iSelectTasttyTreatsForBridal() {
        llInfoVerificationPage.selectTasttyTreats.click();
    }
    @And("I select All Bridal for Bridal")
    public void iSelectAllBridalsForBridal() {
        llInfoVerificationPage.selectAllBridal.click();
    }


    @And("I select Costumes discount Costumes for Role Play")
    public void iSelectCostumesDiscountCostumesForRolePlay() {
        llInfoVerificationPage.selectFiveCostumes.click();
    }
    @And("I select Curvy Roleplay for Role Play")
    public void iSelectCurvyRoleplayorRolePlay() {
        llInfoVerificationPage.selectCurvyRolePlay.click();
    }
    @And("I select Men's Roleplay for Role Play")
    public void iSelectMensRoleplayorRolePlay() {
        llInfoVerificationPage.selectMensRolePlay.click();
    }
    @And("I select Women's Roleplay for Role Play")
    public void iSelectWomensRoleplayorRolePlay() {
        llInfoVerificationPage.selectWomensRolePlay.click();
    }
    @And("I select All Roleplay for Role Play")
    public void iSelectAllRoleplayorRolePlay() {
        llInfoVerificationPage.selectAllRolePlay.click();
    }

    @And("I select SubCatMensWear for Mens Wear")
    public void iSelectSubCatMensWearforMensWear(io.cucumber.datatable.DataTable dataTable) {
        List<String> meansWearItems=dataTable.asList();
        List<WebElement> mensSub =llInfoVerificationPage.selectMeansWearSub;
        for (int i = 0; i < mensSub.size(); i++) {
            WebElement mensAccesseries =mensSub.get(i);
            Actions actions = new Actions(driver);
            actions.moveToElement(mensAccesseries).perform();
            Assert.assertEquals("Tab didn't match",meansWearItems.get(i),mensSub.get(i).getText());
        }
    }
    @And("I select SubCatRomanticGifts for Romantic Gifts")
    public void IselectSubCatRomanticGiftsforRomanticGifts(io.cucumber.datatable.DataTable dataTable) {
        List<String> romanticGiftsItems=dataTable.asList();
        List<WebElement> subCatRomanticGifts =llInfoVerificationPage.selectBridalRomanticSub;
        for (int i = 0; i < subCatRomanticGifts.size(); i++) {
            WebElement bridalAccesseries =subCatRomanticGifts.get(i);
            Actions actions = new Actions(driver);
            actions.moveToElement(bridalAccesseries).perform();
            Assert.assertEquals("Tab didn't match",romanticGiftsItems.get(i),subCatRomanticGifts.get(i).getText());
        }
    }
    @And("I select SubCatCostumes for Costumes")
    public void IselectSubCatCostumesforCostumes(io.cucumber.datatable.DataTable dataTable) {
        List<String> costumesItems=dataTable.asList();
        List<WebElement> subCatCostumes =llInfoVerificationPage.selectCostumeSub;
        for (int i = 0; i < subCatCostumes.size(); i++) {
            WebElement costumesAccesseries =subCatCostumes.get(i);
            Actions actions = new Actions(driver);
            actions.moveToElement(costumesAccesseries).perform();
            Assert.assertEquals("Tab didn't match",costumesItems.get(i),subCatCostumes.get(i).getText());
        }
    }

    @And("I scroll down on page LL")
    public void iScrollDownOnPageLL() {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)","");
    }

    @And("I click Romance & Relationship link")
    public void iClickRomanceRelationshipLink() {
        llInfoVerificationPage.clickRomanceRelationshipLink.click();
    }

    @Then("I verify Romance & Relationship link is working")
    public void iVerifyRomanceRelationshipLinkIsWorking() {
        llInfoVerificationPage.verifykRomanceRelationshipLink.isDisplayed();
    }

    @And("I click Fetish & Fantasy link")
    public void iClickFetishFantasyLink() {llInfoVerificationPage.fetishFunLink.click();
    }

    @Then("I verify Fetish & Fantasy link is working")
    public void iVerifyFetishFantasyLinkIsWorking() {llInfoVerificationPage.verifyFetishFunLink.isDisplayed();
    }

    @And("I click Tips & Tricks link")
    public void iClickTipsTricksLink() {llInfoVerificationPage.tipsTrickLink.click();
    }

    @Then("I verify Tips & Tricks link is working")
    public void iVerifyTipsTricksLinkIsWorking() {llInfoVerificationPage.verifyTipsTrickLink.isDisplayed();
    }
    @Given("I click Fashion & Fun")
    public void iClickFashionFun() {
        llInfoVerificationPage.fashionFunLink.click();
    }
    @Then("I verify Fashion & Fun link is working")
    public void iVerifyFashionFunLinkIsWorking() {
        llInfoVerificationPage.verifyFashionFunLink.isDisplayed();
    }

    @And("I click Tantalizing Toys")
    public void iClickTantalizingToys() {
        llInfoVerificationPage.tantalizingToysLink.click();
    }

    @Then("I verify Tantalizing Toys link is working")
    public void iVerifyTantalizingToysLinkIsWorking() {
        llInfoVerificationPage.verifyTantalizingToysLink.isDisplayed();
    }

    @And("I click Sexual Zodiac")
    public void iClickSexualZodiac() {
    }

    @Then("I verify Sexual Zodaic link is working")
    public void iVerifySexualZodaicLinkIsWorking() {
    }

    @And("I click Sexual Wellness")
    public void iClickSexualWellness() {
        llInfoVerificationPage.sexualWellnessLink.click();
    }

    @Then("I verify Sexual Wellness link is working")
    public void iVerifySexualWellnessLinkIsWorking() {
        llInfoVerificationPage.verifySexualWellnessLink.isDisplayed();
    }


    @Then("I click ShoppingLink for LL")
    public void iClickShoppingLinkforLL(io.cucumber.datatable.DataTable dataTable) {
        List<String> shopingItems=dataTable.asList();
        List<WebElement> subCaShoping =llInfoVerificationPage.clickShoping;
        for (int i = 0; i < subCaShoping.size(); i++) {
            WebElement shopingAccesseries =subCaShoping.get(i);
            Actions actions = new Actions(driver);
            actions.moveToElement(shopingAccesseries).perform();
            Assert.assertEquals("Tab didn't match",shopingItems.get(i),subCaShoping.get(i).getText());
        }
    }
    @Then("I click CustomerServiceLink for LL")
    public void iClickCustomerServiceLinkforLL(io.cucumber.datatable.DataTable dataTable) {
        List<String> serviceItems=dataTable.asList();
        List<WebElement> customerService =llInfoVerificationPage.clickCustomerService;
        for (int i = 0; i < customerService.size(); i++) {
            WebElement cusSer =customerService.get(i);
            Actions actions = new Actions(driver);
            actions.moveToElement(cusSer).perform();
            Assert.assertEquals("Tab didn't match",serviceItems.get(i),customerService.get(i).getText());
        }
    }
    @Then("I click AboutUsLink for LL")
    public void iClickAboutUsLinkLinkforLL(io.cucumber.datatable.DataTable dataTable) {
        List<String> aboutUsItems=dataTable.asList();
        List<WebElement> aboutUs =llInfoVerificationPage.clickAboutUs;
        for (int i = 0; i < aboutUs.size(); i++) {
            Assert.assertEquals("Tab didn't match",aboutUsItems.get(i),aboutUs.get(i).getText());
        }
    }
    @And("I enter {string} for LL email sign up")
    public void iEnterTestTestComForLLEmailSignUp(String arg0) {
        llInfoVerificationPage.joiningEmail.sendKeys(arg0);
    }

    @And("I click on Join button LL")
    public void IClickOnJoinButtonLL() {
        llInfoVerificationPage.clickJoinButton.click();
    }

    @And("I click Sign Up button LL")
    public void iClickSignUpButtonLL() {
        llInfoVerificationPage.clickRadioButton.click();
        llInfoVerificationPage.enterFirstName.sendKeys("Alisa");
        llInfoVerificationPage.enterSecondName.sendKeys("A");
        llInfoVerificationPage.enterGender.click();
        llInfoVerificationPage.ageVerification.click();
        llInfoVerificationPage.signUpButton.click();
    }

    @Then("I verify user is subscribed to LL")
    public void iVerifyUserIsSubscribedToLL() {
        llInfoVerificationPage.userSubscribed.getText();
    }
    @Given("I click on stores LL")
    public void i_click_on_stores_ll() {
        llInfoVerificationPage.clickStores.click();
    }

    @Given("I verify the store page")
    public void i_verify_the_store_page() {
        llInfoVerificationPage.verifyStores.isDisplayed();

    }
    private static void login(String enterEmail, String enterPassword) {
        llInfoVerificationPage.enterEmail.sendKeys(enterEmail);
        llInfoVerificationPage.enterPassword.sendKeys(enterPassword);
        llInfoVerificationPage.loginButton.click();
    }

    @Given("I navigate to the homepage logo of LL website is displayed")
    public void i_navigate_to_the_homepage_logo_of_ll_website_is_displayed() {
        llInfoVerificationPage.logo.isDisplayed();
        System.out.println(llInfoVerificationPage.logo.isDisplayed());
    }

    @Given("I verify all the tabs are displayed")
    public void i_verify_all_the_tabs_are_displayed(io.cucumber.datatable.DataTable dataTable) {
        List<String> expectedTabs=dataTable.asList();
        List<WebElement> dashboardTabs=driver.findElements(By.xpath("//ul[@role='menu']"));
        List<String> actualTabs=new ArrayList<>();

        for (WebElement webElement:dashboardTabs){
            String text=webElement.getText();
            actualTabs.add(text);
            System.out.println(text);

            // Assert.assertEquals(expectedTabs,actualTabs);
        }

    }
}

