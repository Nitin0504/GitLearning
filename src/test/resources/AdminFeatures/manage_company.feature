Feature: Itecy Manage Company Feature

  Background: User logged into the application
    Given user launches the url and validates the application
    Then login as admin with "hr@clientservertech.com" and "Pass@123"
    When user click on the Login button
    Then user will Navigate to the Admin Dashbaord Page

  Scenario Outline: validate Itecy manage and view company scenario
    Given user is on Admin Dashboard page
    When user click on Manage Company
    Then user should access View Companies page
    Then user click on Add Company and validate Add Company page is displayed
    Then user enters "<Company Name>""<Tag Line>""<Industry>""<Company CEO>""<Email>""<Phone No.>""<URL>""<Foundation Date>""<Strength>""<Location>""<Address>""<Zip Code>""<Summary>"

    Examples: 
      | Company Name        | Tag Line    | Industry | Company CEO | Email                           | Phone No.  | URL                     | Foundation Date | Strength | Location  | Address   | Zip Code | Summary     |
      | Testing computers12 | IT services | IT       | Soundarya   | agrlovee.a@clientservertech.com | 9948756757 | https://www.testing.com | 12/12/2018      |        6 | hyderabad | hyderabad |   521002 | IT services |
      |                     |             |          |             |                                 |            |                         |                 |          |           |           |          |             |
