Feature: To validate the login function of gmail
Scenario: To vaildate the username
Given To launch the chrome browser and window maximize
When To launch the url of gmail
And To pass the username in email field
And To click the next button
And To check the Credentials
Then To close the browser

Scenario Outline: user to validate the combination of username
Given user launch the chrome browser and window maximize
When user hit the url
And user send the username "<emaildatas>" in email field
And user click the next button
And user to check the credentials of result
Then user to close the browser

Examples:

|emaildatas|
|rajamaniselvam45gmail.com|
|sejkcfhhuih@gmail.com|
|fhshqqwujskuwuj@gmail.com|


