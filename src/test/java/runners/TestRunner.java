package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",       // Ruta a tus archivos .feature
        glue = "steps",                                // Paquete donde están tus Step Definitions
        tags = "@CP101",                               // Tag que quieres ejecutar
        plugin = {
                "pretty",                              // Salida en consola legible
                "html:target/cucumber-reports.html",   // Genera un reporte HTML
                "json:target/cucumber-reports.json"    // Genera un reporte JSON
        },
        monochrome = true                              // Hace más legible la salida en consola
)
public class TestRunner {
}
