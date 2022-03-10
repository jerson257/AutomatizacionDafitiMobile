package com.dafitimobile.www.task;

import com.dafitimobile.www.userinterface.BusquedaArticulo;
import com.dafitimobile.www.userinterface.CompraProducto;
import com.dafitimobile.www.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarProductoCarrito implements Task {

    public static AgregarProductoCarrito agregar() {
        return Tasks.instrumented(AgregarProductoCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Click.on(CompraProducto.BOTONCOMPRAR),
                    Click.on(CompraProducto.TALLA),
                    Click.on(BusquedaArticulo.BOTONATRAS),
                    Click.on(HomePage.BOTONCARRITOCOMPRAS)
            );
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}