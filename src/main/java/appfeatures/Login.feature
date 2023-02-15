Feature: Login action feature

Scenario: User Login Scenario
  Given User is on Application Home Page
  When Application Page Title is 163
  Then User enters username and password
  And User clicks on Login Button
  When User navigate to user profile page

Scenario: Verify Duplicate Registration
  Given User is on Application Home Page
  When Application Page Title is 163
  Then User clicks on signup button
  Then User fills the signup form
  And User clicks on submit button
  Then Display already registration message
  Then Navigate to reset password page
