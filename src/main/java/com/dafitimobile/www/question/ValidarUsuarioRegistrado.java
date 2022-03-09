package com.dafitimobile.www.question;

import com.dafitimobile.www.userinterface.ValidarRegistro;
import com.dafitimobile.www.util.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarUsuarioRegistrado implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Constantes.USUARIOLOGUEADO.equals(Text.of(ValidarRegistro.USUARIO).viewedBy(actor).asString());
    }

    public static ValidarUsuarioRegistrado verify(){
        return new ValidarUsuarioRegistrado();
    }
}
