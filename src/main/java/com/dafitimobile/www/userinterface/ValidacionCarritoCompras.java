package com.dafitimobile.www.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidacionCarritoCompras {
    public static final Target PRODUCTOCARRITOCOMPRAS = Target.the("Producto en el carrito de compras").
            located(By.id("item_desc"));
}
