
Feature: Interacciones con MercadoLibre

  #Ejercicio 1

  @mercadoLibre @CP001
  Scenario: Navegar en la categoria Construccion, Ver, Baño, Sanitarios Nuevo y Griferia para Baño
    Given Se ingresa a incio de MercadoLibre
    When Presiono sobre el menu desplegable Categorias
    And Presiono sobre la categoria Construccion
    And Presiono sobre Ver mas
    And Presiono sobre Mobiliario para Baños
    And Presiono sobre Griferia para Baño
    Then Valido el titulo Griferia para Baño

  @mercadoLibre @CP002
  Scenario: Navegar en la categoria Tecnologia y accesorios para celulares
    Given Se ingresa a incio de MercadoLibre
    When Presiono sobre el menu desplegable Categorias
    And Presiono sobre la categoria Tecnologia
    And Presiono sobre accesorios para celulares
    Then valido el titulo Celulares y Telefonia
    And valido el titulo Accesorios para Celulares

  @mercadoLibre @CP003
  Scenario: Navegar en Ofertas
    Given Se ingresa a incio de MercadoLibre
    When Presiono sobre la categoria Ofertas
    And Presiono sobre Ofertas del dia
    Then valido el titulo Ofertas del dia

  @mercadoLibre @CP004
  Scenario: Navegar en Supermercado
    Given Se ingresa a incio de MercadoLibre
    When Presiono sobre la categoria Supermercado
    And Presiono sobre Cafeteria
    Then valido el titulo Cafeteria

     #Ejercicio 2

  @mercadoLibre @CP101
  Scenario: Navegar en la categoria Vehiculos
    Given Se ingresa a incio de MercadoLibre
    When Presiono sobre el menu desplegable Categorias
    And Presiono sobre la categoria Vehiculos
    And Selecciono la Marca Suzuki
    And Ingreso precio Minimo "6500000"
    And Ingreso precio Maximo "15000000"
    And Aplico el filtro
    Then Valido la cantidad de resultados

  @mercadoLibre @CP102
  Scenario: Navegar en la categoria Inmuebles
    Given Se ingresa a incio de MercadoLibre
    When Presiono sobre el menu desplegable Categorias
    And Presiono sobre la categoria Inmuebles
    And Selecciono las Propiedades Usadas
    And Ingreso precio Minimo "150000000"
    And Ingreso precio Maximo "350000000"
    And Aplico el filtro
    Then Valido cantidad de resultados
