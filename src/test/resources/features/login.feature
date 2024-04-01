  #language: en
  Feature: Login

    Background:
      Given "Daniel" is on swaglabs app

    @login @userNotLogged @happyPath
    Scenario Outline: Login successfull
      When he login in app from profile
        | username   | password   |
        | <username> | <password> |
      Then see the home page to buy

      Examples:
        | username      | password     |
        | standard_user | secret_sauce |

    @login @userNotLogged @unhappyPath
    Scenario Outline: Login failed for <failedType>
      When he login in app from profile
        | username   | password   |
        | <username> | <password> |
      Then see the message "El usuario y contraseña no coinciden con ningun usuario en este servicio."

      Examples:
        | username      | password        | failedType |  |
        | dhenaofailed  | secret_sauce    | username   |  |
        | standard_user | 123456789Failed | password   |  |

    @login @userNotLogged @unhappyPath @run
    Scenario Outline: Login without <fieldDoNotFill>
      When login in app without "<fieldDoNotFill>"
        | username   | password   |
        | <username> | <password> |
      Then see the message "<message>"
      Examples:
        | username           | password        | fieldDoNotFill | message                 |
        | dhenao@yopmail.com | 123456789Failed | username       | Usuario es requerido    |
        | dhenao@yopmail.com | 123456789Failed | password       | Contraseña es requerida |

    @login @userNotLogged @unhappyPath
    Scenario Outline: Login without all
      When login in app without all
        | username   | password   |
        | <username> | <password> |
      Then see the message "Usuario es requerido"

      Examples:
        | username           | password        |
        | dhenao@yopmail.com | 123456789Failed |