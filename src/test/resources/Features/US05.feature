#Reporter : Hümeyra Tayfun
#US Priority : HIGHEST
  Feature: As a registered user, I would like to be able to log in with the information I registered with (email/phone and password).

    Scenario: TC01 It should be possible to log in to the system
         when valid information is entered in the login form and the signIn button is clicked.

      * User clicks on profile button.
      * User clicks on signIn button
      * User chooses -*Use email instead- and clicks on email box then enters a valid email "humeyraEmail"
      * User displays password box,clicks on it and enter a valid "password"
      * User clicks on sign in button


      Scenario: TC02 User should not enter with invalid email information in the login form

        * User clicks on profile button.
        * User clicks on signIn button
        * User chooses -*Use email instead- and clicks on email box then enters a valid email "invalidEmail"
        * User displays password box,clicks on it and enter a valid "password"
        * User clicks on sign in button

        Scenario: TC03 User should not enter with an invalid password information in the login form
          * User clicks on profile button.
          * User clicks on signIn button
          * User chooses -*Use email instead- and clicks on email box then enters a valid email "humeyraEmail"
          * User displays password box,clicks on it and enter a valid "invalidPassword"
          * User clicks on sign in button

        Scenario: TC04 User should be able to access the Forgot Password page from the Login page.
          * User clicks on profile button.
          * User clicks on signIn button
          * User displays forgot password link and clicks on it
          * Verify that user can access the forgot password page from the login page


        Scenario: TC05 It should be possible to switch from the Login page to the Register page.
          * User clicks on profile button.
          * User clicks on signIn button
          * User clicks on signUp button and displays the signUp page






