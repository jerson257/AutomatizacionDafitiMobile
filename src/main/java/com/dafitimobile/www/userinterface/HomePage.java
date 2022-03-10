package com.dafitimobile.www.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target BOTONMICUENTA = Target.the("Boton mi cuenta").
            located(By.id("navigation_account"));
    public static final Target BOTONBUSCAR = Target.the("Boton de la lupa de busqueda").
            located(By.id("search_button"));
    public static final Target BOTONCARRITOCOMPRAS = Target.the("Boton carrito de compras").
            located(By.id("cart_button"));
}
