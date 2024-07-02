#Reporter : İhsan Altunışık
#US Priority : HIGH
  Feature: As a registered user, I would like to have a page in my Dashboard where I can view my shopping history
    Scenario: Registered user should have a page in Dashboard where user can view shopping history.
      * User logs in "ihsanEmail".
      * User navigates to Order History and views an order history detail.
      * User displays the receipt.
      * User navigates to back for 1 time.
      * User cancels the order and verifies that the order is canceled.
    Scenario:
      * User logs in "ihsanEmail".