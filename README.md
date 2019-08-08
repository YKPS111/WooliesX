# WooliesX
# WooliesX QA Code Challenge
# 
This repository is for showcasing the UI Automation skills for Woolworths.

## The Tech Stack used is as below
1. Java
2. Selenium
3. Cucumber
4. JavaDoc

## Task
1. Create an automated smoke test suite for the below Acceptance Criteria
Acceptance Criteria: I want to be able to add 2 items to the cart and place an order

## What is Page Object Model (POM)?
Page Object Model is a design pattern which has become popular in test automation for enhancing test maintenance and reducing code duplication. A page object is an object-oriented class that serves as an interface to a page.
The tests then use the methods of this page object class whenever they need to interact with the UI of that page, the benefit is that if the UI changes for the page, the tests themselves don’t need to be changed, only the code within the page object needs to change.
Subsequently all changes to support that new UI are located in one place.
  
## How to execute the Test
  - Clone the repo on to the local machine
  - Setup MavenPath and Java Path
  - Go into the repo folder and execute the command 
  ```
  mvn clean install
  ```
  - Execute the RunCukesTest file
  - The browser instance should come up and execute the tests

## Assumptions

1. To emulate real time user behavior, the flow starts with adding products to the cart and signing in in the later stages of the purchase. 
2. It is assumed that the user is already registered on the shopping site.

## Possible Enhancements
1. Can be integrated with reporting tools such as TestNG.
2. Could have more validations implemented.
