package com.dafitimobile.www.question;

import com.dafitimobile.www.userinterface.ValidacionCarritoCompras;
import com.dafitimobile.www.util.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarProductoCarrito implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Constantes.PRODUCTOCARRITO.equals(Text.of(ValidacionCarritoCompras.PRODUCTOCARRITOCOMPRAS).viewedBy(actor).asString());
    }

    public static ValidarProductoCarrito verify(){
        return new ValidarProductoCarrito();
    }
}
