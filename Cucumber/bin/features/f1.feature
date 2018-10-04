@FunctionalTest
Feature: Testing tags behavior

@SmokeTest @RegressionTest
Scenario: Successful Login
Given ONE

@RegressionTest
Scenario: UnSuccessful Login
Given TWO

@SmokeTest 
Scenario: Add a product to bag
Given THREE

Scenario: Add multiple product to bag
Given FOUR

@SmokeTest @RegressionTest
Scenario: Remove a product from bag
Given FIVE

@RegressionTest
Scenario: Remove all products from bag
Given SIX

@SmokeTest
Scenario: Increase product quantity from bag page
Given SEVEN

Scenario: Decrease product quantity from bag page
Given EIGHT

@SmokeTest @End2End
Scenario: Buy a product with cash payment
Given NINE

@SmokeTest @End2End
Scenario: Buy a product with CC payment
Given TEN

@End2End
Scenario Outline: Payment declined
Given ELEVEN <PaymentMethod>
Examples:
|PaymentMethod|
|CC Card|
|DD Card|