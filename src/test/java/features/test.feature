Feature: Comprar prendas
  como usuario me quiero loguear y comprar dos productos ir a carrito de compras, ver los productos, pagar y finalizar la compra

  Scenario: Realizar la compra de dos productos
    Given El usuario se encuentra en la pagina de inicio
    When Ingresa los datos de acceso y se loguea
    And agrega dos productos al carrito de compras
    And completa el formulario de compra
    And se finaliza la compra
    Then Se confirma la compra de los productos
