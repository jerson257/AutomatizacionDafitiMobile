package com.dafitimobile.www.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Registrarse {
    public static final Target BOTONREGISTRO = Target.the("Boton para registrarse").
            located(By.id("account_email"));
}
