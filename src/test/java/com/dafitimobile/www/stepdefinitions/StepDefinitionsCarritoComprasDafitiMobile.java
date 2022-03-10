package com.dafitimobile.www.stepdefinitions;

import com.dafitimobile.www.question.ValidarProductoCarrito;
import com.dafitimobile.www.task.AgregarProductoCarrito;
import com.dafitimobile.www.task.BuscarProducto;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StepDefinitionsCarritoComprasDafitiMobile {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Jerson");
    }

    @Given("buscar el producto a comprar {string}")
    public void buscarproducto(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProducto.buscar(producto));
    }

    @When("agregar producto al carrito de compras")
    public void agregarProductoAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProductoCarrito.agregar());
    }

    @Then("validar producto en el carrito de compras")
    public void validarProductoEnElCarritoDeCompras() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarProductoCarrito.verify()));
    }
}
