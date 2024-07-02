#Reporter : Hümeyra Tayfun
#US Priority : HIGH
  Feature: As a user, I would like to be able to see the categories and products of the Men menu on the home page.
    @10
    Scenario: TC01 Men category window should be visible and active in the home page body section.
             Add to cart should be possible on the products on the men category page.
      * User displays men category window and clicks on it
      * User chooses adidas3-stripes cushioned crew sock product
      * Verify that chosen product is visible
      * User chooses black color
      * User clicks on Add to Card button
      * Verfy that user added product to add to cart

      Scenario: TC02 Add to wishlist should be possible on the products on the men category page.
        * User displays men category window and clicks on it
        * User chooses adidas3-stripes cushioned crew sock product
        * Verify that chosen product is visible
        * User chooses black color
        * User clicks on Add to Wishlist button
        * Verfy that user added product to add to Wishlist
    @11
        Scenario: TC03 Filtering icons should be visible and active on the products on the men category page
          * User displays men category window and clicks on it
          * User displays filter icon and clicks on it
          * User displays sort by,clicks on it and chooses price high to low
          * User clicks on filter icon
          * User displays brand,clicks on it and chooses urban casuals
          * User displays size,clicks on it and chooses S
          * User displays color,clicks on it and chooses black
          * User navigates to back for 1 time.
          * Verify that a product is visible


