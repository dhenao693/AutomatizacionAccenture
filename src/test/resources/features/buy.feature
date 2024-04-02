  #language: en
  Feature: Buy

    Background:
      Given "Daniel" is on swaglabs app

    @login @userNotLogged @happyPath
    Scenario Outline: Buy product from home successfully
      When he login in app from profile
        | username   | password   | name   | lastname   | postalCode   |
        | <username> | <password> | <name> | <lastname> | <postalCode> |
      And select the product "<product>" to buy from home
      And go to pay the product
      Then see the confirmation buy text

      Examples:
        | username      | password     | product                           | name     | lastname | postalCode |
        | standard_user | secret_sauce | Camisa Sauce Labs Bolt            | Daniel   | Henao    | 00522      |
        | standard_user | secret_sauce | Camisa Test.allTheThings() (Roja) | Janselle | Rua      | 00523      |
        | standard_user | secret_sauce | Chamarra Sauce Labs               | Alison   | Martinez | 00552      |
        | standard_user | secret_sauce | Mochila Sauce Labs                | Adriana  | Henao    | 00922      |


    @login @userNotLogged @happyPath @run
    Scenario Outline: Buy product from product page successfully
      When he login in app from profile
        | username   | password   | name   | lastname   | postalCode   |
        | <username> | <password> | <name> | <lastname> | <postalCode> |
      And select the product "<product>" to buy from product page
      And go to pay the product
      Then see the confirmation buy text

      Examples:
        | username      | password     | product                | name   | lastname | postalCode |
        | standard_user | secret_sauce | Camisa Sauce Labs Bolt | Daniel | Henao    | 00522      |


    @login @userNotLogged @happyPath
    Scenario Outline: Buy product without label <withoutLabel>
      When he login in app from profile
        | username   | password   | name   | lastname   | postalCode   |
        | <username> | <password> | <name> | <lastname> | <postalCode> |
      And select the product "<product>" to buy from product page
      And go to pay the product without label "<withoutLabel>"
      Then see the message "<message>"

      Examples:
        | username      |  | password     | product                | name   | lastname | postalCode | withoutLabel | message |
        | standard_user |  | secret_sauce | Camisa Sauce Labs Bolt | Daniel | Henao    | 00522      | name         |         |
        | standard_user |  | secret_sauce | Camisa Sauce Labs Bolt | Daniel | Henao    | 00522      | lastname     |         |
        | standard_user |  | secret_sauce | Camisa Sauce Labs Bolt | Daniel | Henao    | 00522      | postalCode   |         |