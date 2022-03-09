package com.dafitimobile.www.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearCuenta {
    public static final Target BOTONCREARCUENTA = Target.the("Boton para crear cuenta").
            located(By.id("create_account"));
}
