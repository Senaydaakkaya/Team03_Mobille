#Reporter : Reyyan Mert
#US Priority : HIGH

  Feature: As a registered user, I want to change the password on my dashboard page.
    Scenario Outline:Pozitif Password

      * User logs in "reyyanEmail".
      * User clicks on profile button.
      * On the Control Panel page, verify that the Change Password button appears and is clickable.
      * Enter your current "<password>" in the old password box, "<newpassword1>" in the New password box, and "<newpassword2>" in the Confirm password box.
      * Verify that the password has been updated.

      Examples:
      |password   |newpassword1|newpassword2|
      |Query.2904 |Query.2905  |Query.2905  |

   Scenario Outline:Negatif Password

      * User logs in "reyyanEmail".
      * User clicks on profile button.
      * Enter your current "<password>" in the old password box, "<newpassword1>" in the New password box, and "<invalidpassword>" in the Confirm password box.
      * Verify that Password not matched text is visible.

      Examples:
        |password   |newpassword1|invalidpassword|
        |Query.2904 |Query.2906  |Query.2907  |