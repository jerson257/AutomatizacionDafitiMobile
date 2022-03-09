package com.dafitimobile.www.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target BOTONMICUENTA = Target.the("Boton mi cuenta").
            located(By.id("navigation_account"));
}
