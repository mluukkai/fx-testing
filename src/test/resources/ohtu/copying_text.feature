Feature: As a user I want to be able to copy text from left to right textfield

  Scenario: Text can be copied
    Given Text "foobar" is written to left textfield
    When Button is clicker
    Then Text "foobar" is copied to right textfield

  Scenario: Another text can be copied
    Given Text "toinen koeteksti" is written to left textfield
    When Button is clicker
    Then Text "toinen koeteksti" is copied to right textfield