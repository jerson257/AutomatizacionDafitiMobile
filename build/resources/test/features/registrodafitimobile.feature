Feature: Registrarse en la app dafiti
  En este escenario de prueba se va a realizar el
  registro en la aplicacion de dafiti

  Scenario: Registro Dafiti
    Given ingresar en la APP de Dafiti
    When Registrarse con los datos
    |email              |password|documento|nombre|apellido|fecha_nacimiento|genero   |
    |jerson40@hotmail.com|123456  |12457896 |Andres|gomez   |25/04/1994      |Masculino|
    Then validar registro en dafiti