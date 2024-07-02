#Reporter : Azim Kaya
#US Priority : HIGH
  Feature: As a registered user, I would like to have a page on the site where I can select and manage my address information before completing the payment.

Scenario:TC-01:Delivery, Pick Up buttons should be visible and active on the Shipping Information page Order Summar order summary should be displayed Save & Pay button should be visible and active
  * User logs in "azimEmail".
  * Click on the product selected for processing.
  * It is verified that the Shipping Information is displayed.
  * Verify that the delivery button is displayed and active.
  * Verify that the pickUp button is displayed and active.
  * It is verified that the order summary is displayed.
  * Verify that the save and pay button is displayed and active.
    @AZ
Scenario:TC-02:Shipping Information page Shipping address information should be displayed, edited, new address should be added when Delivery button is clicked
  * User logs in "azimEmail".
  * Click on the product selected for processing.
  * It is verified that the Shipping Information is displayed.
  * Shipping address information is verified to be displayed.
  * Click the Delivery button.
  * It is verified that the shipping address information can be updated.
  * Shipping verifies that new address information can be added.



