Feature: Itecy Admin logout Feature

  Background: User logged into the application
    Given user launches the url and validates the application
    Then login as admin with "hr@clientservertech.com" and "Pass@123"
    When user click on the Login button
    Then user will Navigate to the Admin Dashbaord Page

  Scenario: validate Itecy logout
    Given user is on Admin Dashboard page
    When user click on "WelcomeTo!" drop down and Click on Log out
    Then user should be able to view login page for admin panel
