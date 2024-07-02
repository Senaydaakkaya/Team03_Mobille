#Reporter : Azim Kaya
#US Priority : HIGH
  Feature: As a registered user, I want to be able to log out of the system securely

    Scenario:The registered user should be able to see the homepage icon, see the Logout link in the dashboard sidebar and logout from the site when clicked.
      * User logs in "azimEmail".
      * User clicks on profile button.
      * Logout link is displayed in Dashboard sidebar and it is verified to be active.
      * The logout link is clicked and it is verified that you can successfully log out of the site.