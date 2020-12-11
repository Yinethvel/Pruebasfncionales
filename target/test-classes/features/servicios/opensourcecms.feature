@AutomatizacionOpenSourcecms
Feature:version de PHP

  Scenario Outline: Validar version de PHP
    Given Abrir url"<url>" en navegador
    When ingresar usuario"<usuario>"
    And Ingresar contraseña"<pass>"
    And Iniciar sesion
    Then validar actualizacion php


    Examples:
      | url                                                      | usuario       | pass          |
      | https://s1.demo.opensourcecms.com/wordpress/wp-login.php | opensourcecms | opensourcecms |

  Scenario Outline: Validar version de wor
    Given Abrir url"<url>" en navegador
    When ingresar usuario"<usuario>"
    And Ingresar contraseña"<pass>"
    And Iniciar sesion
    Then validar actualizacion wordPress


    Examples:
      | url                                                      | usuario       | pass          |
      | https://s1.demo.opensourcecms.com/wordpress/wp-login.php | opensourcecms | opensourcecms |

