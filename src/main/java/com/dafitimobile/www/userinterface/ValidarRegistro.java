package com.dafitimobile.www.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidarRegistro {

    public static final Target BOTONIRAPP = Target.the("Boton ir a la app").
            located(By.xpath("//android.view.View[@content-desc='IR AL APP']/android.widget.TextView"));
    public static final Target USUARIO = Target.the("validar usuario").
            located(By.id("account_email"));
}
