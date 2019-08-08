$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ApplyForNumberPlate.feature");
formatter.feature({
  "line": 1,
  "name": "Apply for a Number Plate in your preferred RTA",
  "description": "",
  "id": "apply-for-a-number-plate-in-your-preferred-rta",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Navigate to the web site search for two products add to cart and place an order.",
  "description": "",
  "id": "apply-for-a-number-plate-in-your-preferred-rta;navigate-to-the-web-site-search-for-two-products-add-to-cart-and-place-an-order.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I navigate to the \u003cURL\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search for \u003cSearchString\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I Click on 1st Product",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I Click on Add to cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I Click on 2nd Product",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I Click on Add to cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I Proceed to gotoCart Button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Click on Proceed to checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I Enter the emailaddress \u003cemailaddress\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I Enter the password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I Click Sign in Button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I Click on Second Proceed to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I Select Terms of service checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I Click on Final Proceed to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I Click on Pay by bank wire",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I Click on I confirm my order Button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I Should see confirmation Text",
  "keyword": "And "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "apply-for-a-number-plate-in-your-preferred-rta;navigate-to-the-web-site-search-for-two-products-add-to-cart-and-place-an-order.;",
  "rows": [
    {
      "cells": [
        "URL",
        "SearchString",
        "emailaddress",
        "password",
        "ConfirmationText"
      ],
      "line": 23,
      "id": "apply-for-a-number-plate-in-your-preferred-rta;navigate-to-the-web-site-search-for-two-products-add-to-cart-and-place-an-order.;;1"
    },
    {
      "cells": [
        "http://automationpractice.com/index.php/",
        "Dresses",
        "ykparthasarathy@gmail.com",
        "Password@1",
        "Your order on My Store is complete."
      ],
      "line": 24,
      "id": "apply-for-a-number-plate-in-your-preferred-rta;navigate-to-the-web-site-search-for-two-products-add-to-cart-and-place-an-order.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4811333741,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Navigate to the web site search for two products add to cart and place an order.",
  "description": "",
  "id": "apply-for-a-number-plate-in-your-preferred-rta;navigate-to-the-web-site-search-for-two-products-add-to-cart-and-place-an-order.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I navigate to the http://automationpractice.com/index.php/",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search for Dresses",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I Click on 1st Product",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I Click on Add to cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I Click on 2nd Product",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I Click on Add to cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I Proceed to gotoCart Button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Click on Proceed to checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I Enter the emailaddress ykparthasarathy@gmail.com",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I Enter the password Password@1",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I Click Sign in Button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I Click on Second Proceed to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I Select Terms of service checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I Click on Final Proceed to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I Click on Pay by bank wire",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I Click on I confirm my order Button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I Should see confirmation Text",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php/",
      "offset": 18
    }
  ],
  "location": "ShoppingOnline.iNavigateToThe(String)"
});
formatter.result({
  "duration": 10245194272,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dresses",
      "offset": 13
    }
  ],
  "location": "ShoppingOnline.iSearchFor(String)"
});
formatter.result({
  "duration": 2526448559,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingOnline.iClickOnFirstProductButton()"
});
formatter.result({
  "duration": 2639667144,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingOnline.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 9863264337,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingOnline.iClickOnSecondProductButton()"
});
formatter.result({
  "duration": 3189760076,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingOnline.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 10673373793,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingOnline.iClickOnGoToCartButton()"
});
formatter.result({
  "duration": 2137881315,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingOnline.iClickOnProceedToCheckOut()"
});
formatter.result({
  "duration": 2338979788,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ykparthasarathy@gmail.com",
      "offset": 25
    }
  ],
  "location": "ShoppingOnline.iEnterEmailAddress(String)"
});
formatter.result({
  "duration": 177033780,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password@1",
      "offset": 21
    }
  ],
  "location": "ShoppingOnline.iEnterPassword(String)"
});
formatter.result({
  "duration": 85459525,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingOnline.iClickOnSignInButton()"
});
formatter.result({
  "duration": 2226270030,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingOnline.iClickOnSecondProceedToCheckOut()"
});
formatter.result({
  "duration": 1715991775,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingOnline.iClickTermsandConditionsCheckBox()"
});
formatter.result({
  "duration": 75710726,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingOnline.iClickOnFinalProceedToCheckOut()"
});
formatter.result({
  "duration": 1489590573,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingOnline.iClickPaybyBankWire()"
});
formatter.result({
  "duration": 1600016784,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingOnline.iClickConfirmOrderButton()"
});
formatter.result({
  "duration": 2452530890,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingOnline.seeOrderConfirmation()"
});
formatter.result({
  "duration": 29366640,
  "status": "passed"
});
formatter.after({
  "duration": 1112196701,
  "status": "passed"
});
});