#Reporter : Azim Kaya
#US Priority : HIGH
  Feature: As a registered user, I want to have a favorite products page on the site and I want to be able to manage this page.

Scenario:TC-01:Registered user should be able to see the Wishlist icon on the homepage and should be active categories icon should be able to see and should be active
  * User logs in "azimEmail".
  * Verify that added products are displayed.
  * Verify that the Wishlist icon is displayed.
  * Click on the Wish List icon and verify that it is active.
  * Verify that the categories icon is displayed.
  * Click on the categories icon and verify that it is active.


Scenario:TC-01:On the page selected from the Categorie subheadings, the favorite icon should be visible and active on the products, the desired product should be added to the favorite list
Products added on Wishlist page should be displayed
  * User logs in "azimEmail".
  * Click on the main page category icon.
  * Click on the men category product.
  * Verify that the Product Wish List icon is displayed and active.
  * The selected product is added to the favorite list.
  * The products added on the Wishlist page are displayed.
  * The product added to the Wish List page is verified as deleted.
