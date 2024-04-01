  #language: en
  Feature: Login

    @login @userNotLogged @happyPath
    Scenario Outline: Login successfull
      Given "Daniel" is on swaglabs app
      When login in app
        | username   | password   |
        | <username> | <password> |
      Then see the correct username

      Examples:
        | username      | password     |
        | standard_user | secret_sauce |
