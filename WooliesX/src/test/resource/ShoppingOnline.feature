Feature: Online Shopping Experience

  Scenario Outline: Navigate to the web site search for two products add to cart and place an order.
    Given I navigate to the <URL>
    When I search for <SearchString>
    And I Click on 1st Product
    And I Click on Add to cart Button
	And I Click on 2nd Product
    And I Click on Add to cart Button
    And I Proceed to gotoCart Button
    Then I Click on Proceed to checkout
    And I Enter the emailaddress <emailaddress> 
    And I Enter the password <password>
    And I Click Sign in Button
    And I Click on Second Proceed to checkout
    And I Select Terms of service checkbox
    And I Click on Final Proceed to checkout
    And I Click on Pay by bank wire
    And I Click on I confirm my order Button
    And I Should see confirmation Text 
   
    Examples:
    | URL| SearchString | emailaddress | password | ConfirmationText |
    | http://automationpractice.com/index.php/ | Dresses | ykparthasarathy@gmail.com | Password@1 | Your order on My Store is complete. |
   
