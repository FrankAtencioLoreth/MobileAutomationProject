#language: en
Feature: Login

Scenario: Try to log in with not valid credentials
  Given User wants login
  When he sends his credentials
  Then he should see the dashboard