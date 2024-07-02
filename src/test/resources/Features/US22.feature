#Reporter : Hümeyra Tayfun
#US Priority : MEDIUM
  Feature: As a registered user, I would like to have a page about the orders I want to return and be able to manage my product returns.

    Scenario: A registered user should be able to return products

      * User logs in "humeyraEmail".
      * User clicks on profile button.
      * User displays order history pages and clicks on it
      * User clicks on action button
      * User displays return request button and clicks on it
      * User chooses her product
      * User clicks on return reason and chooses other
      * User clicks on return note and enter "returnNote"
      * User displays request return and clicks on it
      * Verify that the return process has been started




