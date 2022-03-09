package com.dafitimobile.www.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioRegistro {
    public static final Target EMAIL = Target.the("ingresar Email").
            located(By.id("form_email"));
    public static final Target PASSWORD = Target.the("ingresar password").
            located(By.id("form_password"));
    public static final Target CONFIRMACIONPASSWORD = Target.the("ingresar confirmacion password").
            located(By.id("form_password_confirm"));
    public static final Target TIPODOCUMENTO = Target.the("Seleccionar tipo de documento").
            located(By.id("form_document_type"));
    public static final Target CC = Target.the("Seleccionar tipo de documento CC").
            located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]"));
    public static final Target DOCUMENTO = Target.the("ingresar documento").
            located(By.id("form_identification"));
    public static final Target NOMBRE = Target.the("ingresar nombre").
            located(By.id("form_first_name"));
    public static final Target APELLIDO = Target.the("ingresar apellido").
            located(By.id("form_last_name"));
    public static final Target FECHANACIMIENTO = Target.the("ingresar fecha nacimiento").
            located(By.id("form_birthday"));
    public static final Target GENERO = Target.the("seleccionar genero").
            located(By.id("form_gender"));
    public static final Target MASCULINO = Target.the("seleccionar genero masculino").
            located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]"));
    public static final Target BOTONGUARDAR = Target.the("boton registrar usuario").
            located(By.id("register_button"));

}
