#Reporter : Senayda Akkaya
#US Priority : HIGH
  @US20
  Feature: As a registered user, when I forget my password, I want to create a new password and log in

    Background:
      * User clicks on profile button.
      * User clicks on SignIn button and displays the SignIn page

    Scenario: TC01 User should be able to see the Forgot Password link on the Login page and it should be active
      * User verifies Forgot Password button and clicks.

    Scenario: TC02 The user should ensure the textbox, Get OTP button, and Back to sign in button are visible
    and active on the Forgot Password page when clicking the link.
      * User verifies Forgot Password button and clicks.
      * User verifies Email button and clicks.
      * User verifies Get OTP button and clicks.
      * User verifies Back to SignIn button and clicks.

    Scenario: TC03 User should see and activate the New Password, Confirm Password text boxes on the Reset Password page
    and see and activate the Submit button and be able to access the homepage when entering a valid password.
      * User verifies Forgot Password button and clicks.
      * User verifies Email button and clicks.
      * User verifies Get OTP button and clicks.
      * User sees new Password text box on the Reset Password page and clicks.
      * User sees Confirm Password text box on the Reset Password page and clicks.
      * User verifies Submit button and clicks.
      * Verify that user navigates to back




