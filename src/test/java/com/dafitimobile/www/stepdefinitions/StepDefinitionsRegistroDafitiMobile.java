package com.dafitimobile.www.stepdefinitions;

import com.dafitimobile.www.question.ValidarUsuarioRegistrado;
import com.dafitimobile.www.task.IrFormularioRegistro;
import com.dafitimobile.www.task.LlenarFormularioRegistro;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

public class StepDefinitionsRegistroDafitiMobile {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Jerson");
    }

    @Given("ingresar en la APP de Dafiti")
    public void ingresarAlRegistroUsuarios() {
        OnStage.theActorInTheSpotlight().attemptsTo(IrFormularioRegistro.registrarse());
    }
    @When("Registrarse con los datos")
    public void registrarUsuario(List<Map<String, String>> listaDatos) {
        Map<String, String> mapaUsuario = listaDatos.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormularioRegistro.registrar(mapaUsuario.get("email"),mapaUsuario.get("password"),
                mapaUsuario.get("password"),mapaUsuario.get("nombre"),mapaUsuario.get("apellido"),mapaUsuario.get("documento"),mapaUsuario.get("fecha_nacimiento")));
    }
    @Then("validar registro en dafiti")
    public void validarRegistroUsuario() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarUsuarioRegistrado.verify()));
    }
}
