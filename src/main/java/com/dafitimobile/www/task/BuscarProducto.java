package com.dafitimobile.www.task;

import com.dafitimobile.www.userinterface.BusquedaArticulo;
import com.dafitimobile.www.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscarProducto implements Task {

    private String producto;

    public BuscarProducto(String producto) {
        this.producto = producto;
    }

    public static BuscarProducto buscar(String producto) {
        return Tasks.instrumented(BuscarProducto.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BOTONBUSCAR),
                Enter.theValue(producto).into(BusquedaArticulo.BUSCAR),
                Click.on(BusquedaArticulo.SELECCIONARPRODUCTO)
        );
    }
}
