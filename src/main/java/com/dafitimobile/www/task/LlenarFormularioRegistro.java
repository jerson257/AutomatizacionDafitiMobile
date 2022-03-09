package com.dafitimobile.www.task;

import com.dafitimobile.www.userinterface.FormularioRegistro;
import com.dafitimobile.www.userinterface.ValidarRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LlenarFormularioRegistro implements Task {

    private String email;
    private String contrasena;
    private String confirmarContrasena;
    private String nombre;
    private String apellidos;
    private String documento;
    private String fechaNacimiento;

    public LlenarFormularioRegistro(String email, String contrasena, String confirmarContrasena, String nombre,
                                    String apellidos, String documento,
                                    String fechaNacimiento) {
        this.email = email;
        this.contrasena = contrasena;
        this.confirmarContrasena = confirmarContrasena;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
    }

    public static LlenarFormularioRegistro registrar(String email, String contrasena, String confirmarContrasena, String nombre,
                                                     String apellidos, String documento,
                                                     String fechaNacimiento) {
        return Tasks.instrumented(LlenarFormularioRegistro.class, email, contrasena, confirmarContrasena, nombre, apellidos,
                documento, fechaNacimiento);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(FormularioRegistro.EMAIL),
                Enter.theValue(contrasena).into(FormularioRegistro.PASSWORD),
                Enter.theValue(confirmarContrasena).into(FormularioRegistro.CONFIRMACIONPASSWORD),
                Click.on(FormularioRegistro.TIPODOCUMENTO),
                Click.on(FormularioRegistro.CC),
                Enter.theValue(documento).into(FormularioRegistro.DOCUMENTO),
                Enter.theValue(nombre).into(FormularioRegistro.NOMBRE),
                Enter.theValue(apellidos).into(FormularioRegistro.APELLIDO),
                Enter.theValue(fechaNacimiento).into(FormularioRegistro.FECHANACIMIENTO),
                Click.on(FormularioRegistro.GENERO),
                Click.on(FormularioRegistro.MASCULINO),
                Click.on(FormularioRegistro.BOTONGUARDAR)
        );
        try {
            Thread.sleep(10000);
            actor.attemptsTo(
                    Click.on(ValidarRegistro.BOTONIRAPP)
            );
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
