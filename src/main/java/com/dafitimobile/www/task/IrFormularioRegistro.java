package com.dafitimobile.www.task;

import com.dafitimobile.www.userinterface.CrearCuenta;
import com.dafitimobile.www.userinterface.HomePage;
import com.dafitimobile.www.userinterface.Registrarse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IrFormularioRegistro implements Task {

    public static IrFormularioRegistro registrarse(){
        return new IrFormularioRegistro();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BOTONMICUENTA),
                Click.on(Registrarse.BOTONREGISTRO),
                Click.on(CrearCuenta.BOTONCREARCUENTA)
        );
    }
}
