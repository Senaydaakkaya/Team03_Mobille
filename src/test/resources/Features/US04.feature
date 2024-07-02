#Reporter : İhsan Altunışık
#US Priority : HIGHEST
  Feature: As a user, I would like to be able to register on the site to take advantage of its functions
    Background: User is directed to the signup page.
      * User clicks on profile button.
      * User clicks on signUp button and displays the signUp page
      Scenario: User should sign up with correct information.
        * User clicks on name box and enters a valid name.
        * User chooses -*Use email instead- and clicks on email box then enters a valid email.
        * User clicks on password box and enters a valid password.
        * User clicks on signUp button and verifies that he-she registered.

      Scenario: User should not sign up without filling in the spaces that need to be filled.
        * User chooses -*Use email instead- and clicks on email box then enters a valid email.
        * User clicks on password box and enters a valid password.
        * User clicks on signUp button and verifies that he-she did not registered.

      Scenario: User should not sign up without filling in the spaces that need to be filled.
        * User clicks on name box and enters a valid name.
        * User clicks on password box and enters a valid password.
        * User clicks on signUp button and verifies that he-she did not registered.

      Scenario: User should not sign up without filling in the spaces that need to be filled.
        * User clicks on name box and enters a valid name.
        * User chooses -*Use email instead- and clicks on email box then enters a valid email.
        * User clicks on signUp button and verifies that he-she did not registered.

      Scenario: User should not sign up without entering the correct phone number.
        * User clicks on name box and enters a valid name.
        * User clicks on phoneBox and enters an invalid phone number.
        * User clicks on password box and enters a valid password.
        * User clicks on signUp button and verifies that he-she did not registered2.

      Scenario: User should not sign up with incorrect email criteria.
        * User clicks on name box and enters a valid name.
        * User chooses -*Use email instead- and clicks on email box then enters an invalid email.
        * User clicks on password box and enters a valid password.
        * User clicks on signUp button and verifies that he-she did not registered2.

      Scenario: User should not sign up with incorrect password criteria.
        * User clicks on name box and enters a valid name.
        * User chooses -*Use email instead- and clicks on email box then enters a valid email.
        * User clicks on password box and enters an invalid password.
        * User clicks on signUp button and verifies that he-she did not registered2.