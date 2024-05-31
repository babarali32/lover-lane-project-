Feature: Checkout Flow for LL
  Background:
    * login page is loaded
    * user enters credentials and clicks login button
    * user is logged in

  @a @eGCPurchaseLL @LLRegression @LLSmoke @regression
  Scenario: eGift Card Purchase for LL(Guest)
    * I hover over Gift Cards
    * I select Purchase a Gift Card
    * I select Shop Now button for eGC
    * I select an amount for the eGC
    * I select a color for the eGC
    * I enter 'Elisa Automation' for Your Name(eGC)
    * I enter 'Automation' for Recipient Name(eGC)
    * I enter 'ealia@virid.com' for Recipient Email(eGC)
    * I enter 'ealia@virid.com' for Confirm Recipient Email(eGC)
    * I enter 'testing' for Message(eGC)
    * I click Add to Bag(eGC)
    * I click Shopping Bag icon
    * I click Checkout button for LL
    * I enter 'ealia@virid.com' for Guest(LL)
    * I click Continue as Guest button(LL)
    * I enter 'elisa' for FirstName(LL)
    * I enter 'Automation' for LastName(LL)
    * I enter '100 Beatties Ford Road' for Address(LL)
    * I enter 'Charlotte' for City(LL)
    * I select "North Carolina" for State(LL)
    * I enter '28216' for Zip(LL)
    * I enter '1234567890' for Phone(LL)
    * I select Visa as PaymentWith(LL)
    * I enter '4025240000000088' for CardNumber(LL)
    * I select a month for ExpirationDate(LL)
    * I select a year for ExpirationDate(LL)
    * I enter '555' for CVV(LL)
    * I click Continue Checkout button(LL)
    * I click Use Selected Address button
    * I click Place Order button(LL)
    * I verify Order is Complete(LL)

  @a @ProudctPurchaseLL @LLRegression @LLSmoke
  Scenario: Product Purchase for LL(Registered User)
    * I access Lovers Lane
    * I verify Lovers Lane Page shows
    * I click Login button for LL
    * I enter login information for LL
    * I verify I am logged into LL
    * I select Clearence for LL
    * I select an item from Clearence LL
    * I click Add to Bag(eGC)
    * I click Checkout button for LL
    * I select Visa as PaymentWith(LL)
    * I enter email for LL
    * I enter '1234567890' for Phone(LL)
    * I enter '4025240000000088' for CardNumber(LL)
    * I select a month for ExpirationDate(LL)
    * I select a year for ExpirationDate(LL)
    * I enter '555' for CVV(LL)
    * I click Continue Checkout button(LL)
    * I click Place Order button(LL)
    * I verify Order is Complete(LL)