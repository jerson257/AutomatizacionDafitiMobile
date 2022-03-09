package com.dafitimobile.www.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.dafitimobile.www.stepdefinitions",
        features = "src/test/resources/features/registrodafitimobile.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerRegistroDafiti {
}
