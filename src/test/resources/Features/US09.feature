#Reporter : İhsan Altunışık
#US Priority : MEDIUM
  Feature: As a user, I want to be able to access detailed information about the product I have selected on the page
    Background:
      * User clicks on the product and verifies that he-she navigated to the product page.

      Scenario: When Details button is clicked, Product Details title and product information should be displayed
        * User displays product header and context.

      Scenario: When clicking the Videos button, the Product Videos title and product videos should be displayed
        * User displays the Product Videos title and product videos.

      Scenario: When the Review button is clicked, the Review title and reviews of the product should be displayed
        * User displays the Review title and reviews of the product.

      Scenario: When the Shipping&Return button is clicked, the Shipping&Return heading and the shipping and return conditions of the product should be displayed
        * User displays the Shipping&Return heading and the shipping and return conditions.