package com.dafitimobile.www.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BusquedaArticulo {
    public static final Target BUSCAR = Target.the("Campo para buscar producto").
            located(By.id("search_input"));
    public static final Target SELECCIONARPRODUCTO = Target.the("seleccionar producto buscado").
            located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.RelativeLayout"));
    public static final Target BOTONATRAS = Target.the("Boton salir de la busqueda").
            located(By.id("back_button"));
}
