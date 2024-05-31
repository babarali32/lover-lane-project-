package LoversLaneStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class LLCheckout extends CommonMethods {


    @Given("I hover over Gift Cards")
    public void i_hover_over_gift_cards() {
        llCheckoutPage.giftCardBtn.click();
    }

    @Then("I select Purchase a Gift Card")
    public void i_select_purchase_a_gift_card() {
        llCheckoutPage.purchaseAGC.click();
    }

    @Then("I select Shop Now button for eGC")
    public void i_select_shop_now_button_for_e_gc() {
        moveToElement( llCheckoutPage.shopNowBtn);
        jsClick(llCheckoutPage.shopNowBtn);
    }

    @Then("I select an amount for the eGC")
    public void i_select_an_amount_for_the_e_gc() {
        new Select(llCheckoutPage.priceDD).selectByIndex(1);

    }

    @Then("I select a color for the eGC")
    public void i_select_a_color_for_the_e_gc() {
        llCheckoutPage.giftCarDesign.click();
    }

    @Then("I enter {string} for Your Name\\(eGC)")
    public void i_enter_for_your_name_e_gc(String string) {
        llCheckoutPage.yourName.sendKeys(string);
    }

    @Then("I enter {string} for Recipient Name\\(eGC)")
    public void i_enter_for_recipient_name_e_gc(String string) {
        llCheckoutPage.recipientName.sendKeys(string);
    }

    @Then("I enter {string} for Recipient Email\\(eGC)")
    public void i_enter_for_recipient_email_e_gc(String string) {
        llCheckoutPage.recipientEmail.sendKeys(string);
    }

    @Then("I enter {string} for Confirm Recipient Email\\(eGC)")
    public void i_enter_for_confirm_recipient_email_e_gc(String string) {
        llCheckoutPage.confirmRecipientEmail.sendKeys(string);
    }

    @Then("I enter {string} for Message\\(eGC)")
    public void i_enter_for_message_e_gc(String string) {
        llCheckoutPage.msg.sendKeys(string);
    }

    @Then("I click Add to Bag\\(eGC)")
    public void i_click_add_to_bag_e_gc() {
        /*moveToElement( llCheckoutPage.addToBag);
        jsClick( llCheckoutPage.addToBag);*/

        // llCheckoutPage.selectSize.click();
        // llCheckoutPage.selectQuantity.sendKeys("1");
        llCheckoutPage.addToBag.click();

    }

    @Then("I click Shopping Bag icon")
    public void i_click_shopping_bag_icon() {
        llCheckoutPage.cartBtn.click();
    }

    @Then("I click Checkout button for LL")
    public void i_click_checkout_button_for_ll() {
        scrollWebsiteWindow(0,700);

        click(llCheckoutPage.checkOutBtn);
    }

    @Then("I enter {string} for Guest\\(LL)")
    public void i_enter_for_guest_ll(String string) {
        llCheckoutPage.guestEmail.sendKeys(string);
    }

    @Then("I click Continue as Guest button\\(LL)")
    public void i_click_continue_as_guest_button_ll() {
        llCheckoutPage.continueAsAGuestBtn.click();
    }

    @Then("I enter {string} for FirstName\\(LL)")
    public void i_enter_for_first_name_ll(String string) {
        llCheckoutPage.shippingFirstName.sendKeys(string);
    }

    @Then("I enter {string} for LastName\\(LL)")
    public void i_enter_for_last_name_ll(String string) {
        llCheckoutPage.shippingLastName.sendKeys(string);
    }

    @Then("I enter {string} for Address\\(LL)")
    public void i_enter_for_address_ll(String string) {
        llCheckoutPage.shippingaddress.sendKeys(string);
    }

    @Then("I enter {string} for City\\(LL)")
    public void i_enter_for_city_ll(String string) {
        llCheckoutPage.shippingCity.sendKeys(string);
    }

    @Then("I select {string} for State\\(LL)")
    public void i_select_for_state_ll(String string) {
        //new Select( llCheckoutPage.shippingState).getOptions().forEach(x-> System.out.println(x.getText()));
        new Select( llCheckoutPage.shippingState).selectByVisibleText(string);
    }

    @Then("I enter {string} for Zip\\(LL)")
    public void i_enter_for_zip_ll(String string) {
        llCheckoutPage.shippingZipCode.sendKeys(string);
    }


    @Then("I enter {string} for Phone\\(LL)")
    public void i_enter_for_phone_ll(String string) {
        llCheckoutPage.shippingPhone.sendKeys(string);
    }

    @Then("I select Visa as PaymentWith\\(LL)")
    public void i_select_visa_as_payment_with_ll() {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,650)","");
        llCheckoutPage.debitCard.click();
    }

    @Then("I enter email for LL")
    public void i_enter_email_for_ll() {
        llCheckoutPage.emailDebit.click();
        llCheckoutPage.emailDebit.sendKeys("elisabeta.aliaa@gmail.com");
    }
    @Then("I enter {string} for CardNumber\\(LL)")
    public void i_enter_for_card_number_ll(String string) {
        llCheckoutPage.cardNumber.sendKeys(string);
    }

    @Then("I select a month for ExpirationDate\\(LL)")
    public void i_select_a_month_for_expiration_date_ll() {
        new Select( llCheckoutPage.cardMonth).selectByIndex(4);
    }

    @Then("I select a year for ExpirationDate\\(LL)")
    public void i_select_a_year_for_expiration_date_ll() {
        new Select( llCheckoutPage.cardYear).selectByIndex(4);
    }

    @Then("I enter {string} for CVV\\(LL)")
    public void i_enter_for_cvv_ll(String string) {
        llCheckoutPage.cardCVV.sendKeys(string);
    }

    @Then("I click Continue Checkout button\\(LL)")
    public void i_click_continue_checkout_button_ll() {
        llCheckoutPage.continueCheckOut.click();
    }

    @Then("I click Use Selected Address button")
    public void i_click_use_selected_address_button() {
        llCheckoutPage.useSelectedAddress.click();
    }

    @Then("I click Place Order button\\(LL)")
    public void i_click_place_order_button_ll() {
        llCheckoutPage.placeOrderBtn.click();
    }

    @Then("I verify Order is Complete\\(LL)")
    public void i_verify_order_is_complete_ll() {
        Assert.assertTrue(llCheckoutPage.orderComplete.isDisplayed());
    }


    @Given("I verify Lovers Lane Page shows")
    public void i_verify_lovers_lane_page_shows() {
        Assert.assertTrue(llCheckoutPage.accessLLPage.isDisplayed());
    }
    @Then("I access Lovers Lane")
    public void i_access_lovers_lane() {
        Assert.assertTrue(llCheckoutPage.verifyLLPage.isDisplayed());
    }

    @Then("I select Clearence for LL")
    public void i_select_clearence_for_ll() {
        llCheckoutPage.selectClearence.click();
    }
    @Then("I select an item from Clearence LL")
    public void i_select_an_item_from_clearence_ll() {
        llCheckoutPage.selectItem.click();
    }


}
