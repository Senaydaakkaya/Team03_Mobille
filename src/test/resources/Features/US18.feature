#Reporter : Hümeyra Tayfun
#US Priority : HIGH
  Feature: As a registered user, I want to change my password on my dashboard page
@18
    Scenario: TC01 User should be able to edit his/her information
             on the Edit Profile page when clicked on the dashboard page

      * User logs in "humeyraEmail".
      * User clicks on profile button.
      * User displays edit profile link and clicks on it
      * User displays full name box,clicks and sends " newFullName"
      * User displays email box,clicks and send "newEmail"
      * User displays phone box,clicks and send "newPhone"
      * User displays save change button and clicks on it
      * Verify that all changes are saved


