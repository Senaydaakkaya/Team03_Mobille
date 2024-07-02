#Reporter : İhsan Altunışık
#US Priority : HIGHEST
  Feature: As a registered user, I want to have a payment page where I can pay for my orders that I control.
    Scenario: Registered user should be able to choose payment method.
      * User logs in "ihsanEmail".
      * User clicks on the product and verifies that he-she navigated to the product page.
      * User adds the product to the cart and displays the cart.
      * User proceeds to checkout.
      * User selects stripe payment method and enters the credentials

    Scenario: Registered user should be able to place orders via payment method.