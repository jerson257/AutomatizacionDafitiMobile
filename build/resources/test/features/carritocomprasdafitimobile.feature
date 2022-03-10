Feature: Agregar producto carrito de compras
  En este escenario se probara la funcionalidad de agregar productos
  al carrito de compras

  Scenario: Agregar producto al carrito de compras
    Given buscar el producto a comprar "Tenis Lifestyle Negro-Gris-Rojo-Blanco Nike Air Max SC"
    When agregar producto al carrito de compras
    Then validar producto en el carrito de compras