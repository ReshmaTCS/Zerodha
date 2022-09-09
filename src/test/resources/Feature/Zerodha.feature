Feature: To test login functionality of zerodha
Scenario Outline: verify zerodha login sucessfully with valid data
Given Browser is open on chrome
And User is on login page
When User enters <UN> and <PWD>
And Click on login btn
Then User navigate to login2 page and enter <PIN>
And Click on continue btn
Then Verify login sucessfully with <userid>
Examples: 
          |UN|PWD|PIN|userid|
          |DPG458|Amol@1234|171992|DPG458|


