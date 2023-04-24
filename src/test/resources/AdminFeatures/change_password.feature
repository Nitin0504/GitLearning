Feature: Itecy Admin Change Password Feature

  Background: User logged into the application
    Given user launches the url and validates the application
    Then login as admin with "hr@clientservertech.com" and "Pass@123"
    When user click on the Login button
    Then user will Navigate to the Admin Dashbaord Page

  Scenario Outline: User Tries to change the Password
    Given Given user is on Admin Dashboard page
    When user click on "WelcomeTo!" drop down and click on change password
    Then User tries to change the Password "<Oldpassword>" "<Newpassword>" "<Confirmpassword>"
    And validate the Alert "<Alert>"

    Examples: 
      | Oldpassword | Newpassword | Confirmpassword | Alert                                    |                                                            |
      | Pass@123    |             |                 | New password Should Not be Null          |                                                            |
      |             | Pass@1234   | Pass@1234       | Current password Should Not be Null      |                                                            |
      | Pass@123    | Pass@123    | Pass@123        | Old and New Password should not be Same! |                                                            |
      | Pass@123    | Pass@12     | Pass@1234       | The new password and confirmation password does not match. |                                        | 
