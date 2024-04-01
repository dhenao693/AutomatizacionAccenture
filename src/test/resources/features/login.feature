  #language: en
  Feature: Login

    @login @userNotLogged @happyPath
    Scenario Outline: Login successfull
      Given "Daniel" is on swaglabs app
      When he login in app from profile
        | email   | password   |
        | <email> | <password> |
      Then see the home page to buy

      Examples:
        | email         | password     |
        | standard_user | secret_sauce |
