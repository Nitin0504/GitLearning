Feature: Itecy Background Login Feature
  
  Scenerio Outline: User logged into the application
    Given user launches the url and validate the application
    Then login as admin with "<hr@clientservertech.com>" and "<Pass@123>"
    When user click on the Login button
    Then user will Navigate to the Admin Dashbaord Page
