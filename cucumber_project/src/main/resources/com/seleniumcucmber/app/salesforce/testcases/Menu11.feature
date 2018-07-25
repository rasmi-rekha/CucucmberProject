Feature:Testing the top menu.

In to work perform all operations after logging in
As a sales person
I want to check menu items
@Menu
Scenario Outline: Testing Top Menu
Given I am logged in "<BrowserType>"
And I click on "<HeaderLink>"
Then "<VerificationObject>" element should be present


Examples:
| BrowserType | HeaderLink |  
| Mozilla     | hometab    | Todaysevent
| Mozilla     | leadtab    | RecentlyViewed
